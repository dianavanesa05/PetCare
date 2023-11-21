package com.csc211.petcare.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.csc211.petcare.databinding.FragmentOnbo14Binding


class Onboard14Fragment : Fragment() {
    private var _binding: FragmentOnbo14Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo14Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.nextbutton.setOnClickListener {

        }


        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
