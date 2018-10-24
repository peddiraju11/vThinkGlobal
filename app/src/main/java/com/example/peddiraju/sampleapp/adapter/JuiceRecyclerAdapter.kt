package com.example.peddiraju.sampleapp.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.peddiraju.sampleapp.R
import com.example.peddiraju.sampleapp.model.JuiceTypes
import kotlinx.android.synthetic.main.layout_list_items.view.*

class JuiceRecyclerAdapter(private val employee: ArrayList<JuiceTypes>, private val activity: Context) :
    RecyclerView.Adapter<JuiceRecyclerAdapter.EmployeeHolder>() {

    override fun getItemCount(): Int {
        return employee.size
    }

    override fun onBindViewHolder(holder: JuiceRecyclerAdapter.EmployeeHolder, position: Int) {
        val itemNews = employee[position]
        holder.bindNews(itemNews)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JuiceRecyclerAdapter.EmployeeHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.layout_list_items, parent, false);
        //  val inflatedView = parent.inflate(R.layout.layout_list_items)
        return EmployeeHolder(inflatedView)
    }

    class EmployeeHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        private var view: View = v
        private var news: JuiceTypes? = null
        val txt_name = view.textView


        init {
            v.setOnClickListener { this }

        }

        override fun onClick(v: View?) {
            Log.d("RecyclerView", "CLICK!")
        }

        fun bindNews(employee: JuiceTypes) {


            view.textView.text = employee.name
        }
    }


}