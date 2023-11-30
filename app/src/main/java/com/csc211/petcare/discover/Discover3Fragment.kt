package com.csc211.petcare.discover

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentDiscover3Binding

class Discover3Fragment : Fragment() {
    private var _binding: FragmentDiscover3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDiscover3Binding.inflate(inflater, container, false)
        val view = binding.root
        Handler().postDelayed({
            findNavController().navigate(R.id.action_Discover3Fragment_to_Discover4Fragment)
        }, 1500)
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}