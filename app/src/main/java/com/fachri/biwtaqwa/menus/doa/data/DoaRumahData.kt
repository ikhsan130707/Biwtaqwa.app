package com.fachri.biwtaqwa.menus.doa.data

import com.fachri.biwtaqwa.menus.doa.data.model.DoaModel

object DoaRumahData {    private val doaTitle = arrayOf(
    "Doa berpakaian",
    "Doa masuk wc",
    "Doa keluar wc",
    "Doa masuk rumah",
    "Doa keluar rumah"
)

    private val doaDoa = arrayOf(
        "لْحَمْدُ لِلّهِ الَّذِي كَسَانِي هَذَا (الثَّوْبَ) وَرَزَقَنِيهِ مِنْ غَـيـْرِ حَوْلٍ مِنِّي وَلَا قُـوَّةٍ",
        "بِسْمِ اللَّهِ. اللَّهُـمَّ إِنِّي أَعُـوذُ بِـكَ مِـنَ الْخُـبْثِ وَالْخَبَائِثِ",
        "غُفْرَانَكَ",
        "بِسْـمِ اللّهِ وَلَجْنـَا، وَبِسْـمِ اللّهِ خَـرَجْنـَا، وَعَلَـى رَبِّنـَا تَوَكّلْـنَا",
        "بِسْمِ اللَّهِ تَوَكَّلْـتُ عَلَى اللَّهِ، وَلاَ حَوْلَ وَلاَ قُـوَّةَ إِلاَّ بِاللَّهِ"

    )

    private val doaTranslate = arrayOf(
        "Segala puji bagi Allah Yang telah memberikan pakaian ini kepadaku sebagai rezeki dari-pada-Nya tanpa daya dan kekuatan dari-ku.",
        "Dengan nama Allah. Ya Allah, sesungguhnya aku berlindung kepada-Mu dari godaan setan laki-laki dan perempuan.",
        "Aku minta ampun kepada-Mu.",
        "Dengan nama Allah, kami masuk (ke rumah), dengan nama Allah, kami keluar (darinya) dan kepada Tuhan kami, kami bertawakkal”. Kemudian mengucapkan salam kepada keluarga-nya.",
        "Dengan nama Allah (aku keluar). Aku bertawakkal kepada-Nya, dan tiada daya dan kekuatan kecuali karena pertolongan Allah."
    )

    private val doaLatin = arrayOf(
        "Alhamdu lillaahil-ladzii kasaanii haadzaa (aththawba) wa razaqaniihi min ghayri hawlim-minnii wa laa quwwatin",
        "Bismillaahi. Allaahumma 'innii a'uudzubika minal-khubthi walkhabaa'ith",
        "Ghufraanaka",
        "Bismillaahi walajnaa, wa bismillaahi kharajnaa, wa 'alaaRabbinaa tawakkalnaa",
        "Bismillaahi, tawakkaltu 'alallaahi, wa laa hawla wa laa quwwata ‘ illaa billaah"
    )

    private val doaProfile = arrayOf(
        "Hadist Riwayat Bukhari, Muslim, Ibnu Majah, dan At-Tirmidzi",
        "Hadist Riwayat Bukhari dan Fathul Bari'",
        "Hadist Riwayat Abu Dawud, Ibnu Majah, At-Tirmidzi, An-Nasa'i, Al-Qayyim's Zadul-Ma'ad",
        "Hadist Riwayat Abu Dawud",
        "Hadist Riwayat Abu Dawud, At-Tirmidzi, Al-Albani, dan Shohih At-Tirmidzi"
    )

    val listDoaRumahData: ArrayList<DoaModel>
        get() {
            val list = arrayListOf<DoaModel>()
            for (position in doaTitle.indices) {
                val doa = DoaModel()
                doa.title = doaTitle[position]
                doa.doa = doaDoa[position]
                doa.translate = doaTranslate[position]
                doa.latin = doaLatin[position]
                doa.profile = doaProfile[position]
                list.add(doa)
            }
            return list
        }
}
