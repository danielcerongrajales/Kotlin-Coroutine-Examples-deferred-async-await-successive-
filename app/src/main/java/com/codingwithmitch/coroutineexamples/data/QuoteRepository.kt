package com.codingwithmitch.coroutineexamples.data

import com.codingwithmitch.coroutineexamples.data.model.help
import com.codingwithmitch.coroutineexamples.data.network.QuoteService


class QuoteRepository {
    private val api= QuoteService()
    suspend fun getAllQuotes(query:String): help {
        val response=api.fakeApiRequest(query)
//        QuoteProvider.quotes=response
            return response
    }
}