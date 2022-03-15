package com.codingwithmitch.coroutineexamples.domain

import com.codingwithmitch.coroutineexamples.data.QuoteRepository
import com.codingwithmitch.coroutineexamples.data.model.help


class GetQuotesUseCase {
    private val repository= QuoteRepository()
    suspend operator fun invoke(sstring: String): help?= repository.getAllQuotes(sstring)

}