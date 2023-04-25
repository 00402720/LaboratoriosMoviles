package com.example.labo05.ui.movie

import android.view.LayoutInflater.Factory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.labo05.MovieReviewerApplication
import com.example.labo05.data.MovieModel
import com.example.labo05.repositories.NewMovieRepository

class MovieViewModel(private val repository: NewMovieRepository) : ViewModel(){

    fun getMovies() = repository.getMovies()

    fun addMovies(movie : MovieModel) = repository.addMovies(movie)

    companion object{
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as MovieReviewerApplication
                MovieViewModel(app.movieRepository)
            }
        }
    }
}