package com.codingwithmitch.coroutineexamples

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codingwithmitch.coroutineexamples.databinding.ItemClimaBinding

class DogAdapter(val images:List<String>): RecyclerView.Adapter<DogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val  binding = ItemClimaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DogViewHolder(binding)
    }
    override fun getItemCount(): Int =images.size
    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item:String =images[position]
        holder.bind(item)

    }


}