package com.example.laboratorio05.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.laboratorio05.data.model.ActorModel

@Dao
interface ActorDao {
    // Get All Actors method
    @Query("SELECT * from actor_table")
    suspend fun getAllActors() : List<ActorModel>

    // Insert Actor method
    @Transaction
    @Insert
    suspend fun insertActor(actor : ActorModel)

    // Add Actor
}