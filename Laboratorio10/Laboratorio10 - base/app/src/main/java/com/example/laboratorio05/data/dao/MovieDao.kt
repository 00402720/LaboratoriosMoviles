package com.example.laboratorio05.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.laboratorio05.data.model.MovieModel
import com.example.laboratorio05.data.model.MovieWithActor

@Dao
interface MovieDao {
    //Get all movies method
    @Query("SELECT * from movie_table")
    suspend fun getAllMovies() : List<MovieModel>

    //Insert Movie method
    @Transaction
    @Insert
    suspend fun insertMovie(movie : MovieModel)

    // Get Movie With Actors By Id method
    @Query("SELECT * from movie_table WHERE movieId = :movieId")
    suspend fun getMovieWithActorsById(movieId : Int) : MovieWithActor?
}