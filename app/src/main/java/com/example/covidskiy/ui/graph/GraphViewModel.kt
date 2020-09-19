package com.example.covidskiy.ui.graph

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GraphViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "График показываает, что мы скоро все умрём"
    }
    val text: LiveData<String> = _text
}