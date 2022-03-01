package com.example.myrecyclerviewapp2

import android.app.Application
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerviewapp2.databinding.CardLayoutBinding


class RecyclerAdapter(val context : Context): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    //create some data
    // Could come from some other file
    private var contacts : Contacts = Contacts(context)
    private var names  = contacts.names
    private var addresses = contacts.addresses
    private var numbers = contacts.numbers
    private var emails = contacts.emails
    private var images = contacts.images


    inner class ViewHolder(val binding : CardLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener{
                val position: Int = bindingAdapterPosition
                val name = names[position]
                val address = addresses[position]
                val number = numbers[position]
                val email = emails[position]
                val image = images.getDrawable(position)

                val intent = Intent(itemView.context, ContactActivity::class.java) //from this package to contactActivity, we want to call this acitivity
                intent.putExtra("Name", name) // we have an extra called name
                intent.putExtra("Address", address)
                //intent.putExtra("Number", number)
                //intent.putExtra("Email", email)
                intent.putExtra("ContactId", position)
                ///intent.putExtra("Image", image)

                itemView.context.startActivity(intent) //run the activity 2

            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val binding = CardLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) { //almost always the same. we have to pass the instance of the title, postion
        with(holder){
            with(binding){
                itemImage.setImageResource(images.getResourceId(images.getIndex(position), -1)) //https://stackoverflow.com/questions/58628096/kotlin-get-image-from-image-array-in-drawable-folder
                itemTitle.text = names[position]
                itemDetails.text = addresses[position]

                //apparently you have to recycle it
                ///images.recycle()
            }
        }
    }

    override fun getItemCount(): Int {
        return names.size
    }
}