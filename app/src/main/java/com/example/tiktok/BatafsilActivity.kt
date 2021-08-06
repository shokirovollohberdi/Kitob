package com.example.tiktok


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import MyDate.Batafsil_object.bataflis_list
import MyDate.Index
import MyDate.Xatolar_object.xatolar_list
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_batafsil.*


class BatafsilActivity : AppCompatActivity() {
    var inpos  =  Index.index_position
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_batafsil)


        supportActionBar?.hide()
        txt_batafsil.text = bataflis_list[inpos].batafsil
        image_batafsil.setImageResource(xatolar_list[inpos].image!!)

       click_btn_next()
        click_btn_back()
    }

    private fun click_btn_back() {
        tekshirish()
        if (btn_back.visibility==View.VISIBLE){
            btn_back.setOnClickListener {
                inpos--
                text_qoy()
                tekshirish()
                click_btn_next()
            }
            tekshirish()
        }
    }

    private fun click_btn_next() {
        tekshirish()
        if (btn_next.visibility==View.VISIBLE){
            btn_next.setOnClickListener {
                inpos++
                text_qoy()
                tekshirish()
                click_btn_back()
                click_btn_next()
            }
            tekshirish()
            click_btn_back()
        }
        click_btn_back()
    }

    private fun text_qoy() {
        txt_batafsil.text = bataflis_list[inpos].batafsil
        image_batafsil.setImageResource(xatolar_list[inpos].image!!)
    }




    private fun tekshirish() {
        if (inpos == 0) {
            btn_back.visibility = View.INVISIBLE
        } else if (inpos == 9) {
            btn_next.visibility = View.INVISIBLE
        } else {
            btn_back.visibility = View.VISIBLE
            btn_next.visibility = View.VISIBLE
        }
    }

}