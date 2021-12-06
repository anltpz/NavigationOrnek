package com.example.bitcoinretrofit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.bitcoinretrofit.databinding.FragmentBlank2Binding


class BlankFragment2 : Fragment() {

        val arguman : BlankFragment2Args by navArgs()
    private lateinit var _binding: FragmentBlank2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentBlank2Binding.inflate(LayoutInflater.from(requireContext()),container,false)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding.framentText2.text=arguman.stringName

    }
}