package com.cys.veterinarioapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class ShotAdapter(val shotList:ArrayList<Shot>):RecyclerView.Adapter<ShotAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bingItems(shot: Shot){
            val id = itemView.findViewById<TextView>(R.id.shot_id)
            val name = itemView.findViewById<TextView>(R.id.nameShot)
            val taken = itemView.findViewById<ToggleButton>(R.id.toggle)

            name.text = shot.name.toString()
                if (shot.taken)
                    taken.isChecked = true
            taken.isEnabled = false

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ShotAdapter.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.shot, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bingItems(shotList[position])
    }

    override fun getItemCount(): Int {
        return shotList.size
    }

}