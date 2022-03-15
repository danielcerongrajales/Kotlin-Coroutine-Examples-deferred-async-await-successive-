package com.codingwithmitch.coroutineexamples

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.codingwithmitch.coroutineexamples.databinding.ItemClimaBinding
import com.squareup.picasso.Picasso

class DogViewHolder (private val binding: ItemClimaBinding): RecyclerView.ViewHolder(binding.root){

    fun bind(image:String){
//        Picasso.get().load(image).into(binding.ivDog)

    }
}