package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(var activity: MainActivity): RecyclerView.Adapter<ItemViewHolder>() {
    var models= listOf<User>()
    fun setData(list:List<User>){
       models=list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val item=LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ItemViewHolder(item)
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.populate(models[position],activity,position)

    }
}