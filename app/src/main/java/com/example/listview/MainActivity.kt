package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.listview.databinding.ActivityMainBinding


/*private fun ListView.setOnClickListener(function: (View, Any?, Any?, Any?) -> Unit) {

}*/
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var userArrayList: ArrayList<user>
    private lateinit var adapter: adapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageid = intArrayOf(
            R.drawable.android2,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h
        )
        val projectname= arrayOf("WhatsApp","Facebook","ArogyaSetu","Zomato","Kindle","Spotify","Flipkart")
        val description= arrayOf("A Messaging app","Social media exploring and messaging app","An App for covid tracing ","Food delivering App","Book Reading App","Music Listening App","Online Shopping App",)
        val views= arrayOf("355 views","190 views","203 views","120 views","69 views","288 views","354 views")
        val name= arrayOf("2","3","4","5","6","7","8")
        val email= arrayOf("1@","1@","1@","1@","1@","1@","1@")
        val githubprofile= arrayOf("1@#","1@#","1@#","1@#","1@#","1@#","1@#")
        userArrayList=ArrayList()
        for(i in projectname.indices){
            val user=user(projectname[i],description[i],views[i],name[i],email[i],githubprofile[i],imageid[i])
            userArrayList.add(user)
        }


        Log.d("tag","ad")


        binding.listview.adapter=adapter(this@MainActivity,userArrayList)



    }

    fun nexttab(view: View) {
        val intent=Intent(this,Activity_user::class.java)
        startActivity(intent)
    }

    fun addproject(view: View) {
        val intent=Intent(this,AddProjectActivity::class.java)
        startActivity(intent)
    }


}
