package com.example.contacts.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contacts.events.ContactEvents
import com.example.contacts.room.ContactDao
import com.example.contacts.state.ContactState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ContactViewModel(private val dao: ContactDao) : ViewModel() {

    private val _state = MutableStateFlow(ContactState())

    fun onEvent(event: ContactEvents) {
        when (event) {

            ContactEvents.HideDialog -> {
                _state.update {
                    it.copy(
                        isAddingContact = false
                    )
                }
            }

            ContactEvents.ShowDialog -> {
                _state.update {
                    it.copy(
                        isAddingContact = true
                ) }
            }
            ContactEvents.SaveContact -> TODO()
            is ContactEvents.DeleteContact -> {
                viewModelScope.launch { dao.deleteContact(event.contact)  }
            }
            is ContactEvents.SetFirstName -> {

            }
            is ContactEvents.SetLastName -> TODO()
            is ContactEvents.SetPhoneNumber -> TODO()
            is ContactEvents.SortContact -> TODO()

        }
    }


}