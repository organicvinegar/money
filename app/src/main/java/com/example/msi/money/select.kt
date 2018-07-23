package com.example.msi.money

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * 클레스 이름은 명사형
 * 메소드 이름은 동사, 형용상 형으로 작성
 * 클레스 명은 대문자로 시작
 * 메소드 명은 소문자로 시작
 * 크래스, 메소드 명은 java에서는 camelcase 로 작성이 일반 적임
 *
 * 예 select -> Select
 * 예 App Compat Activity -> AppCompatActivity
 */
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
