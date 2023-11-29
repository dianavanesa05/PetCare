package com.csc211.petcare.homepage

import com.csc211.petcare.R
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


        val startSpinner: Spinner = binding.timeSpinner
        val startTimes = arrayOf("Select Time", "9:00 AM","10:00 AM","11:00 AM","12:00 PM", "1:00 PM","2:00 PM","3:00 PM","4:00 PM","5:00 PM", "6:00 PM","7:00 PM","8:00 PM", "9:00 PM")

        val startAdapter = ArrayAdapter(requireContext(), androidx.transition.R.layout.support_simple_spinner_dropdown_item, startTimes)
        startAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        startSpinner.adapter = startAdapter

        val notesEditText: EditText = binding.notesEditText


        val intervalSpinner: Spinner = binding.intervalSpinner
        val intervalOptions = arrayOf("Every day", "Once a week", "Once a month", "Custom")

        val intervalAdapter = ArrayAdapter(requireContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, intervalOptions)
        intervalAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        intervalSpinner.adapter = intervalAdapter



        val createButton: Button = binding.createButton

        createButton.setOnClickListener {
            val notes = notesEditText.text.toString()
            dismiss()
        }


        binding.feedingView.setOnClickListener {
            onImageClicked(it)
        }

        binding.medicineView.setOnClickListener {
            onImageClicked(it)
        }
        binding.teethView.setOnClickListener {
            onImageClicked(it)
        }

        binding.walkingView.setOnClickListener {
            onImageClicked(it)
        }
        binding.bathView.setOnClickListener {
            onImageClicked(it)
        }

        binding.newView.setOnClickListener {
            onImageClicked(it)
        }
        binding.ciciView.setOnClickListener {
            onImageClicked(it)
        }

        binding.dodoView.setOnClickListener {
            onImageClicked(it)
        }
    }

    private fun onImageClicked(view: View) {
        // Reset the border for all images
        binding.feedingView.isSelected = false
        binding.medicineView.isSelected = false
        binding.teethView.isSelected = false
        binding.walkingView.isSelected = false
        binding.bathView.isSelected = false
        binding.newView.isSelected = false
        binding.ciciView.isSelected = false
        binding.dodoView.isSelected = false

        view.isSelected = true
    }

    override fun onResume() {
        super.onResume()

        val dialog = dialog
        dialog?.let {
            val width = resources.getDimensionPixelSize(R.dimen.popup_width)
            val height = resources.getDimensionPixelSize(R.dimen.popup_height)
            it.window?.setLayout(width, height)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
