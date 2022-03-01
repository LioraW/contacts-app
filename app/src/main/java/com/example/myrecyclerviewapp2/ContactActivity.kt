package com.example.myrecyclerviewapp2

import android.content.res.Resources
import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.TypedArrayUtils.getResourceId
import org.w3c.dom.Text

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val res : Resources = applicationContext.resources

        val contactName = findViewById<TextView>(R.id.contact_name)
        val contactAddress = findViewById<TextView>(R.id.contact_address)
        val contactNumber = findViewById<TextView>(R.id.contact_number)
        val contactEmail = findViewById<TextView>(R.id.contact_email)
        val contactImage = findViewById<ImageView>(R.id.contact_image)

        val contactId = intent.getIntExtra("ContactId", -1)

        val name = res.getStringArray(R.array.contactNames)[contactId]
        val address = res.getStringArray(R.array.contactAddresses)[contactId]
        val number = res.getStringArray(R.array.contactNumbers)[contactId]
        val email = res.getStringArray(R.array.contactEmails)[contactId]
        val imageId = res.obtainTypedArray(R.array.contactImages).getResourceId(contactId, -1)


        //val image = intent.get //see https://stackoverflow.com/questions/12210156/passing-the-image-in-putextra-in-android

        contactName.text = name
        contactAddress.text = address
        contactNumber.text = number
        contactEmail.text = email
        contactImage.setImageResource(imageId)


    }
}