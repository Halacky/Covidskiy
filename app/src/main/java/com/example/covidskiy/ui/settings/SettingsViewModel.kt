package com.example.covidskiy.ui.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Сюда настройки(это главная страница)"
    }
    val text: LiveData<String> = _text
}