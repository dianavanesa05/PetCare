package com.csc211.petcare.homepage

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import com.csc211.petcare.databinding.FragmentAddTaskBinding
import com.csc211.petcare.onboarding.SharedViewModel

class AddTaskDialogFragment : DialogFragment() {

    private var _binding: FragmentAddTaskBinding? = null
    private val binding get() = _binding!!

    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddTaskBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val taskSpinner: Spinner = binding.taskSpinner

        val taskOptions = arrayOf("Grooming", "Feeding", "Medicine", "Teeth-brushing", "Dog-walking", "Bath")
        val taskAdapter = ArrayAdapter(requireContext(), R.layout.simple_spinner_item, taskOptions)
        taskAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        taskSpinner.adapter = taskAdapter




        val petSpinner: Spinner = binding.petSpinner
        val petName = sharedViewModel.petName.value ?: "N/A"

        val pets = listOf(petName, "Dodo")
        val petSpinnerAdapter = ArrayAdapter(
            requireContext(),
            R.layout.simple_spinner_item,
            pets
        )
        petSpinnerAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        petSpinner.adapter = petSpinnerAdapter




        val startSpinner: Spinner = binding.startSpinner
        val startTimes = arrayOf("Select Time", "9:00 AM", "12:00 PM", "3:00 PM", "6:00 PM", "9:00 PM")

        val startAdapter = ArrayAdapter(requireContext(), R.layout.simple_spinner_item, startTimes)
        startAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        startSpinner.adapter = startAdapter

        val notesEditText: EditText = binding.notesEditText


        val intervalSpinner: Spinner = binding.intervalSpinner
        val intervalOptions = arrayOf("Every day", "Once a week", "Once a month", "Custom")

        val intervalAdapter = ArrayAdapter(requireContext(), R.layout.simple_spinner_item, intervalOptions)
        intervalAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        intervalSpinner.adapter = intervalAdapter




        val createButton: Button = binding.createButton

        createButton.setOnClickListener {
            val notes = notesEditText.text.toString()
            dismiss()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
