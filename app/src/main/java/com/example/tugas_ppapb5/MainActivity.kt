package com.example.tugas_ppapb5

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.tugas_ppapb5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    companion object{
        const val uname = "username"
        const val email2 = "email"
        const val phone2 = "phone"
        const val password2 = "password"
//        const val login2 = "login"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            register2.setOnClickListener {
                val intentToMainActivity2 = Intent(this@MainActivity, MainActivity2::class.java)
                intentToMainActivity2.putExtra(uname, username.text.toString())
                intentToMainActivity2.putExtra(email2, email.text.toString())
                intentToMainActivity2.putExtra(phone2, phone.text.toString())
                intentToMainActivity2.putExtra(password2, password.text.toString())
                startActivity(intentToMainActivity2)
//                login.setOnClickListener {
//                    val intentToMainActivity3 = Intent(this@MainActivity, MainActivity3::class.java)
//                    intentToMainActivity3.putExtra(login2, login.toString())
//                    startActivity(intentToMainActivity3)
//                }
            }
        }
    }
}