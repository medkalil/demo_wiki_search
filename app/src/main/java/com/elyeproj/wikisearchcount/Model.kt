package com.elyeproj.wikisearchcount

//this will convert from our json data to our model soo we can use it as model
object Model {
    data class Result(val query: Query)
    data class Query(val searchinfo: SearchInfo)
    data class SearchInfo(val totalhits: Int)
}
