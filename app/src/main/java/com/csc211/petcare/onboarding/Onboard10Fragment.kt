package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo10Binding
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class Onboard10Fragment : Fragment() {
    private var _binding: FragmentOnbo10Binding? = null
    private val binding get() = _binding!!

    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo10Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.nextbutton.setOnClickListener {
            sharedViewModel.selectedDate = getSelectedDateFromDatePicker()
            findNavController().navigate(R.id.action_onboard10Fragment_to_onboard11Fragment)
        }

        binding.idkbutton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard10Fragment_to_onboard11Fragment)
        }

        return view
    }

    private fun getSelectedDateFromDatePicker(): String {
        val year = binding.datePicker.year
        val month = binding.datePicker.month
        val day = binding.datePicker.dayOfMonth

        // Customize the date format as needed
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val calendar = Calendar.getInstance()
        calendar.set(year, month, day)
        return dateFormat.format(calendar.time)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
