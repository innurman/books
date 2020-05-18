package com.example.androidlab3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addBtnView.setOnClickListener{
            val title = addTitleView.getText().toString()
            val content = addContentView.getText().toString()
            val helper = DBHelper(this)
            val db = helper.writableDatabase
            db.execSQL("insert into tb_memo (title, content) values (?,?)",
                    arrayOf<String>(title, content))
            db.close()
            val intent = Intent(this, ReadDBActivity::class.java)
            startActivity(intent)
        }
    }
}
