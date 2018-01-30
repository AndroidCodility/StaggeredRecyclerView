package com.codility.staggered

import java.io.Serializable

/**
 * Created by Govind on 1/30/2018.
 */
class Staggered(val imageUrl: String, val name: String) : Serializable {

    companion object {

        fun getStaggeredList(): List<Staggered> {
            val staggeredList = ArrayList<Staggered>()
            staggeredList.clear()
            staggeredList.add(Staggered("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/one.jpg", "One"))
            staggeredList.add(Staggered("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/two.jpg", "Two"))
            staggeredList.add(Staggered("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/three.jpg", "Three"))
            staggeredList.add(Staggered("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/four.jpg", "Four"))
            staggeredList.add(Staggered("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/five.jpg", "Five"))
            staggeredList.add(Staggered("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/six.jpg", "Six"))
            staggeredList.add(Staggered("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/seven.jpg", "Seven"))
            staggeredList.add(Staggered("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/eight.jpg", "Eight"))
            staggeredList.add(Staggered("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/nine.jpg", "Nine"))
            staggeredList.add(Staggered("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/ten.jpg", "Ten"))
            return staggeredList
        }
    }
}