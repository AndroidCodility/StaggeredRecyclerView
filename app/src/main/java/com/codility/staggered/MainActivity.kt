package com.codility.staggered

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


/**
 * Created by Govind on 1/30/2018.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayStaggeredList()
    }

    private fun displayStaggeredList() {
        val staggered = ArrayList<Staggered>()
        staggered.addAll(Staggered.getStaggeredList())
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.adapter = StaggeredAdapter(staggered)
    }
}
