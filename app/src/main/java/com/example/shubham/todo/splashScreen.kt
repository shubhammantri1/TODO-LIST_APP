package com.example.shubham.todo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.Animation
import android.widget.ImageView


class splashScreen : AppCompatActivity() {

    private var iv: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        iv = findViewById<View>(R.id.Imageview) as ImageView
        val myanim = AnimationUtils.loadAnimation(this, R.anim.splash_alpha_anim)
        iv!!.startAnimation(myanim)
        val i = Intent(this, Dashboard::class.java)
        val timer = object : Thread() {
            override fun run() {
                try {
                    sleep(5000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                } finally {
                    startActivity(i)
                    finish()
                }
            }
        }
        timer.start()
    }
}