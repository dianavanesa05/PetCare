package com.csc211.petcare.community

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentCommunity3Binding

class Community3Fragment : Fragment() {
    private var _binding: FragmentCommunity3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCommunity3Binding.inflate(inflater, container, false)
        val view = binding.root
        binding.arrowBack.setOnClickListener(){
            findNavController().navigate(R.id.action_Community3Fragment_to_Community1Fragment)
        }
        binding.ellipse30.setOnClickListener(){
            findNavController().navigate(R.id.action_Community3Fragment_to_Community2Fragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}