package com.csc211.petcare.discover

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentDiscover13Binding

class Discover13Fragment: Fragment() {
    private var _binding: FragmentDiscover13Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDiscover13Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.back.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery13Fragment_to_Discover11Fragment)
        }

        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery13Fragment_to_Discover14Fragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}