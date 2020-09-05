package com.cagudeloa.databindingviewmodel.click

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ClickViewModel : ViewModel() {

    private var _score = MutableLiveData<Int>()
    val score : LiveData<Int> get() = _score

    init {
        _score.value = 0
    }

    fun getPoints(){
        _score.value = (score.value)?.plus(1)
    }

}