package com.example.service_127

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_google.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
            startActivity(i)
        })

        btn_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"))
            startActivity(i)
        })

        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.mymusic)

        btn_play.setOnClickListener{
            MediaPlayer?.start()
        }

        btn_pause.setOnClickListener{
            MediaPlayer?.pause()
        }

        btn_stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
