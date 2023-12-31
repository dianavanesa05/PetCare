package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo2Binding

class Onboard2Fragment : Fragment() {
    private var _binding: FragmentOnbo2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo2Binding.inflate(inflater, container, false)
        val view = binding.root
        binding.backButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard2Fragment_to_onboard1Fragment)
        }

            binding.nextButton.setOnClickListener {
                findNavController().navigate(R.id.action_onboard2Fragment_to_onboard3Fragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}