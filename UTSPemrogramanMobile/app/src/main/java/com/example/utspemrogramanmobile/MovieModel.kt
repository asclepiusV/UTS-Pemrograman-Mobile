package com.example.utspemrogramanmobile

import java.time.Year

var movielist = mutableListOf<MovieModel>()

val MOVIE_EXTRA = "movieExtra"

class MovieModel (
    val image:Int,
    val title:String,
    val genre:String,
    val year: String,
    val desc:String,
    val ytID:String,
    val id: Int? = movielist.size
)

