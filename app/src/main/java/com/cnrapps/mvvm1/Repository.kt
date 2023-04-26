package com.cnrapps.mvvm1

import androidx.lifecycle.MutableLiveData

class Repository {

    // değişken türü live data da kullanılması için bu şekilde oluşturulur.
    //live data kullanılmayacaksa bir değer atanmalı
    var sonuc = MutableLiveData<String>()

    // eğer liveData kullanılmayacaksa init bloğu gereksiz.
    init{
        // değişkene default value verilir
        sonuc = MutableLiveData<String>("0")
    }

    fun sonucGetir(): MutableLiveData<String>{
        return sonuc
    }

    fun topla(alinanSayi1: String, alinanSayi2: String){

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val toplam = sayi1 + sayi2

        //mutable değişkene doğrudan değer atanamaz .value şeklinde atanabilir.
        // eğer liveData kullanılmayacaksa .value gereksiz.
        sonuc.value = toplam.toString()
    }

    fun carp(alinanSayi1: String, alinanSayi2: String){

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val carpim = sayi1 * sayi2

        //mutable değişkene doğrudan değer atanamaz .value şeklinde atanabilir.
        // eğer liveData kullanılmayacaksa .value gereksiz.
        sonuc.value = carpim.toString()
    }
}