package com.codingwithmitch.coroutineexamples.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codingwithmitch.coroutineexamples.data.model.help
import com.codingwithmitch.coroutineexamples.domain.GetQuotesUseCase

import kotlinx.coroutines.launch

class QuoteViewModel : ViewModel (){

   val quoteModel=MutableLiveData <help> ()
    var getQuotesUseCase= GetQuotesUseCase()

    fun onCreate(query:String) {
        viewModelScope.launch{

            val result=getQuotesUseCase(query)
//            if(!result.isNullOrEmpty()){
                quoteModel.postValue(result!!)
            Log.d("ptm", result.forecast.toString())
//            }


        }
    }



}