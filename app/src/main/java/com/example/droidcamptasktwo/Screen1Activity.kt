package com.example.droidcamptasktwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen1.*

class Screen1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        buttonAboutMe.setOnClickListener {
            val message: String = textInputName.text.toString()
            val intent = Intent(this, Screen2Activity::class.java)
            intent.putExtra("name", message)
            startActivity(intent)
        }
    }
}
