package com.csc211.petcare.discover

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentDiscover14Binding

class Discover14Fragment: Fragment() {
    private var _binding: FragmentDiscover14Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDiscover14Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.icon.setOnClickListener {
            findNavController().navigate(R.id.action_Discover14Fragment_to_homepage1Fragment)
        }

        binding.body.setOnClickListener {
            findNavController().navigate(R.id.action_Discover14Fragment_to_Community1Fragment)
        }

        binding.profileImg.setOnClickListener {
            findNavController().navigate(R.id.action_Discover14Fragment_to_profile1Fragment)
        }

        binding.mdaddcircle.setOnClickListener {
            findNavController().navigate(R.id.action_Discovery14Fragment_to_Discover11Fragment)
        }

        binding.search.setOnClickListener{
            findNavController().navigate(R.id.action_Discover14Fragment_to_Discover5Fragment)
        }

        binding.videos.setOnClickListener{
            findNavController().navigate(R.id.action_Discover14Fragment_to_Discover3Fragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}