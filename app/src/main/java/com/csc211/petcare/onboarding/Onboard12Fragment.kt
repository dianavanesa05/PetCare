package com.csc211.petcare.onboarding
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.csc211.petcare.R
import com.csc211.petcare.databinding.FragmentOnbo12Binding

class Onboard12Fragment : Fragment() {

    private var _binding: FragmentOnbo12Binding? = null
    private val binding get() = _binding!!

    private val PICK_IMAGE_REQUEST = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnbo12Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.welcomeMessage.text = getString(R.string.upload)
        binding.parag3.text = getString(R.string.available)

        binding.nextbutton.setOnClickListener {


        }

        binding.skipbutton.setOnClickListener {


        }

        binding.chooseImageButton.setOnClickListener {
            // Trigger the image selection process
            pickImage()
        }

        return view
    }

    private fun pickImage() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null && data.data != null) {
            // Handle the selected image
            val selectedImageUri: Uri = data.data!!
            // Do something with the selected image URI
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
