package com.example.droidcamptasktwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_screen1.*
import kotlinx.android.synthetic.main.activity_screen2.*

class Screen2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val bundle: Bundle? = intent.extras
        val inputFromScreen1 = bundle!!.getString("name")
        textName.text = inputFromScreen1

        buttonSayHello.setOnClickListener {
            val message = "Hello ${textName.text}"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}
