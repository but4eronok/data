package com.example.data

import com.example.data.persistance.repository.HobbyRepository
import com.example.data.persistance.repository.PersonRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DataApplication(

    private val hobbyRepository: HobbyRepository,
    private val personRepository: PersonRepository
) : CommandLineRunner {
    override fun run(vararg args: String?) {

        val allHobbies = hobbyRepository.findAllHobbies()
        println(allHobbies)

        val foundPersonByName = personRepository.findByName("Anna")
        println(foundPersonByName)

        val foundByHobby = personRepository.findByHobby_Name("Box")
        println(foundByHobby)
    }


}

fun main(args: Array<String>) {
    runApplication<DataApplication>(*args)
}