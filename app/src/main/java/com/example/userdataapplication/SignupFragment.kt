package com.example.userdataapplication

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

class SignupFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            return inflater.inflate(R.layout.fragment_signup, container, false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginBtn.setOnClickListener {
            val signinfrag = LoginFragment()
            val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout, signinfrag)
            transaction.commit()
        }


        signupBtn1.setOnClickListener(){
            val userName1 = edtUserName.text.toString().trim()
            val email = edtEmail.text.toString().trim()
            val password1 = edtPassword.text.toString().trim()
            val password2 = edtRePassword.text.toString().trim()


            if(userName1.length == 0){
                edtUserName.error = "UserName Required"
            }else if(userName1.length <=8){
                edtUserName.error = "UserName Must be 8 Char"
            }else if(email.length == 0){
                edtEmail.error = "Email Id Required"
            }else if(email.length <= 8){
                    edtEmail.error = "Email contain must be 8 char min."
            }else if(password1.length == 0){
                edtPassword.error = "Password Required"
            }else if(password1.length <=8) {
                edtPassword.error = "Password must be 8 char Required"
            }else if(password2 != password1){
                edtRePassword.error = "Please Enter Correct password"
            }else{
                Toast.makeText(requireActivity(),"Signup successful",Toast.LENGTH_LONG).show()
            }


        }
    }
}
