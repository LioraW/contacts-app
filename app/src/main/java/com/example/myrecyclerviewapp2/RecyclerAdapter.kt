package com.example.myrecyclerviewapp2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerviewapp2.databinding.CardLayoutBinding

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    //create some data
    // Could come from some other file
    private var titles = arrayOf("Title 1", "Title 2","Title 3","Title 4","Title 5","Title 6","Title 7","Title 8","Title 9","Title 10",)
    private var details = arrayOf("Details 1", "Details 2","Details 3","Details 4","Details 5","Details 6","Details 7","Details 8","Details 9","Details 10",)
    private var images = arrayOf(R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,)

    inner class ViewHolder(val binding : CardLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener{
                val position: Int = bindingAdapterPosition
                Toast.makeText(itemView.context, "Clicked on ${titles[position]}", Toast.LENGTH_SHORT ).show()
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
                itemImage.setImageResource(images[position])
                itemTitle.text = titles[position]
                itemDetails.text = details[position]
            }
        }
    }

    override fun getItemCount(): Int {
        return titles.size
    }
}