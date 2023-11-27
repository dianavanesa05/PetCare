package com.csc211.petcare.homepage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentHomepage1Binding

class Homepage1Fragment: Fragment() {
    private var _binding: FragmentHomepage1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomepage1Binding.inflate(inflater, container, false)
        val view = binding.root
        binding.pawButton.setOnClickListener {
            findNavController().navigate(R.id.action_homepage1Fragment_to_Discover1Fragment)
        }

        binding.bodyButton.setOnClickListener {
            findNavController().navigate(R.id.action_homepage1Fragment_to_Community1Fragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}