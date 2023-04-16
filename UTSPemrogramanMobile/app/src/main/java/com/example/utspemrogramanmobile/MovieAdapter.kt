package com.example.utspemrogramanmobile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.utspemrogramanmobile.databinding.CardListBinding

class MovieAdapter(val movieModel: List<MovieModel>, private val clickListener: MovieClickListener) : RecyclerView.Adapter<MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardListBinding.inflate(from, parent, false)
        return  MovieViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindMovie(movieModel[position])
    }

    override fun getItemCount(): Int = movielist.size
}