package com.example.laboratorio05.repositories

import androidx.room.Dao
import com.example.laboratorio05.data.dao.MovieDao
import com.example.laboratorio05.data.model.MovieModel

class MovieRepository(private val moviesDao: MovieDao) {

    // Get Movies method
    suspend fun getMovies() = moviesDao.getAllMovies()

    // Add Movies method
    suspend fun addMovies(movie: MovieModel) = moviesDao.insertMovie(movie)

    // Get Movies With Actors method
    suspend fun getMoviesWithActors(id: Int) = moviesDao.getMovieWithActorsById(id)
}