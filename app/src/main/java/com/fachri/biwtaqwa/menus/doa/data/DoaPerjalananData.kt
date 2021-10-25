package com.fachri.biwtaqwa.menus.doa.data

import com.fachri.biwtaqwa.menus.doa.data.model.DoaModel

object DoaPerjalananData { private val doaTitle = arrayOf(
    "Doa naik kendaraan",
    "Doa masuk pasar",
    "Doa musafir kepada orang yang di tingggalkan",
    "Doa orang muqim kepada musafir"
)

    private val doaDoa = arrayOf(
        "بِسْمِ اللَّهِ وَالْحَمْدُ لِلَّهِ، سُبْحَانَ الَّذِي سَخَّرَ لَناَ هَذَا وَمَا كُنَّا لَهُ مُقْرِنِينَ، وَإِنَّا إِلَى رَبِّنَا لَمُنْقَلِبُونَ، الْحَمْدُ لِلَّهِ، الْحَمْدُ لِلَّهِ، الْحَمْدُ لِلَّهِ، اللَّهُ أكْبَرُ، اللَّهُ أكْبَرُ، اللَّهُ أكْبَرُ، سُبْحَانَكَ اللَّهُمَّ إِنِّي ظَلَمْتُ نَفْسِي فَاغْفِرْ لِي، فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوبَ إِلَاَّ أَنْتَ",
        "لَا إِلَهَ إِلاَّ اللَّهُ وَحْدَهُ لَا شَرِيكَ لهُ، لَهُ الْمُلْكُ وَلهُ الْحَمْدُ، يُحْيِي وَيُمِيتُ وَهُوَ حَيٌّ لَا يَمُوتُ، بِيَدِهِ الْخَيْرُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ",
        "أَسْتَوْدِعُكُمُ اللَّهَ الَّذِي لَا تَضِيعُ وَدَائِعُهُ",
        "أَسْتَوْدِعُ اللَّهَ دِينَكَ، وَأَمَانَتَكَ، وَخَوَاتِيمَ عَمَلِكَ"
    )

    private val doaTranslate = arrayOf(
        "Dengan nama Allah, segala puji bagi Allah, Maha Suci Tuhan yang menundukkan kendaraan ini untuk kami, padahal kami sebelumnya tidak mampu menguasainya. Dan sesungguhnya kami akan kembali kepada Tuhan kami (di hari kiamat). Segala puji bagi Allah (3x), Maha Suci Engkau, ya Allah! Sesungguhnya aku menganiaya diriku, maka ampunilah aku. Sesungguhnya tidak ada yang dapat mengampuni dosa-dosa kecuali Engkau.",
        "Tidak ada Tuhan yang berhak disembah selain Allah, Yang Maha Esa, tiada sekutu bagi-Nya. Bagi-Nya kerajaan, bagi-Nya segala pujian. Dia-lah Yang Menghidupkan dan Yang Mematikan. Dia-lah Yang Hidup, tidak akan mati. Di tangan-Nya kebaikan. Dia-lah Yang Maha Kuasa atas segala sesuatu.",
        "Aku menitipkan kalian kepada Allah yang tidak akan hilang titipan-Nya.",
        "Aku menitipkan agama, amanah dan penutup amalmu."
    )

    private val doaLatin = arrayOf(
        "Bismillaah , Alhamdu lillaah. Subhaanal-ladzii sakhkhara lanaa haadzaa wa maa kunnaa lahu muqriniin. Wa 'innaa 'ilaa Rabbinaa lamunqalibuun . Alhamdu lillaah, alhamdu lillaah, alhamdu lillaah, Allaahu 'Akbar, Allaahu 'Akbar, Allaahu 'Akbar, subhaanakal-laahumma 'innii dzholamtu nafsii faghfir lii, fa innahu laa yaghfirudz-dzunuuba 'illaa  anta",
        "Laa'ilaaha 'illallaahu wahdahu laa shariika lahu, lahul-mulku wa lahul-hamdu, yuhyii wa yumiitu, wa Huwa hayyun laa yamuutu, biyadihil-khayru, wa Huwa 'alaa kulli shay'in Qadiir",
        "'Astawdi'ukumul-laahal-ladzii laa tadhii'u wadaa i'uhu",
        "'Astawdi'ullaaha diinaka, wa 'amaanataka, wa khawaatiima 'amalika."
    )

    private val doaProfile = arrayOf(
        "Hadist Riwayat Abu Dawud dan At-Tirmidzi",
        "Hadist Riwayat At-Tirmidzi dan Al-Hakim",
        "Hadist Riwayat Ahmad dan Ibnu Majah",
        "Hadist Riwayat Ahmad dan At-Tirmidzi"

    )

    val listDoaPerjalananData: ArrayList<DoaModel>
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
