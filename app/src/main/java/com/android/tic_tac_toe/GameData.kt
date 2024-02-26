package com.android.tic_tac_toe

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object GameData {   //Singleton Object
    private var _gameModel : MutableLiveData<GameModel> = MutableLiveData()
    var gameModel : LiveData<GameModel> = _gameModel

    fun saveGameModel(model : GameModel){
        _gameModel.postValue(model)
    }
}