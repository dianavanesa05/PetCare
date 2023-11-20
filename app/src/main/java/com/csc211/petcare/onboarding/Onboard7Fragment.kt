package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo7Binding

class Onboard7Fragment : Fragment() {
    private var _binding: FragmentOnbo7Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo7Binding.inflate(inflater, container, false)
        val view = binding.root


        binding.backButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard7Fragment_to_onboard6Fragment)
        }

        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard6Fragment_to_onboard5Fragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}