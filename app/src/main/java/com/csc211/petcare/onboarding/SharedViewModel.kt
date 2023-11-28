package com.csc211.petcare.onboarding
import android.net.Uri
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    val petName = MutableLiveData<String>()
    val petOptions = MutableLiveData<Array<String>>()
    var selectedDog: String? = null
    var selectedCat: String? = null
    var selectedDate: String? = null
    var selectedGender: String? = null
    var selectedImageUri: Uri? = null
}
