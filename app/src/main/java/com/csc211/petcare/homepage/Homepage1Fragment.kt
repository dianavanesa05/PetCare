package com.csc211.petcare.homepage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
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
            listOf("All Pets", petName, "Dodo")
        )
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        petSpinner.adapter = spinnerAdapter

        val taskView: ImageView = view.findViewById(R.id.taskView)

        // Set an OnItemSelectedListener for the petSpinner
        petSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Update taskView based on the selected item
                when (position) {
                    0 -> taskView.setImageResource(R.drawable.tasks)
                    1 -> taskView.setImageResource(R.drawable.tasks)
                    2 -> taskView.setImageResource(R.drawable.task_2)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing here
            }
        })


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
