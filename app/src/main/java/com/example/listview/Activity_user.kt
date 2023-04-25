package com.example.listview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.listview.databinding.ActivityUserBinding

class Activity_user : AppCompatActivity() {
    private lateinit var binding : ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val githubbutton= findViewById<Button>(R.id.gitproject)
        githubbutton.setOnClickListener{
            val url="https://github.com/ayushvyas17?tab=repositories"
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse(url)
            startActivity(intent)
        }
        val githubprofile=findViewById<Button>(R.id.github_profile)
        githubprofile.setOnClickListener{
            val url="https://github.com/ayushvyas17"
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse(url)
            startActivity(intent)
        }

//        val name = intent.getStringExtra(name: "name")
//        val email = intent.getStringExtra(name:"email")
//        val imageId = intent.getIntExtra(name:"imageId")
//        binding.nameProfile.text = name
//        binding.emailProfile.text = email
//        binding.profileImage.setImageResource(imageId)
    }
}