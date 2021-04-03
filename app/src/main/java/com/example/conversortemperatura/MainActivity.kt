package com.example.conversortemperatura

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle as AndroidOsBundle



class MainActivity : AppCompatActivity() {
   

    override fun onCreate(savedInstanceState: AndroidOsBundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        botao.setOnClickListener {
            val c = expressao.text.toString()
            val f:Float = (9 * c.toFloat() + 160) / 5
            resultado.setText(f.toString()+"F°")
        }

    }

}

