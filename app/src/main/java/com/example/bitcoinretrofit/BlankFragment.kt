package com.example.bitcoinretrofit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bitcoinretrofit.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
        private lateinit var _binding  : FragmentBlankBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentBlankBinding.inflate(LayoutInflater.from(requireContext()),container,false)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding.buttonGecisYap.setOnClickListener {

            val action =BlankFragmentDirections.actionBlankFragmentToBlankFragment2("Arguman yollandı ")
            findNavController().navigate(action)

        }

        super.onViewCreated(view, savedInstanceState)
    }

}


