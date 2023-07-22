package com.example.contacts

import com.example.contacts.events.SortType
import com.example.contacts.room.Contact

data class ContactState(
    val contacts : List<Contact> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val sortType: SortType = SortType.FIRSTNAME
    )
