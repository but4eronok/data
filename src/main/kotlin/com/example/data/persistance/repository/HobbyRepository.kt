package com.example.data.persistance.repository

import com.example.data.persistance.entity.Hobby
import org.springframework.data.jpa.repository.Query

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface HobbyRepository: CrudRepository<Hobby, Long> {
    @Query("SELECT DISTINCT h.name FROM Hobby h")
    fun findAllHobbies() : List<String>
}