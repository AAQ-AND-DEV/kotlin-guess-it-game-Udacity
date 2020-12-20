package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class ScoreViewModel(finalScore: Int): ViewModel() {

    private val _score = MutableLiveData<Int>()
    val score : LiveData<Int>
        get() = _score

    private val _eventNewGame = MutableLiveData<Boolean>()
    val eventNewGame : LiveData<Boolean>
        get() = _eventNewGame

    init{
        _score.value = finalScore
        _eventNewGame.value = false
        Timber.i("final score is ${_score.value}")
    }

    fun newGamePressed(){
        _eventNewGame.value = true
    }

    fun onPlayAgainComplete(){
        _eventNewGame.value = false
    }
}