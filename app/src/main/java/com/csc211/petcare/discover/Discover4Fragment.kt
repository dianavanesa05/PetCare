package com.csc211.petcare.discover

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentDiscover4Binding

class Discover4Fragment: Fragment() {
    private var _binding: FragmentDiscover4Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDiscover4Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.icon.setOnClickListener {
            findNavController().navigate(R.id.action_Discover4Fragment_to_homepage1Fragment)
        }

        binding.body.setOnClickListener {
            findNavController().navigate(R.id.action_Discover4Fragment_to_Community1Fragment)
        }

        binding.profileImg.setOnClickListener {
            findNavController().navigate(R.id.action_Discover4Fragment_to_profile1Fragment)
        }

        binding.mdaddcircle.setOnClickListener {
            findNavController().navigate(R.id.action_Discovery4Fragment_to_Community4Fragment)
        }

        binding.search.setOnClickListener{
            findNavController().navigate(R.id.action_Discover4Fragment_to_Discover5Fragment)
        }

        binding.blogs.setOnClickListener{
            findNavController().navigate(R.id.action_Discover4Fragment_to_Discover1Fragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}