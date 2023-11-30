package com.csc211.petcare.onboarding
import android.net.Uri
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    val petName = MutableLiveData<String>()
    var selectedDog: String? = null
    var selectedCat: String? = null
    var selectedDate: String? = null
    var selectedGender: String? = null
    var selectedImageUri: Uri? = null
    val userName = MutableLiveData<String>()
    val enteredName = MutableLiveData<String>() // Add this line


    fun setEnteredName(name: String) {
        enteredName.value = name
    }
}