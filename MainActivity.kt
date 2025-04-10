package com.example.likeunlikeapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var txtTotalCount: TextView
    private lateinit var btnAdd: Button
    private lateinit var btnSub: Button
    var count:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        txtTotalCount = findViewById(R.id.txtTotalCount)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)

        btnAdd.setOnClickListener {
            count++
            txtTotalCount.text = "total count => $count"
        }
        btnSub.setOnClickListener {
            count = (count - 1).coerceAtLeast(0)
            txtTotalCount.text = "total count => $count"
        }
    }
}
