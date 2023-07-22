package com.example.contacts.state

import com.example.contacts.events.SortType
import com.example.contacts.room.Contact

data class ContactState(
    val contacts : List<Contact> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val isAddingContact : Boolean = false,
    val sortType: SortType = SortType.FIRSTNAME
    )
