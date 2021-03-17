package org.jangtechtown.study_20210317

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToFirstBtn.setOnClickListener {

            val myIntent = Intent(this, MyFirstActivity::class.java)
            startActivity(myIntent)

        }

        moveToSecondBtn.setOnClickListener {

            val inputmessage = messageEdt.text.toString()

            val myIntent = Intent(this, MySecondActivity::class.java)

            myIntent.putExtra("message", inputmessage)

            startActivity(myIntent)


        }


    }
}