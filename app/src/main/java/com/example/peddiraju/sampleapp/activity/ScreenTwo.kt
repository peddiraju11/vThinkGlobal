package com.example.peddiraju.sampleapp.activity

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.example.peddiraju.sampleapp.R
import com.example.peddiraju.sampleapp.expandablelist.ExpandableList
import com.example.peddiraju.sampleapp.expandablelist.ExpandableListAdapter
import com.example.peddiraju.sampleapp.expandablelist.INode
import com.example.peddiraju.sampleapp.items.Header1
import com.example.peddiraju.sampleapp.items.Item
import com.example.peddiraju.sampleapp.model.SimpleDividerItemDecoration
import kotlinx.android.synthetic.main.activity_screen_two.*

class ScreenTwo : Activity(), ExpandableListAdapter.Listener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_two)

        recyclerView2.setAdapter(ExpandableListAdapter(this, createList(), this))
        recyclerView2.addItemDecoration( SimpleDividerItemDecoration(this))

    }

    private fun createList(): ExpandableList {
        val list = ExpandableList()
        for (i in 0..4) {
            // first level (root nodes)
            val header1 = Header1(i)
            for (j in 0..3) {
                // second level
                val header2 = Item(j)
                /* for (int k = 0; k < 3; k++) {
                    // third level
                    Header3 header3 = new Header3(k);
                    for (int n = 0, count = (int) (6 * Math.random() + 2); n < count; n++) {
                        // fourth level
                        header3.insert(new Item(n));
                    }
                    header2.insert(header3);
                }*/
                header1.insert(header2)
            }
            list.insert(header1)
        }
        Log.d("MainActivity", list.toString())
        return list
    }

    override fun onListItemClick(pos: Int, item: INode?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
