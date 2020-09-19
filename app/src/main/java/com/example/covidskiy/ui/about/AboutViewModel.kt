package com.example.covidskiy.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Молодая команда, перспективных разработчиков с большими амбициями. \n" +
                "Cоздатели никому неизвестный шедевров. \n" +
                "Мы обязятельно доделам этот проект, если не забудем."
    }
    val text: LiveData<String> = _text
}