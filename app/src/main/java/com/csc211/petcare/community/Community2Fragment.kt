package com.csc211.petcare.community

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentCommunity2Binding

class Community2Fragment : Fragment() {
    private var _binding: FragmentCommunity2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCommunity2Binding.inflate(inflater, container, false)
        val view = binding.root
        binding.arrowBack.setOnClickListener(){
            findNavController().navigate(R.id.action_Community2Fragment_to_Community1Fragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}