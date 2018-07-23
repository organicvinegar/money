package com.example.msi.money

//import kotlinx.android.synthetic.main.activity_extension.*
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onBackPressed() {
        super.onBackPressed()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etname:EditText = findViewById(R.id.ETmoney) as EditText
        //val btok:Button = findViewById(R.id.BTok) as Button

        val intent = Intent(this,select::class.java)

        // activity_main 에 등록된 값은 kotlin에서는 findViewById(R.id.BTok) 으로 접근 하지 않아도 되며
        // 명확 하게 ID 라는 것으로 부여 하면 됨 수정
        BTok.setOnClickListener {
            if (etname.length()<=0) {
                Toast.makeText(this,"이름을 입력해 주세요",Toast.LENGTH_SHORT).show()
            }
            else{
                startActivity(intent);
                this.finish()
            }
        }


    }
}
