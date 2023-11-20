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
    ): View? {
        _binding = FragmentOnbo14Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val petName = arguments?.getString("petName") ?: "NA"
        val petType = arguments?.getString("petType") ?: "NA"
        val breed = arguments?.getString("breed") ?: "NA"
        val birthday = arguments?.getString("birthday") ?: "NA"
        val gender = arguments?.getString("gender") ?: "NA"
        val imageUploaded = arguments?.getString("imageUploaded") ?: "NA"

        binding.nameTextView.text = "Name/Nickname: $petName"
        binding.petTypeTextView.text = "Dog or Cat: $petType"
        binding.breedTextView.text = "Breed: $breed"
        binding.birthdayTextView.text = "Birthday: $birthday"
        binding.genderTextView.text = "Gender: $gender"
        binding.imageTextView.text = "Picture Uploaded: $imageUploaded"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

