package com.example.userdataapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.userdataapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.UserDataApplication)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentLogin = LoginFragment()
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragmentLogin).commit()


    }

}
