package com.cys.veterinarioapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsVeterinarioAdapter(val newsList: ArrayList<NewsVeterinario>):
    RecyclerView.Adapter<NewsVeterinarioAdapter.ViewHolder>() {

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindItem(newsVeterinario:NewsVeterinario){
            val image = itemView.findViewById<ImageView>(R.id.newsImage)
            val id = itemView.findViewById<TextView>(R.id.new_date)
            val title = itemView.findViewById<TextView>(R.id.new_title)
            val resume = itemView.findViewById<TextView>(R.id.new_resume)

            title.text = newsVeterinario.title.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.newsitem, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(newsList[position])
    }

    override fun getItemCount(): Int {
        return newsList.size
    }
}