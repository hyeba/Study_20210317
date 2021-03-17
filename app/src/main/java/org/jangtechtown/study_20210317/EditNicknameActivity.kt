package org.jangtechtown.study_20210317

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        okBtn.setOnClickListener {

            val inputNewNickname = nicknameEdt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNewNickname)

            setResult(RESULT_OK, resultIntent)

            finish()


        }
    }
}