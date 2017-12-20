package com.example.hari.picturechange

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun change(view : View){
        imageView.setImageResource(R.drawable.pic2)
    }

    fun change_1(view :View){
        imageView.setImageResource(R.drawable.pic1)
    }
}
