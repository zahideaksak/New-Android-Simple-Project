package com.example.hazirveritabanikullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.simpleButton)

        button.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Butona Basıldı", Toast.LENGTH_SHORT).show()
        })
    }
}