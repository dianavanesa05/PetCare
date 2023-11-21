package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo9Binding

class Onboard9Fragment : Fragment() {
    private var _binding: FragmentOnbo9Binding? = null
    private val binding get() = _binding!!

    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo9Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.nextbutton.setOnClickListener {
            val petName = binding.petNameInput.text.toString()
            sharedViewModel.petName.value = petName

            findNavController().navigate(R.id.action_onboard9Fragment_to_onboard10Fragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
