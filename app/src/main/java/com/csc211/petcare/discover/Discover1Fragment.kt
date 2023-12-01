package com.csc211.petcare.discover

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentDiscover1Binding

class Discover1Fragment : Fragment() {
    private var _binding: FragmentDiscover1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDiscover1Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.icon.setOnClickListener {
            findNavController().navigate(R.id.action_Discover1Fragment_to_homepage1Fragment)
        }

        binding.body.setOnClickListener {
            findNavController().navigate(R.id.action_Discover1Fragment_to_Community1Fragment)
        }

        binding.profileImg.setOnClickListener {
            findNavController().navigate(R.id.action_Discover1Fragment_to_profile1Fragment)
        }

        binding.mdaddcircle.setOnClickListener {
            findNavController().navigate(R.id.action_Discovery1Fragment_to_Discover11Fragment)
        }

        binding.feedCards.setOnClickListener {
            findNavController().navigate(R.id.action_Discover1Fragment_to_Discover2Fragment)
        }

        binding.search.setOnClickListener{
            findNavController().navigate(R.id.action_Discover1Fragment_to_Discover5Fragment)
        }

        binding.videos.setOnClickListener{
            findNavController().navigate(R.id.action_Discover1Fragment_to_Discover3Fragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}