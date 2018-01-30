package com.codility.staggered

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

/**
 * Created by Govind on 1/30/2018.
 */
class StaggeredAdapter(private val staggeredList: ArrayList<Staggered>) : RecyclerView.Adapter<StaggeredAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(staggeredList[position])
    }

    override fun getItemCount(): Int {
        return staggeredList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): StaggeredAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent!!.context).inflate(R.layout.item_list, parent, false))
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(staggered: Staggered) {
            val textView = itemView.findViewById<TextView>(R.id.tvName)
            val imageView = itemView.findViewById<ImageView>(R.id.imageView)
            textView.text = staggered.name;

            Glide.with(itemView.context).load(staggered.imageUrl)
                    //.thumbnail(0.5f)
                    .into(imageView);
        }
    }
}