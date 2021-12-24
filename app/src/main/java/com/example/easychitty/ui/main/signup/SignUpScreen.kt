package com.example.easychitty.ui.main.signup

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.easychitty.R

class SignUpScreen : Fragment() {

    companion object {
        fun newInstance() = SignUpScreen()
    }

    private lateinit var viewModel: SignUpScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sign_up_screen_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SignUpScreenViewModel::class.java)
        // TODO: Use the ViewModel
    }

}