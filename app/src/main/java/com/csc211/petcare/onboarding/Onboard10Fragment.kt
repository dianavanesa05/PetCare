package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo10Binding
import java.util.Calendar

class Onboard10Fragment : Fragment() {
    private var _binding: FragmentOnbo10Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo10Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.nextbutton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard10Fragment_to_onboard11Fragment)
        }
        binding.idkbutton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard10Fragment_to_onboard11Fragment)

        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        // Initialize DatePicker
        binding.datePicker.init(year, month, day, DatePicker.OnDateChangedListener { _, year, monthOfYear, dayOfMonth ->

        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}