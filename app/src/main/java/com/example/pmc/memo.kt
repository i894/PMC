package com.example.pmc

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memo")
data class MemoEntity(
        @PrimaryKey(autoGenerate = true)val key:Long,
        var title: String = "",
        var content: String = "",
        var locate: String = "",
        var time: String = ""

)
