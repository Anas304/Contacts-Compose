package com.example.contacts.events

import com.example.contacts.room.Contact

sealed interface ContactEvents{

    object ShowDialog : ContactEvents
    object HideDialog : ContactEvents
    object SaveContact : ContactEvents
    data class SetFirstName(val firstName : String) : ContactEvents
    data class SetLastName(val lastName : String) : ContactEvents
    data class SetPhoneNumber(val phoneNumber : String) : ContactEvents
    data class SortContact(val sortType: SortType) : ContactEvents
    data class DeleteContact(val contact: Contact) : ContactEvents


}