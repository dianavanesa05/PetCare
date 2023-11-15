package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo2Binding
import com.csc211.petcare.databinding.FragmentOnbo3Binding

class Onboard3Fragment : Fragment() {
    private var _binding: FragmentOnbo3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo3Binding.inflate(inflater, container, false)
        val view = binding.root
        binding.backButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard3Fragment_to_onboard2Fragment)
        }
        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard3Fragment_to_onboard4Fragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}