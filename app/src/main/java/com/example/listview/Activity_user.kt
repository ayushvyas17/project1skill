package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview.databinding.ActivityUserBinding

class Activity_user : AppCompatActivity() {
    private lateinit var binding : ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val name = intent.getStringExtra(name: "name")
//        val email = intent.getStringExtra(name:"email")
//        val imageId = intent.getIntExtra(name:"imageId")
//        binding.nameProfile.text = name
//        binding.emailProfile.text = email
//        binding.profileImage.setImageResource(imageId)
    }
}