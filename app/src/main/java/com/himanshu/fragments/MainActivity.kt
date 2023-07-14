package com.himanshu.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.himanshu.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var activityInterface: ActivityInterface
    var text=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.btnPass.setOnClickListener {
        text=binding.etName?.text.toString()
        activityInterface.changeFragmentName(text)
    }
        binding.btnIncrement.setOnClickListener {
            activityInterface.increment()
        }
        binding.btnDecrement.setOnClickListener {
            activityInterface.decrement()
        }

    }

    fun changeFragmentText(){
        binding.tvActivity?.text = "Changed from Fragment"
    }
}