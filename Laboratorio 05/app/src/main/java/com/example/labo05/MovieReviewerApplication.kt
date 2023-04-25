package com.example.labo05

import android.app.Application
import com.example.labo05.data.movies
import com.example.labo05.repositories.NewMovieRepository

class MovieReviewerApplication : Application(){
    val movieRepository : NewMovieRepository by lazy {
        NewMovieRepository(movies)
    }
}