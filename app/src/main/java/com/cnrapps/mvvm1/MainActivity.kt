package com.cnrapps.mvvm1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.cnrapps.mvvm1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var v: ActivityMainBinding
    //viewmodel nesnesi oluşturulur
    private val viewModel:MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //dataBinding işlemi.
        v = DataBindingUtil.setContentView(this, R.layout.activity_main)
        v.mainActivityNesnesi = this

        //değişken için liveData da oluşan değişimleri dinlemek için bir mekanizma oluşturulur.
        viewModel.sonuc.observe(this) { s ->
            v.hesaplamaSonucu = s
        }

        //live data kullanılmayacaksa sadece viewModel için bu şekilde.
        //v.hesaplamaSonucu = viewModel.sonuc

    }

    fun onClickTopla(alinanSayi1: String, alinanSayi2: String){

        viewModel.topla(alinanSayi1, alinanSayi2)

        //live data kullanılmayacaksa sadece viewModel için bu şekilde.
        //v.hesaplamaSonucu = viewModel.sonuc
    }

    fun onClickCarp(alinanSayi1: String, alinanSayi2: String){

        viewModel.carp(alinanSayi1, alinanSayi2)

        //live data kullanılmayacaksa bu şekilde.
        //v.hesaplamaSonucu = viewModel.sonuc
    }

}