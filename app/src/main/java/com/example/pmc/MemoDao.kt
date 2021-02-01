package com.example.pmc

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.pmc.MemoEntity

@Dao
interface MemoDao{
    @Query("SELECT * FROM memo")
    fun getALL(): List<MemoEntity>
    @Query("SELECT * FROM memo  ORDER BY `key` DESC LIMIT 2" )
    fun getTwo():List<MemoEntity>
    @Insert(onConflict=REPLACE)
    fun insert(memo:MemoEntity)
    @Query("DELETE from memo")
    fun deleteALL()
}