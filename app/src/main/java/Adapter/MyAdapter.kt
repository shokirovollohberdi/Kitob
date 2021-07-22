package Adapter

import Models.Xatolar
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.tiktok.R
import kotlinx.android.synthetic.main.item_list.view.*


class MyAdapter(context: Context, val list: List<Xatolar>) : ArrayAdapter<Xatolar>(context, R.layout.item_list, list) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemView: View
        if (convertView == null) {
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        } else {
            itemView = convertView
        }

        itemView.image_about.setImageResource(list[position].image!!)
        itemView.txt_xatolik.text = list[position].nomi!!
        itemView.xato_tartib.text = list[position].tartib.toString()

        return itemView
    }
}