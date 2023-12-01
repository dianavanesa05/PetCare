package com.csc211.petcare.discover

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentDiscover11Binding

class Discover11Fragment: Fragment() {
    private var _binding: FragmentDiscover11Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDiscover11Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.close.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery11Fragment_to_Discover1Fragment)
        }

        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery11Fragment_to_Discover12Fragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}