package com.example.projectfragmentkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.projectfragmentkotlin.fragments.FragmentOne

class MainActivity : AppCompatActivity() {

    var isFragmentOnLoaded = true
    val maneger = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Change = findViewById<Button>(R.id.btnChange)
        showFragmenteOne()

        Change.setOnClickListener {
            if (isFragmentOnLoaded) {
                showFragmenteTwo()
            } else {
                showFragmenteOne()
            }
        }
    }

    fun showFragmenteOne() {
        val transaction = maneger.beginTransaction()
        val fragment = FragmentOne()
        transaction.replace(R.id.frameHolder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentOnLoaded = true

    }

    fun showFragmenteTwo() {
        val transaction = maneger.beginTransaction()
        val fragment = FragmentOne()
        transaction.replace(R.id.frameHolder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentOnLoaded = false

    }
}
