package com.csc211.petcare.community

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentCommunity4Binding

class Community4Fragment : Fragment() {
    private var _binding: FragmentCommunity4Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCommunity4Binding.inflate(inflater, container, false)
        binding.close.setOnClickListener{
            findNavController().navigate(R.id.action_Community4Fragment_to_Community1Fragment)
        }

        binding.frame26080.setOnClickListener{
            findNavController().navigate(R.id.action_Community4Fragment_to_Community5Fragment)
        }
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}