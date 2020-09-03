package com.example.listview_test

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import java.security.AccessControlContext

class MainListAdapter (val context: Context, val domainList: ArrayList<Domain>) : BaseAdapter() {



    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.main_lv_item, null)

        val domainName = view.findViewById<TextView>(R.id.name)
        val domainDomain = view.findViewById<TextView>(R.id.Domain)
        val domainExplan = view.findViewById<TextView>(R.id.explan)

        val domain = domainList[position]

        domainName.text=domain.name
        domainDomain.text =domain.adress
        domainExplan.text=domain.explan
        return view


    }

    override fun getItem(position: Int): Any {
        return domainList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return domainList.size
    }

}