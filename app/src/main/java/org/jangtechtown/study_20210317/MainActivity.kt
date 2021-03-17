package org.jangtechtown.study_20210317

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_NICKNAME = 1993


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

        editNickBtn.setOnClickListener {

            val myIntent = Intent(this, EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)

        }

        dialBtn.setOnClickListener {

            val inputPhoneNum = phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel:${inputPhoneNum}")

            val myIntent = Intent(Intent.ACTION_DIAL, myUri)

            startActivity(myIntent)


        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_FOR_NICKNAME) {

            if (resultCode == RESULT_OK) {

                val newNickname = data?.getStringExtra("nick")

                nicknameTxt.text = newNickname


            }

        }

    }

}