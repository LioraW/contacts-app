package com.example.ContactsApp

import android.content.Intent
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ContactsApp.databinding.CardLayoutBinding


class RecyclerAdapter(resources : Resources): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var contacts : Contacts = Contacts(resources)

    inner class ViewHolder(val binding : CardLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener{

                val position: Int = bindingAdapterPosition

                val intent = Intent(itemView.context, ContactActivity::class.java) //from this package to contactActivity, we want to call this activity
                intent.putExtra("ContactId", position)

                itemView.context.startActivity(intent) //run the activity 2

            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val binding = CardLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) { //almost always the same. we have to pass the instance of the title, position
        with(holder){
            with(binding){
                itemImage.setImageResource(contacts.getContactImageId(position))
                itemTitle.text = contacts.getContactName(position)
                itemDetails.text = contacts.getContactAddress(position)

                ///images.recycle() //apparently you should recycle it
            }
        }
    }

    override fun getItemCount(): Int {
        return contacts.getContactListSize()
    }
}