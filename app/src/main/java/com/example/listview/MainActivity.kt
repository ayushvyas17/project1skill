package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview.databinding.ActivityMainBinding



/*private fun ListView.setOnClickListener(function: (View, Any?, Any?, Any?) -> Unit) {

}*/

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var userArrayList: ArrayList<user>
//    private lateinit var MyAdapter:Myadapter
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
        val projectname= arrayOf("2","3","4","5","6","7","8")
        val description= arrayOf("first","second","third","fourth","fifth","sixth","seventh","eighth")
        val views= arrayOf("15 views","15 views","15 views","15 views","15 views","15 views","15 views")
        val name= arrayOf("2","3","4","5","6","7","8")
        val email= arrayOf("1@","1@","1@","1@","1@","1@","1@")
        val githubprofile= arrayOf("1@#","1@#","1@#","1@#","1@#","1@#","1@#")
        userArrayList=ArrayList()
        for(i in projectname.indices){
            val user=user(projectname[i],description[i],views[i],name[i],email[i],githubprofile[i],null)
            userArrayList.add(user)
        }




//        binding.listview.adapter=Myadapter(this@MainActivity,userArrayList)
      /* binding.listview.setOnClickListener{parent,view,position,id  ->

            val name=name[position]

            val email=email[position]


            val imageid=imageid[position]

            val i=intent(packagecontext: this,UserActivity::class.java)

            i.putExtra(name:"name",name)

            i.putExtra(email:"email",email)

            startActivity(i)


        }*/


    }
}