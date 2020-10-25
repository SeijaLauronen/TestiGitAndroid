package com.example.testigithubiin.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Seija muutti tämän tekstin: Tämä on koti-sivu"
    }
    val text: LiveData<String> = _text
}