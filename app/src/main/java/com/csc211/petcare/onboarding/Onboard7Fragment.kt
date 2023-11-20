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

    private var selectedDog1 = false
    private var selectedDog2 = false
    private var selectedDog3 = false
    private var selectedDog4 = false
    private var selectedDog5 = false
    private var selectedDog6 = false

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
            findNavController().navigate(R.id.action_onboard7Fragment_to_onboard9Fragment)
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.dog1View.setOnClickListener {
            onImageClicked(it, "dog1")
        }

        binding.dog2View.setOnClickListener {
            onImageClicked(it, "dog2")
        }

        binding.dog3View.setOnClickListener {
            onImageClicked(it, "dog3")
        }

        binding.dog4View.setOnClickListener {
            onImageClicked(it, "dog4")
        }

        binding.dog5View.setOnClickListener {
            onImageClicked(it, "dog5")
        }

        binding.dog6View.setOnClickListener {
            onImageClicked(it, "dog6")
        }
    }

    private fun onImageClicked(view: View, tag: String) {
        // Reset the border for all images
        binding.dog1View.isSelected = false
        binding.dog2View.isSelected = false
        binding.dog3View.isSelected = false
        binding.dog4View.isSelected = false
        binding.dog5View.isSelected = false
        binding.dog6View.isSelected = false


        view.isSelected = true


        when (tag) {
            "dog1" -> selectedDog1 = true
            "dog2" -> selectedDog2 = true
            "dog3" -> selectedDog3 = true
            "dog4" -> selectedDog4 = true
            "dog5" -> selectedDog5 = true
            "dog6" -> selectedDog6 = true

        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}