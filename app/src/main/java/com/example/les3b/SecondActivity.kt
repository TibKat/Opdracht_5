package com.example.les3b

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class SecondActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondactivity)

        val btnReturn = findViewById<Button>(R.id.btnReturn)
        val btnContinue = findViewById<Button>(R.id.btnContinue)


        btnReturn.setOnClickListener{
            finish()
        }
        btnContinue.setOnClickListener {
            Intent(this, ThirdActivity::class.java).also {
                startActivity(it)       }

            }


        }


    }

