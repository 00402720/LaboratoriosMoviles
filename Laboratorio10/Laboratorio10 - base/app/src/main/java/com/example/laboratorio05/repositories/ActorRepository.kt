package com.example.laboratorio05.repositories

import com.example.laboratorio05.data.dao.ActorDao
import com.example.laboratorio05.data.model.ActorModel
import com.example.laboratorio05.data.model.MovieModel

class ActorRepository(private val actorDao: ActorDao) {
    // Get All Actors method
    suspend fun getActors() = actorDao.getAllActors()

    // Insert Actor method
    suspend fun insertActor(actor : ActorModel) = actorDao.insertActor(actor)
}