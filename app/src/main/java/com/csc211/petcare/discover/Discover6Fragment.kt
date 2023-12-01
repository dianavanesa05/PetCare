package com.csc211.petcare.discover

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentDiscover6Binding

class Discover6Fragment: Fragment() {
    private var _binding: FragmentDiscover6Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDiscover6Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.expert.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery6Fragment_to_Discover7Fragment)
        }

        binding.creator.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery6Fragment_to_Discover8Fragment)
        }

        binding.arrowBack.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery6Fragment_to_Discover5Fragment)
        }

        binding.examplesMe.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery6Fragment_to_Discover5Fragment)
        }

        binding.videoCards1.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery6Fragment_to_Discover9Fragment)
        }

        binding.videoCards3.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery6Fragment_to_Discover10Fragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}