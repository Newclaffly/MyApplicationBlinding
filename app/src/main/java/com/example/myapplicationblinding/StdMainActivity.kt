package com.example.myapplicationblinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationblinding.databinding.ActivityStdMainBinding

class StdMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStdMainBinding
    private var myStd = Student(59160182,"Thatphon","SE","Informatics")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_std_main)
        binding.id.setOnClickListener{
            binding.invalidateAll()
        }
        binding.student = myStd
    }
}