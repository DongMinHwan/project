package com.example.listview_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var domainList = arrayListOf<Domain>(
        Domain("naver","www.naver.com","네이버"),
        Domain("google","www.google.com","구글"),
        Domain("nate","www.nate.com","네이트"),
        Domain("gitgub","www.github.com",explan = "github")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val domainAdapter = MainListAdapter(this,domainList)
        mainListView.adapter = domainAdapter

    }
}