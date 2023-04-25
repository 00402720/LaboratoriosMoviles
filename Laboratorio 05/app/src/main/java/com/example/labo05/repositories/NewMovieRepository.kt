package com.example.labo05.repositories

import com.example.labo05.data.MovieModel

class NewMovieRepository(private val movies : MutableList<MovieModel>) {

    fun getMovies() = movies

    fun addMovies(movie : MovieModel) = movies.add(movie)
}