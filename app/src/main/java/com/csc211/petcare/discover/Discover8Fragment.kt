package com.csc211.petcare.discover

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentDiscover8Binding

class Discover8Fragment: Fragment() {
    private var _binding: FragmentDiscover8Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDiscover8Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.mostVoted.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery8Fragment_to_Discover6Fragment)
        }

        binding.expert.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery8Fragment_to_Discover7Fragment)
        }

        binding.arrowBack.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery8Fragment_to_Discover5Fragment)
        }

        binding.examplesMe.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery8Fragment_to_Discover5Fragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}