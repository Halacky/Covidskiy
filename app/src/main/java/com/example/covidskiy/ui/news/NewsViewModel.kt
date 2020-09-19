package com.example.covidskiy.ui.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Заразилось: 5000 \n" +
                "Выздоровело: 4000 \n" +
                "Умерло: 300"
    }
    val text: LiveData<String> = _text
}