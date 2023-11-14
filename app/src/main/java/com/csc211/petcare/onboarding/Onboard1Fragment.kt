package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.databinding.ActivityMainBinding
import com.csc211.petcare.databinding.FragmentOnbo1Binding

class Onboard1Fragment {
    private var _binding: FragmentOnbo1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo1Binding.inflate(inflater, container, false)
        val view = binding.root
        binding.startButton.setOnClickListener {
             }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}