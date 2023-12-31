package com.csc211.petcare.community

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentCommunity1Binding

class Community1Fragment : Fragment() {
    private var _binding: FragmentCommunity1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCommunity1Binding.inflate(inflater, container, false)
        val view = binding.root
        binding.ellipse30.setOnClickListener{
            findNavController().navigate(R.id.action_Community1Fragment_to_Community2Fragment)
        }

        binding.icon.setOnClickListener {
            findNavController().navigate(R.id.action_Community1Fragment_to_homepage1Fragment)
        }

        binding.pawImg.setOnClickListener {
            findNavController().navigate(R.id.action_Community1Fragment_to_Discover1Fragment)
        }

        binding.profileImg.setOnClickListener {
            findNavController().navigate(R.id.action_Community1Fragment_to_profile1Fragment)
        }

        binding.viewall.setOnClickListener {
            findNavController().navigate(R.id.action_Community1Fragment_to_Community3Fragment)
        }

        binding.mdaddcircle.setOnClickListener{
            findNavController().navigate(R.id.action_Community1Fragment_to_Community4Fragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}