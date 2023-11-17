package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo5Binding
import com.csc211.petcare.databinding.FragmentOnbo6Binding

class Onboard6Fragment : Fragment() {
    private var _binding: FragmentOnbo6Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo6Binding.inflate(inflater, container, false)
        val view = binding.root

        val userName = arguments?.getString("userName")
        binding.hiMessage.text = "Hi $userName !"

        binding.backButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard6Fragment_to_onboard5Fragment)
        }

        binding.backButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard6Fragment_to_onboard5Fragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}