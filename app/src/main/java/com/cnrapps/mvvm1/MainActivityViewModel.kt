package com.cnrapps.mvvm1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// class viewmodel çevirecek şekilde ayarlanır
class MainActivityViewModel: ViewModel() {

    var sonuc = MutableLiveData<String>()
    var mrepo = Repository()

    init{
        sonuc = mrepo.sonucGetir()
    }

    fun topla(alinanSayi1: String, alinanSayi2: String){

        mrepo.topla(alinanSayi1, alinanSayi2)
    }

    fun carp(alinanSayi1: String, alinanSayi2: String){

        mrepo.carp(alinanSayi1, alinanSayi2)
    }
}