package com.example.utspemrogramanmobile

import androidx.recyclerview.widget.RecyclerView
import com.example.utspemrogramanmobile.databinding.CardListBinding

class MovieViewHolder(private val cardListBinding: CardListBinding, private val clickListener: MovieClickListener) : RecyclerView.ViewHolder(cardListBinding.root){
    fun bindMovie(movie: MovieModel)
    {
        cardListBinding.posterMovie.setImageResource(movie.image)
        cardListBinding.titleMovie.text = movie.title
        cardListBinding.genreMovie.text = movie.genre

        cardListBinding.cardView.setOnClickListener({
            clickListener.onClick(movie)
        })
    }
}