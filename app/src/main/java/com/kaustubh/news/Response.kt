package com.kaustubh.news

data class Response(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)