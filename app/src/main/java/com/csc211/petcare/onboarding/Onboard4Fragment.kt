package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo4Binding

class Onboard4Fragment : Fragment() {
    private var _binding: FragmentOnbo4Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo4Binding.inflate(inflater, container, false)
        val view = binding.root
        binding.backButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard5Fragment_to_onboard4Fragment)
        }

        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard4Fragment_to_onboard5Fragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}