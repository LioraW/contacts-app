package com.example.myrecyclerviewapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val contactName = findViewById<TextView>(R.id.contact_name)
        val contactAddress = findViewById<TextView>(R.id.contact_address)
        val contactNumber = findViewById<TextView>(R.id.contact_number)
        val contactEmail = findViewById<TextView>(R.id.contact_email)
        val contactImage = findViewById<ImageView>(R.id.contact_image)


        val name = intent.getStringExtra("Name")
        val address = intent.getStringExtra("Address")
        //val image = intent.get //see https://stackoverflow.com/questions/12210156/passing-the-image-in-putextra-in-android

        contactName.text = "$name"
        contactAddress.text = "$address"

    }
}