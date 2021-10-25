package com.fachri.biwtaqwa.menus.doa.data

import com.fachri.biwtaqwa.menus.doa.data.model.DoaModel

object DoaMakanMinumData {private val doaTitle = arrayOf(
    "Doa berbuka puasa",
    "Doa sebelum makan",
    "Doa setelah makan"
)

    private val doaDoa = arrayOf(
        "ذَهَبَ الظَّمَأُ وَابْتَلَّتِ الْعُرُوقُ، وَثَبَتَ الأَجْرُ إِنْ شَاءَ اللَّهُ",
        "بِسْمِ اللَّه",
        "الْحَمْدُ للَّهِ الَّذِي أَطْعَمَنِي هَذَا، وَرَزَقَنِيهِ، مِنْ غَيْرِ حَوْلٍ مِنِّي وَلَا قُوَّةٍ"
    )

    private val doaTranslate = arrayOf(
        "Telah hilang rasa haus, dan urat-urat telah basah serta pahala akan tetap, insya Allah.",
        "Dengan menyebut nama Allah.",
        "Segala puji bagi Allah Yang memberi makan ini kepadaku dan Yang memberi rezeki kepadaku tanpa daya dan kekuatanku."
    )

    private val doaLatin = arrayOf(
        "Dzahabadz-dzama'u wabtallatil-'urouqu, wa thabatal-'ajru 'inshaa'Allaah",
        "Bismillah",
        "Alhamdu lillaahil-ladzii 'at'amanii haadzaa, wa razaqaniihi, min ghayri hawlin minnii wa laa quwwatin"
    )

    private val doaProfile = arrayOf(
        "Hadist Riwayat Abu Dawud",
        "Hadist Riwayat Abu Dawud dan At-Tirmidzi",
        "Hadist Riwayat Abu Dawud, At-Tirmidzi, dan Ibnu Majah"
    )

    val listDoaMakananDanMinumanData: ArrayList<DoaModel>
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