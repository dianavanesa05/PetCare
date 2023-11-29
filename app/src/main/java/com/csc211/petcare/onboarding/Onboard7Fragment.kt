package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo7Binding

class Onboard7Fragment : Fragment() {
    private var _binding: FragmentOnbo7Binding? = null
    private val binding get() = _binding!!

    private val sharedViewModel: SharedViewModel by activityViewModels()


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
        view.isSelected = true

        when (tag) {
            "dog1" -> sharedViewModel.selectedDog = getString(R.string.german_dog)
            "dog2" -> sharedViewModel.selectedDog = getString(R.string.golden_dog)
            "dog3" -> sharedViewModel.selectedDog = getString(R.string.labrador_dog)
            "dog4" -> sharedViewModel.selectedDog = getString(R.string.french_dog)
            "dog5" -> sharedViewModel.selectedDog = getString(R.string.poodle_dog)
            "dog6" -> sharedViewModel.selectedDog = getString(R.string.other)

        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}