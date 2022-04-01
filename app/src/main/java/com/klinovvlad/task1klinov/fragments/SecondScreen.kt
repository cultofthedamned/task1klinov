package com.klinovvlad.task1klinov.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.klinovvlad.task1klinov.databinding.FragmentSecondScreenBinding

class SecondScreen : Fragment() {
    private lateinit var secondScreenBinding: FragmentSecondScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        secondScreenBinding = FragmentSecondScreenBinding.inflate(
            inflater,
            container,
            false
        )
        return secondScreenBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        secondScreenBinding.textViewSecondId.text = arguments?.getString("item")
    }
}