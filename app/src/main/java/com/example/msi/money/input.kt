package com.example.msi.money

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class input : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        val btok : Button = findViewById(R.id.BTok) as Button
        val etmoney:EditText = findViewById(R.id.ETmoney) as EditText
        val money:Int = Integer.parseInt(etmoney.getText().toString())

        val intent=Intent(this, MainScene::class.java)
        intent.putExtra("total", money)

        btok.setOnClickListener {
            startActivity(intent)
            this.finish()
        }
    }
}
