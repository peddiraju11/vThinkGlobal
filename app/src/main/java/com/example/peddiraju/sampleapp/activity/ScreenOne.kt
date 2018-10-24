package com.example.peddiraju.sampleapp.activity

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.peddiraju.sampleapp.R
import com.example.peddiraju.sampleapp.R.id.navigation_back
import com.example.peddiraju.sampleapp.R.id.recyclerView
import com.example.peddiraju.sampleapp.adapter.JuiceRecyclerAdapter
import com.example.peddiraju.sampleapp.model.JuiceTypes
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_screen_one.*
import kotlinx.android.synthetic.main.app_title_bar.*

class ScreenOne : Activity() {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var mAdapter: JuiceRecyclerAdapter
    private lateinit var listdata: ArrayList<JuiceTypes>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_one)



        linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        listdata = ArrayList()
        mAdapter = JuiceRecyclerAdapter(listdata, this)
        recyclerView?.layoutManager = linearLayoutManager
        recyclerView?.adapter = mAdapter

        listdata.add(JuiceTypes("Remove Banana", false))
        listdata.add(JuiceTypes("Remove Orange Juice", false))
        listdata.add(JuiceTypes("Remove Orange Sherbat", false))
        listdata.add(JuiceTypes("Remove Peach Slices", false))
        listdata.add(JuiceTypes("Remove Vitamin + Zinc Boost", false))


        // listdata.addAll(list)
        mAdapter.notifyDataSetChanged()

        // button is the Button id
        navigation_back!!.setOnClickListener {
            finish()
        }
    }
}
