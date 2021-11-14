package com.example.data.persistance.repository

import com.example.data.persistance.entity.Person
import org.springframework.data.repository.CrudRepository


interface PersonRepository : CrudRepository<Person, Long> {
    fun findByName(name: String): List<Person>

    fun findByHobby_Name(name: String): List<Person>
}