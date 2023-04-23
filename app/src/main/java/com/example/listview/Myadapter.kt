package com.example.listview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class adapter (private val context : Activity , private val arrayList: ArrayList<user>) :ArrayAdapter<user>(context,
    R.layout.list_item,arrayList){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view : View= inflater.inflate(R.layout.list_item, null);

        val imageView: ImageView= view.findViewById(R.id.project_icon)
        val projectname : TextView = view.findViewById(R.id.projectname)
        val description: TextView = view.findViewById(R.id.description)
        val views: TextView=view.findViewById(R.id.views)

//        imageView.setImageResource(arrayList[position].imageId)
        projectname.text = arrayList[position].projectname
        description.text= arrayList[position].description
        views.text=arrayList[position].views

        return view
    }
}