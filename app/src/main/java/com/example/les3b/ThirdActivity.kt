package com.example.les3b



import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thirdactivity)

        val btnReturnTo2 = findViewById<Button>(R.id.btnReturnTo2)
        btnReturnTo2.setOnClickListener {
            Intent(this, SecondActivity::class.java).also {
                startActivity(it)
            }


        }

    }
}
