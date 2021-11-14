package com.example.data.persistance.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Hobby(
    @Id
    @GeneratedValue
    var id: Long = 0,
    var name: String,
)