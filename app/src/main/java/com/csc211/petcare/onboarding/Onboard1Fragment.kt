package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo1Binding

class Onboard1Fragment : Fragment() {
    private var _binding: FragmentOnbo1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo1Binding.inflate(inflater, container, false)
        val view = binding.root
        binding.startButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard1Fragment_to_onboard2Fragment)
             }
        return view
    }

    override fun onDestroyView() {
   super.onDestroyView()
     _binding = null
    }
}