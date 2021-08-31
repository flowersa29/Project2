 package com.example.kotlinlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataSet : Array<String> = arrayOf("First", "second", "third", "fourth")
        val adapter = ItemAdapter(dataSet)
        homeList.layoutManager = LinearLayoutManager(this)
        homeList.adapter = adapter

    }
}