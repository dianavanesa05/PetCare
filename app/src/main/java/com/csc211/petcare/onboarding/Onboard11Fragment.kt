package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo11Binding

class Onboard11Fragment : Fragment() {
    private var _binding: FragmentOnbo11Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo11Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.nextbutton.setOnClickListener {

            val genderRadioGroup = view.findViewById<RadioGroup>(R.id.genderRadioGroup)
            val selectedGenderId = genderRadioGroup.checkedRadioButtonId

            if (selectedGenderId != -1) {
                val selectedRadioButton = view.findViewById<RadioButton>(selectedGenderId)
                val selectedGender = selectedRadioButton.text.toString()

            }

            findNavController().navigate(R.id.action_onboard11Fragment_to_onboard12Fragment)
        }

        binding.idkbutton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard11Fragment_to_onboard12Fragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}