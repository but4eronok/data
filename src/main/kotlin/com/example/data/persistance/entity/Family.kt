package com.example.data.persistance.entity

import javax.persistence.*

@Entity
class Family(
    @Id
    @GeneratedValue
    var id: Long = 0,
    var name: String,

    )