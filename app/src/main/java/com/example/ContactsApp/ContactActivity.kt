package com.example.ContactsApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        //get the contacts
        val contacts = Contacts(applicationContext.resources)

        //item Id
        val contactId = intent.getIntExtra("ContactId", -1)

        //item values
        val firstName = contacts.getContactFirstName(contactId)
        val lastName = contacts.getContactLastName(contactId)
        val address = contacts.getContactAddress(contactId)
        val number = contacts.getContactNumber(contactId)
        val email = contacts.getContactEmail(contactId)
        val imageId = contacts.getContactImageId(contactId)

        //item containers
        val contactName = findViewById<TextView>(R.id.contact_name)
        val contactAddress = findViewById<TextView>(R.id.contact_address)
        val contactNumber = findViewById<TextView>(R.id.contact_number)
        val contactEmail = findViewById<TextView>(R.id.contact_email)
        val contactImage = findViewById<ImageView>(R.id.contact_image)

        //put the values in the containers
        val fullName = "$firstName $lastName"

        contactName.text = fullName
        contactAddress.text = address
        contactNumber.text = number
        contactEmail.text = email
        contactImage.setImageResource(imageId)

    }
}