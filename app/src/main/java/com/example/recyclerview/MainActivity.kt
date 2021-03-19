package com.example.recyclerview

import android.os.Bundle
import android.view.View
import android.view.animation.TranslateAnimation
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item.*

class MainActivity:AppCompatActivity() {
    var n=0

    private val adapter=ListAdapter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter=adapter
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        setData(0)

    }
    private val models:MutableList<User> = mutableListOf()
    private fun setData(position: Int){

        repeat(position+1){
            n++
           val model=User()
            model.title="Title $n"
            model.description="This is $n description"
           models.add(model)
        }
        adapter.setData(models)
    }
    fun itemClicked(user: User,position:Int){
        setData(position)
        Toast.makeText(this,"${user.title} is clicked",Toast.LENGTH_SHORT).show()
    }
}