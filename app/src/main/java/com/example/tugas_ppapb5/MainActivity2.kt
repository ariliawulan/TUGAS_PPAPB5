package com.example.tugas_ppapb5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas_ppapb5.databinding.ActivityMain2Binding
import com.example.tugas_ppapb5.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val name = intent.getStringExtra(MainActivity.uname)
        val email = intent.getStringExtra(MainActivity.email2)
        val phone = intent.getStringExtra(MainActivity.phone2)

        with(binding){
            masukuname.text = name
            masukemail.text = email
            masukphone.text = phone
        }
    }
}