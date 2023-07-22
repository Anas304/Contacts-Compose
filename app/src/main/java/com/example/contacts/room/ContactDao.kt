package com.example.contacts.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {

    @Upsert
    suspend fun upsertContact(contact: Contact)

    @Delete
    suspend fun deleteContact(contact: Contact)

    @Query("SELECT * FROM contact_table ORDER BY firstName ASC")
    fun getContactOrderByFirstName(): Flow<List<Contact>>

    @Query("SELECT * FROM contact_table ORDER BY lastName ASC")
    fun getContactOrderByLastName(): Flow<List<Contact>>

    @Query("SELECT * FROM contact_table ORDER BY phoneNumber ASC")
    fun getContactOrderByPhoneNumber(): Flow<List<Contact>>

}