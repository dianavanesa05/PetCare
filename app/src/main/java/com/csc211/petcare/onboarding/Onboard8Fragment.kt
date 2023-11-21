package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo6Binding
import com.csc211.petcare.databinding.FragmentOnbo8Binding

class Onboard8Fragment : Fragment() {
    private var _binding: FragmentOnbo8Binding? = null
    private val binding get() = _binding!!

    private val sharedViewModel: SharedViewModel by activityViewModels()

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
        view.isSelected = true

        when (tag) {
            "cat1" -> sharedViewModel.selectedCat = getString(R.string.persian_cat)
            "cat2" -> sharedViewModel.selectedCat = getString(R.string.bengal_cat)
            "cat3" -> sharedViewModel.selectedCat = getString(R.string.British_cat)
            "cat4" -> sharedViewModel.selectedCat = getString(R.string.maine_cat)
            "cat5" -> sharedViewModel.selectedCat = getString(R.string.siamese_cat)
            "cat6" -> sharedViewModel.selectedCat = getString(R.string.other)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}