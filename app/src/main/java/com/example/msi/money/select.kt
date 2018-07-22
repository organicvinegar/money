package com.example.msi.money

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class select : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        val bt1: Button = findViewById(R.id.BT1) as Button
        val bt2: Button = findViewById(R.id.BT2) as Button
        val tv1: TextView = findViewById(R.id.TV1) as TextView
        val tv2: TextView = findViewById(R.id.TV2) as TextView
        val intent2 = Intent(this, input::class.java)
        val intent1 = Intent(this, MainScene::class.java)



        bt2.setOnClickListener {
            startActivity(intent2)
            this.finish()
        }

        bt1.setOnClickListener {
            startActivity(intent1)
            this.finish()
        }

    }
}
