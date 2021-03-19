package com.example.recyclerview
import android.view.View
import android.view.animation.TranslateAnimation
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ItemViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        private val title:TextView=itemView.tvTitle
        private val description:TextView=itemView.tvDescription
    fun populate(user: User,activity: MainActivity,position: Int) {
        title.text=user.title
        description.text=user.description
        itemView.setOnClickListener { activity.itemClicked(user,position) }


    }
}