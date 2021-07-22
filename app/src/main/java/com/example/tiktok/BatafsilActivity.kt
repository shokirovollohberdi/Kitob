package com.example.tiktok


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import MyDate.Batafsil_object.bataflis_list
import MyDate.Index
import MyDate.Xatolar_object.xatolar_list
import android.view.View
import kotlinx.android.synthetic.main.activity_batafsil.*


class BatafsilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_batafsil)

        var inpos = Index.index_position
        title = "${inpos + 1}-xatolik"
        txt_batafsil.text = bataflis_list[inpos].batafsil
        image_batafsil.setImageResource(xatolar_list[inpos].image!!)

        btn_next.setOnClickListener {
            nextResult()
            tekshirish()
        }

        tekshirish()

    }

    private fun tekshirish() {
        var inpos = Index.index_position
        if (inpos == 0) {
            btn_next.visibility = View.VISIBLE
            btn_back.visibility = View.INVISIBLE
        } else if (inpos == 9) {
            btn_next.visibility = View.INVISIBLE
            btn_back.visibility = View.VISIBLE
        } else {
            btn_next.visibility = View.VISIBLE
            btn_back.visibility = View.VISIBLE
        }
    }

    private fun nextResult() {
        var inpos = Index.index_position
        tekshirish()
        title = "${inpos + 2}-xatolik"
        txt_batafsil.text = bataflis_list[inpos + 1].batafsil
        image_batafsil.setImageResource(xatolar_list[inpos + 1].image!!)
        tekshirish()


    }
}