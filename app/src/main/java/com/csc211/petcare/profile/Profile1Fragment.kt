package com.csc211.petcare.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentProfile1Binding
import com.csc211.petcare.onboarding.SharedViewModel

class Profile1Fragment : Fragment() {
    private var _binding: FragmentProfile1Binding? = null
    private val binding get() = _binding!!
    private val sharedViewModel: SharedViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfile1Binding.inflate(inflater, container, false)
        val view = binding.root

        val petName = sharedViewModel.petName.value ?: "N/A"
        binding.petText.text = petName

        val userName = sharedViewModel.userName.value ?: sharedViewModel.enteredName.value ?: "N/A"
        binding.ownerText.text = userName


        binding.iconView.setOnClickListener {
            findNavController().navigate(R.id.action_profile1Fragment_to_homepage1Fragment)
        }

        binding.mdaddcircle.setOnClickListener {
            findNavController().navigate(R.id.action_profile1Fragment_to_Community4Fragment)
        }

        binding.pawView.setOnClickListener {
            findNavController().navigate(R.id.action_profile1Fragment_to_Discover1Fragment)
        }

        binding.bodyView.setOnClickListener {
            findNavController().navigate(R.id.action_profile1Fragment_to_Community1Fragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}