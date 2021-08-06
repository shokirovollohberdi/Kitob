package com.example.tiktok

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ilova_haqida.*

class IlovaHaqida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ilova_haqida)

        supportActionBar?.hide()

        insta.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/nadiadovlogs/")))
        }
        tiktok.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tiktok.com/@nadiadovlogs?lang=ru-RU")))
        }
        tg.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/nadiadogafurov")))
        }
        phone.setOnClickListener {
            try {
                val intent = Intent(Intent.ACTION_CALL);
                intent.data = Uri.parse("tel:979072317")
                startActivity(intent)
            }catch (e:Exception){
                Toast.makeText(this, "$e", Toast.LENGTH_SHORT).show()
            }

        }
    }
}