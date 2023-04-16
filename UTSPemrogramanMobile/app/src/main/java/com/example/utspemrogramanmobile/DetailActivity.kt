package com.example.utspemrogramanmobile

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.utspemrogramanmobile.databinding.ActivityDetailBinding
import com.example.utspemrogramanmobile.databinding.ActivityMainBinding
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import java.net.URL

class DetailActivity : AppCompatActivity() {
    companion object {
        const val YT_PREFIX = "https://www.youtube.com/embed/"
    }
    private lateinit var webView: WebView
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movieID = intent.getIntExtra(MOVIE_EXTRA, -1)
        val movie = movieFromIF(movieID)


        val webView: WebView = findViewById(R.id.webview)
        webView.setWebChromeClient(WebChromeClient())
        webView.setWebViewClient(WebViewClient())
        webView.getSettings().setJavaScriptEnabled(true)
        webView.getSettings().setDomStorageEnabled(true)

        val link = DetailActivity.YT_PREFIX+ (movie?.ytID)
        webView.loadUrl(link)
        if (movie != null){
            binding.posterMovie.setImageResource(movie.image)
            binding.titleMovie.text = movie.title
            binding.genreMovie.text = movie.genre
            binding.yearMovie.text = movie.year
            binding.descMovie.text = movie.desc
            }
        }
    }

    private fun movieFromIF(movieID: Int): MovieModel? {
        for(movie in movielist){
            if(movie.id == movieID)
                return movie
        }
        return null

    }
