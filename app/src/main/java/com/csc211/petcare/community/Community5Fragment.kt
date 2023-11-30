package com.csc211.petcare.community

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentCommunity5Binding

class Community5Fragment : Fragment() {
    private var _binding: FragmentCommunity5Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCommunity5Binding.inflate(inflater, container, false)
        val view = binding.root
        binding.close.setOnClickListener{
            findNavController().navigate(R.id.action_Community5Fragment_to_Community1Fragment)
        }
        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_Community5Fragment_to_Community1Fragment)
        }
        binding.group4073.setOnClickListener{
            findNavController().navigate(R.id.action_Community5Fragment_to_Community4Fragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}