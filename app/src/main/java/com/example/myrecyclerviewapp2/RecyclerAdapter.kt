package com.example.myrecyclerviewapp2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    //create some data
    // Could come from some other file
    private var titles = arrayOf("Title 1", "Title 2","Title 3","Title 4","Title 5","Title 6","Title 7","Title 8","Title 9","Title 10",)
    private var details = arrayOf("Details 1", "Details 2","Details 3","Details 4","Details 5","Details 6","Details 7","Details 8","Details 9","Details 10",)
    private var images = arrayOf(R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,)

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage : ImageView = itemView.findViewById(R.id.item_image)
        var itemTitle : TextView = itemView.findViewById(R.id.item_title)
        var itemDetails : TextView = itemView.findViewById(R.id.item_details)


        init {
            itemView.setOnClickListener{
                val position: Int = bindingAdapterPosition

                Toast.makeText(itemView.context, "Clicked on ${titles[position]}", Toast.LENGTH_SHORT ).show()
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false) //inflate the layout
        return ViewHolder(v) //now recycler view has an instance of this viewHolder .... ???
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) { //almost always the same. we have to pass the instance of the title, postion
        holder.itemImage.setImageResource(images[position])
        holder.itemTitle.text = titles[position]
        holder.itemDetails.text = details[position]

    }

    override fun getItemCount(): Int {
        return titles.size
    }
}