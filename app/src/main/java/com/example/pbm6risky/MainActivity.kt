package com.example.pbm6risky

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

        // button facebook jika diklik akan menampilkan halaman facebook com
        buttonfb.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse
                ("https://www.facebook.com/profile.php?id=100015375634620"))
            startActivity(i)
        }
        buttonig.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse
                ("https://www.instagram.com/kikurbuddy/?hl=id"))
            startActivity(i)
        }

        //Mendeklarasikan variabel MediaPlayer dan memanggil data mp3
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.demons)
        btn_play.setOnClickListener {
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
