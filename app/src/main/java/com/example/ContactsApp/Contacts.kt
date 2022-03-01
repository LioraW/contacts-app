package com.example.ContactsApp

import android.content.res.Resources
import android.content.res.TypedArray

class Contacts(res : Resources) {

    var names: Array<String> = res.getStringArray(R.array.contactNames)
    var addresses : Array<String> = res.getStringArray(R.array.contactAddresses)
    var numbers : Array<String> = res.getStringArray(R.array.contactNumbers)
    var emails : Array<String> = res.getStringArray(R.array.contactEmails)
    var images : TypedArray = res.obtainTypedArray(R.array.contactImages)

    fun getContactName(id : Int): String {
        return names[id]
    }
    fun getContactAddress(id : Int): String {
        return addresses[id]
    }
    fun getContactNumber(id : Int): String {
        return numbers[id]
    }
    fun getContactEmail(id : Int): String {
        return emails[id]
    }
    fun getContactImageId(id : Int): Int {
        return images.getResourceId(images.getIndex(id), -1)
    }

    fun getContactListSize(): Int {
        return names.size
    }
}