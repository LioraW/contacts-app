package com.example.myrecyclerviewapp2

import android.content.Context
import android.content.res.Resources
import android.content.res.TypedArray

class Contacts(private val context : Context) {
    private val res : Resources = context.resources

    var names: Array<String> = res.getStringArray(R.array.contactNames)
    var addresses : Array<String> = res.getStringArray(R.array.contactAddresses)
    var numbers : Array<String> = res.getStringArray(R.array.contactNumbers)
    var emails : Array<String> = res.getStringArray(R.array.contactEmails)
    var images : TypedArray = res.obtainTypedArray(R.array.contactImages)
}