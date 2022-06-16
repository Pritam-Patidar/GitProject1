package com.example.userdataapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentLogin = LoginFragment()
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragmentLogin).commit()


    }

}
