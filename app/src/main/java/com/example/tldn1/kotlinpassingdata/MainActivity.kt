package com.example.tldn1.kotlinpassingdata

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnSendData.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java);
            intent.putExtra("podaci", edtEnterData.text)
            startActivity(intent)
        }

    }
}
