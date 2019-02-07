package com.example.myapplicationblinding

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    private lateinit var binding: com.example.myapplicationblinding.databinding.ActivityMainBinding
    private  var myUser = User("Thatphon")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.button.setOnClickListener {
          //  binding.textView.text = binding.editText.text.toString()
            myUser.name = binding.editText.text.toString()
            binding.invalidateAll() // updatate all page
        }//end setonclick
        binding.user = myUser
        Log.i("Mainactivity","Activity on Create")
    }//end oncreate

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity","Activity on Start")
    }
    fun gotostd(view: View){
        var intent = Intent(this,StdMainActivity::class.java)
        startActivity(intent)

    }
}// class main
