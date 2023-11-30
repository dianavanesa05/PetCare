package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo5Binding

class Onboard5Fragment : Fragment() {
    private var _binding: FragmentOnbo5Binding? = null
    private val binding get() = _binding!!

    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo5Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.nameInput

        binding.backButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard5Fragment_to_onboard4Fragment)
        }
        binding.nextButton.setOnClickListener {
            val userName = binding.nameInput.text.toString()
            sharedViewModel.petName.value = userName
            sharedViewModel.setEnteredName(userName) // Set entered name in the ViewModel

            val bundle = Bundle()
            bundle.putString("userName", userName)
            findNavController().navigate(R.id.action_onboard5Fragment_to_onboard6Fragment, bundle)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}