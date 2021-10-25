package com.fachri.biwtaqwa.menus.doa.data

import com.fachri.biwtaqwa.menus.doa.data.model.DoaModel

object EtikaBaikData { private val doaTitle = arrayOf(
    "Doa ketika bersin",
    "Doa ketika marah",
    "Doa dalam majelis",
    "Doa untuk orang yang berbuat kebaikan kepadamu"
)

    private val doaDoa = arrayOf(
        "(1)الْحَمْدُ للَّهِ(2)يَرْحَمُكَاللَّهُ(3)يَهْدِيكُمُ اللَّهُ وَيُصْلِحُ بَالَكُم",
        "أَعُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجيـمِ",
        "رَبِّ اغْفِرْ لِي وَتُبْ عَلَيَّ إِنَّكَ أَنْتَ التَّوَّابُ الْغَفُورُ",
        "جَزَاكَ اللَّهُ خَيْراً"
    )

    private val doaTranslate = arrayOf(
        "Rasulullah bersabda: “Apabila seseorang di antara kamu bersin, hendaklah mengucapkan: الْحَمْدُ لِلَّهِ Segala puji bagi Allah, Lantas saudara atau temannya mengucapkan: يَرْحَمُكَ اللهُ Semoga Allah memberi rahmat kepada-Mu, Bila teman atau saudaranya mengucapkan demikian, bacalah: يَهْدِيْكُمُ اللهُ وَيُصْلِحُ بَالَكُمْ Semoga Allah memberi petunjuk kepadamu dan memperbaiki keadaanmu.",
        "Aku berlindung kepada Allah dari godaan setan yang terkutuk.",
        "Wahai Tuhanku! Ampunilah aku dan terimalah taubatku, sesungguhnya Engkau Maha Menerima taubat lagi Maha Pengampun (di baca seratus kali sebelum berdiri dari majelis).",
        "Semoga Allah membalasmu dengan kebaikan."
    )

    private val doaLatin = arrayOf(
        "Alhamdu lillaah.(1)Yarhamukallaah.(2)Yahdiikumul-laahu wa yuslihu baalakum.(3)",
        "'A'uudzu billaahi minash-Shaytoonir-rajiim.",
        "Rabbighfir lii wa tub 'alayya 'innaka 'Antat-Tawwaabul-Ghofuur",
        "Jazaakallaahu khayran"
    )

    private val doaProfile = arrayOf(
        "Hadist Riwayat Bukhari",
        "Hadist Riwayat Bukhari dan Muslim",
        "Hadist Riwayat Ibnu Majah, dan Sahih At-Tirmizi",
        "Hadist Riwayat At-Tirmizi"
    )

    val listDoaEtikaBaikData: ArrayList<DoaModel>
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

