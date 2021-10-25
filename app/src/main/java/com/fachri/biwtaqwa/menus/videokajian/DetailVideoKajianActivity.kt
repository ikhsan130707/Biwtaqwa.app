package com.fachri.biwtaqwa.menus.videokajian

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fachri.biwtaqwa.R
import com.fachri.biwtaqwa.databinding.ActivityDetailVidioKajianBinding
import com.fachri.biwtaqwa.menus.videokajian.model.VidioKajianModel
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class DetailVideoKajianActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_VIDEO_KAJIAN = "extra_video_kajian"
    }

    private lateinit var binding: ActivityDetailVidioKajianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailVidioKajianBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val video = intent.getParcelableExtra<VidioKajianModel> (EXTRA_VIDEO_KAJIAN) as VidioKajianModel

        initView(video)
    }

    //mensetting video youtube player agar bisa berjalan dengan baik
    private fun initView(video: VidioKajianModel) {
        val youTubePlayerView: YouTubePlayerView = findViewById(R.id.player_video)
        lifecycle.addObserver(youTubePlayerView)

        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(video.urlVidio, 0f)
            }
        })

        binding.tvChannel.text = video.Channel
        binding.tvTitle.text = video.title
        binding.tvSpeaker.text = video.speaker
        binding.tvSummary.text = video.summary

        binding.ivShare.setOnClickListener{
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(
                Intent.EXTRA_TEXT,
                // Memasukan title dengan data yang sudah di set dengan mengambil dari VideoKajianData
                "Kajian Dengan Judul \"${video.title}\" dibawakan oleh \"${video.speaker}\" " +
                        "dan dari channel \"${video.Channel}\" \n\n\n Link Video https://youtube.com/watch?v=${video.urlVidio}"
            )
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        }

    }
}