package com.fachri.biwtaqwa.menus.videokajian.data

import com.fachri.biwtaqwa.R
import com.fachri.biwtaqwa.menus.videokajian.model.VidioKajianModel

object VidioKajianData {

    private val thumbnailVideo = intArrayOf(
        R.drawable.thumbnail_video_kajian_1,
        R.drawable.thumbnail_video_kajian_2,
        R.drawable.thumbnail_video_kajian_3,
        R.drawable.thumbnail_video_kajian_4,
        R.drawable.thumbnail_video_kajian_5
    )

    private val channelVideo = arrayOf(
        "Khalid Basalamah Official",
        "Firanda Andirja",
        "Yufid.TV",
        "Rodja TV",
        "Rumaysho TV"
    )

    private val speakerVideo = arrayOf(
        "Ustadz Khalid Basalamah",
        "Ustadz Dr. Firanda Andirja, M.A.",
        "Ustadz Abdurrahman Thoyib, Lc",
        "Ustadz Abu Fairuz Ahmad Ridwan, M.A.",
        "Ustadz M Abduh Tuasikal"
    )

    private val titleVideo = arrayOf(
        "Berbakti kepada Orang Tua",
        "Bentuk Syukur",
        "Tujuan Hidup",
        "Surga Tidak Dicapai dengan Kelalaian",
        "Jangan Buang-Buang Waktu"
    )

    private val urlVideo = arrayOf(
        "QQsJ5GuiFhM",
        "poeEN1XVGk4",
        "nFr1Jj1KxVk",
        "ui74ovJ6tSU",
        "xzovFDz2ul8"
    )

    private val summaryVideo = arrayOf(
        "Orang tua adalah pintu surga kita, maka maksimalkanlah untuk mengejar ridha Alloh Subhanahu Wa Ta'ala selama orang tua kita masih hidup. Berbuat baiklah kepada kedua orang tua mu, dan jangan pernah berperilaku buruk kepada mereka. Berbakti kepada orang tua termasuk amalan yang paling Alloh cintai setelah Sholat pada waktunya. Raihlah kedua orang tuamu, jadikanlah mereka sebagai ajang untuk masuk ke dalam surga dan mendapat ridha Allah Subhanahu Wa Ta'Ala. Amiin.",
        "Jika Allah memberikan kita harta, maka tunjukanlah Alloh memberikan harta kepada kita, artinya berpakaianlah yang baik bukan karena engkau memiliki sifat sombong tetapi itu termasuk rasa syukur kita kepada Allah, asalkan tidak berlebih-lebihan. Diantara bentuk bersyukur dengan anggota badan yaitu sholat, beribadah, shalat malam. sedekah, mengikuti kajian, dan lain-lain.",
        "Seseorang yang ketika dia keluar dari rumahnya, pasti dia memiliki tujuan kemana dia akan melangkah. Orang yang hidup di dunia tanpa tujuan maka dia akan banyak tersesat, dia akan menyimpang dari jalan yang benar. Tujuan hidup kita yang sebenarnya adalah untuk kita beribadah kepada Alloh. Karena Alloh yang menciptakan dan menghidupkan kita. Marilah kita bersama sama melangkahkan kaki kita menuju dengan tujuan yang satu yaitu beribadah kepada Alloh dan menyusuri jejak Rosulullah Shallalahu 'Alaihi Wa Sallam. Semoga Alloh Subhanahu Wa Ta'Ala mengakhiri hidup kita dengan khusnul khatimah. Amiin.",
        "Pada hakikatnya hakikat manusia senang dengan segala macam bentuk kelalaian, sementara surga tidak bisa tercapai dengan berleha-leha, harus dengan mengerjakan perintah-perintah Alloh. Semua perintah-perintah Alloh yang hakikat nya beban, akan terasa ringan untuk orang-orang yang beriman.",
        "Manfaatkanlah waktu hidupmu sebelum maut menjemputmu. Kita berada di pagi hari saat ini, ada kesempatan kita untuk beramal, bersedekah , berilmu, maka janganlah kita tunda-tunda sampai datang sore ,begitu juga jika kita mendapat kesempatan pada sore hari, jangan menunda-nunda sampai pagi. Rasulullah memerintahkan kita untuk memanfaatkan waktu sebisa mungkin, janganlah kita menunda-nunda amalan-amalan kebaikan. Mari kita memikirkan hidup kita, jangan panjang angan2, karena se waktu-waktu Alloh akan menjemput kita."
    )

    val listData: ArrayList<VidioKajianModel>
        get() {
            val list = arrayListOf<VidioKajianModel>()
            for (position in channelVideo.indices) {
                val video = VidioKajianModel()
                video.thumbnail = thumbnailVideo[position]
                video.Channel = channelVideo[position]
                video.speaker = speakerVideo[position]
                video.title = titleVideo[position]
                video.urlVidio = urlVideo[position]
                video.summary = summaryVideo[position]
                list.add(video)
            }
            return list
        }
}