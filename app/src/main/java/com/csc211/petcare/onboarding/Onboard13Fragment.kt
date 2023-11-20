package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo13Binding

class Onboard13Fragment : Fragment() {

    private var _binding: FragmentOnbo13Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo13Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.nextbutton.setOnClickListener {
            findNavController().navigate(R.id.action_onboard13Fragment_to_onboard14Fragment)
        }


        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
