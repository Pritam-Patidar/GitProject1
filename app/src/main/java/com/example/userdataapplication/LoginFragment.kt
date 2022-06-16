package com.example.userdataapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.loginBtn
import kotlinx.android.synthetic.main.fragment_signup.*


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        return view
 }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        signupBtn.setOnClickListener {
            val signupfrag = SignupFragment()
            val transaction: FragmentTransaction =  parentFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout,signupfrag)
            transaction.commit()
        }



        loginBtn.setOnClickListener {

            val userName = editTextUserName.text.toString().trim()
            val password = editTextPassword.text.toString().trim()
//            val regex1 = Regex("[A-Z]");
            if(userName.length == 0){
                editTextUserName.error = "UserName can't be Blank"
            }else if(userName.length < 8){
                editTextUserName.error = "UserName Muse be 8 char"
            }else if(password.length == 0){
                editTextPassword.error = "Password Required"
            }else if(password.length <= 8) {
                editTextPassword.error = "Password Must be Atleast 8 char"
            }else{
                Toast.makeText(requireContext(), "Login Succesful", Toast.LENGTH_LONG).show()
            }

        }


    }

}

