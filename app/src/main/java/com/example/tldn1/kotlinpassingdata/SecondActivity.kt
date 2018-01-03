package com.example.tldn1.kotlinpassingdata

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var intent = getIntent().extras
        var data = intent.get("podaci")

        txtShowData.text = data.toString()
    }
}
