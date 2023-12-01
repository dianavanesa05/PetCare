package com.csc211.petcare.discover

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentDiscover9Binding

class Discover9Fragment: Fragment() {
    private var _binding: FragmentDiscover9Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDiscover9Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.segment1.setOnClickListener{
            findNavController().navigate(R.id.action_Discover9Fragment_to_homepage1Fragment)
        }

        binding.segment2.setOnClickListener{
            findNavController().navigate(R.id.action_Discover9Fragment_to_Discover1Fragment)
        }

        binding.mdaddcircle.setOnClickListener{
            findNavController().navigate(R.id.action_Discover9Fragment_to_Discover11Fragment)
        }

        binding.segment4.setOnClickListener{
            findNavController().navigate(R.id.action_Discover9Fragment_to_Community1Fragment)
        }

        binding.segment5.setOnClickListener{
            findNavController().navigate(R.id.action_Discover9Fragment_to_profile1Fragment)
        }

        binding.arrowBack.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery9Fragment_to_Discover6Fragment)
        }

        binding.textField.setOnClickListener{
            findNavController().navigate(R.id.action_Discovery9Fragment_to_Discover5Fragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}