package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo6Binding
import com.csc211.petcare.databinding.FragmentOnbo8Binding

class Onboard8Fragment : Fragment() {
    private var _binding: FragmentOnbo8Binding? = null
    private val binding get() = _binding!!


    private var selectedCat1 = false
    private var selectedCat2 = false
    private var selectedCat3 = false
    private var selectedCat4 = false
    private var selectedCat5 = false
    private var selectedCat6 = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo8Binding.inflate(inflater, container, false)
        val view = binding.root


        binding.backButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard8Fragment_to_onboard6Fragment)
        }

        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard8Fragment_to_onboard9Fragment)
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cat1View.setOnClickListener {
            onImageClicked(it, "cat1")
        }

        binding.cat2View.setOnClickListener {
            onImageClicked(it, "cat2")
        }

        binding.cat3View.setOnClickListener {
            onImageClicked(it, "cat3")
        }

        binding.cat4View.setOnClickListener {
            onImageClicked(it, "cat4")
        }

        binding.cat5View.setOnClickListener {
            onImageClicked(it, "cat5")
        }

        binding.cat6View.setOnClickListener {
            onImageClicked(it, "cat6")
        }
    }

    private fun onImageClicked(view: View, tag: String) {
        // Reset the border for all images
        binding.cat1View.isSelected = false
        binding.cat2View.isSelected = false
        binding.cat3View.isSelected = false
        binding.cat4View.isSelected = false
        binding.cat5View.isSelected = false
        binding.cat6View.isSelected = false


        view.isSelected = true


        when (tag) {
            "dog1" -> selectedCat1 = true
            "dog2" -> selectedCat2 = true
            "dog3" -> selectedCat3 = true
            "dog4" -> selectedCat4 = true
            "dog5" -> selectedCat5 = true
            "dog6" -> selectedCat6 = true

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}