package com.codingwithmitch.coroutineexamples.data.network

import android.util.Log
import com.codingwithmitch.coroutineexamples.core.RetrofitHelper
import com.codingwithmitch.coroutineexamples.data.model.Coord
import com.codingwithmitch.coroutineexamples.data.model.Forecast
import com.codingwithmitch.coroutineexamples.data.model.NewInitial
import com.codingwithmitch.coroutineexamples.data.model.help
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


import retrofit2.Response

class QuoteService {
    private val retrofit = RetrofitHelper.getRetrofit()



    private suspend fun getResult1FromApi(query:String): Coord {
        val response = retrofit.create(ApiClient::class.java).getCurrentDate("$query","e809abfb3605c58c4fbd8ac49981fec1")
        val perros=response.body()
//        Log.d("ptm", "getResult1FromApi: $perros")

//        if(call.isSuccessful){
//            perros?.coord?.lat
//            perros?.coord?.lon

//            val images:List<String> = perros?.image ?: emptyList()
//            dogImages.clear()
//            dogImages.addAll(images)
//            adapter.notifyDataSetChanged()
//        }else{
            /*     call.errorBody()*/
//            showError()

//        }

        return  perros!!.coord

    }

     suspend fun getResult2FromApi(result1: Coord): Forecast {
        val response =retrofit.create(ApiClient::class.java).getDogsBy(result1.lat,result1.lon,"e809abfb3605c58c4fbd8ac49981fec1")
        val perros=response.body()
//        Log.d("ptm", "getResult2FromApi: $perros")
        return perros!!
    }
    suspend fun fakeApiRequest(query:String): help {
        lateinit var result2:Forecast
        lateinit var result1: Coord
        lateinit var resultF: help
        withContext(Dispatchers.IO) {

            val job1 = launch{
                result1 = getResult1FromApi(query)
            }
            job1.join()
            result2 = async {
                getResult2FromApi(result1)
            }.await()
            resultF= help(result2,result1)

        }
        return resultF
    }

}