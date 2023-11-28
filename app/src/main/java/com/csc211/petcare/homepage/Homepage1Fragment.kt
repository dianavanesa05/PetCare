package com.csc211.petcare.homepage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentHomepage1Binding
import com.csc211.petcare.onboarding.SharedViewModel

class Homepage1Fragment: Fragment() {
    private var _binding: FragmentHomepage1Binding? = null
    private val binding get() = _binding!!

    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomepage1Binding.inflate(inflater, container, false)
        val view = binding.root

        val petSpinner: Spinner = view.findViewById(R.id.petSpinner)
        val petName = sharedViewModel.petName.value ?: "N/A"
        val spinnerAdapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_item,
            listOf(petName, "Dodo")
        )
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        petSpinner.adapter = spinnerAdapter


        val newButton: Button = binding.newButton
        newButton.setOnClickListener {
            findNavController().navigate(R.id.action_homepage1Fragment_to_addTaskDialogFragment)
        }


            binding.pawView.setOnClickListener {
                findNavController().navigate(R.id.action_homepage1Fragment_to_Discover1Fragment)
            }

            binding.bodyView.setOnClickListener {
                findNavController().navigate(R.id.action_homepage1Fragment_to_Community1Fragment)
            }

            binding.profileView.setOnClickListener {
                findNavController().navigate(R.id.action_homepage1Fragment_to_profile1Fragment)
            }
            return view
        }


        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }
