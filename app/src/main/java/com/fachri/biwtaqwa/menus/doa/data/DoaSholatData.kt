package com.fachri.biwtaqwa.menus.doa.data

import com.fachri.biwtaqwa.menus.doa.data.model.DoaModel

object DoaSholatData { private val doaTitle = arrayOf(
    "Doa sebelum wudhu",
    "Doa setelah wudhu",
    "Doa masuk masjid",
    "Doa keluar masjid",
    "Doa ketika mendengar adzan",
    "Doa Iftitah",
    "Doa Ruku",
    "Doa bangun dari ruku",
    "Doa sujud",
    "Doa duduk diantara dua sujud",
    "Doa Tasyahud",
    "Shalawat setelah Tasyahud",
    "Doa sebelum salam"
)

    private val doaDoa = arrayOf(
        "بِسْمِ اللَّه",
        "أَشْهَدُ أَنْ لَا إِلَـهَ إِلاَّ اللّهُ وَحْدَهُ لَا شَريـكَ لَـهُ وَأَشْهَدُ أَنَّ مُحَمَّـداً عَبْـدُهُ وَرَسُـولُـهُ, اَللَّهُـمَّ اجْعَلْنِـي مِنَ التَّـوَّابِينَ وَاجْعَـلْنِي مِنَ الْمُتَطَهِّـرِينَ",
        "أَعوذُ بِاللّهِ العَظِيـمِ، وَبِوَجْهِـهِ الكَرِيـمِ وَسُلْطـَانِه القَدِيـمِ، مِنَ الشَّيْـطَانِ الرَّجِـيمِ، بِسْـمِ اللّهِ وَالصَّلَاةُ وَالسَّلامُ عَلَى رَسُولِ اللّهِ، اَللَّهُـمَّ افْتَـحْ لِي أَبْوَابَ رَحْمَتـِكَ",
        "بِسْمِ اللّهِ وَالصَّلاَةُ وَالسَّلاَمُ عَلَى رَسُولِ اللّهِ، اَللَّهُـمَّ إِنِّي أَسْأَلُكَ مِنْ فَضْـلِكَ، اَللَّهُـمَّ اعْصِمْنِـي مِنَ الشَّيْـطَانِ الرَّجِـيمِ",
        "اللَّهُـمَّ رَبَّ هَذِهِ الدَّعْـوَةِ التَّـامَّةِ، وَالصَّلَاةِ القَـائِمَة، آتِ مُحَـمَّداً الوَسِيـلَةَ وَالْفَضِـيلَةَ، وَابْعَـثْهُ مَقَـامـاً مَحْـمُوداً الَّذِي وَعَـدْتَهُ، إِنَّـكَ لَا تُـخْلِفُ المِيـعَادِ",
        "اللَّهُـمَّ باَعِـدْ بَيْـنِي وَبَيْنَ خَطَـاياَيَ كَماَ باَعَدْتَ بَيْنَ المَشْرِقِ وَالمَغْرِبْ، اللَّهُـمَّ نَقِّنِـي مِنْ خَطَاياَيَ كَمـَا يُـنَقَّى الثَّـوْبُ الأَبْيَضُ مِنَ الدَّنَسْ، اللَّهُـمَّ اغْسِلْنِـي مِنْ خَطَايـَايَ بِالثَّلـجِ وَالمـَاءِ وَالْبَرَدِ",
        "سُبْحَانَ رَبِّيَ الْعَظِيمِ",
        "سَمِـعَ اللَّهُ لِمَـنْ حَمِـدَه, رَبَّنَا وَلَكَ الْحَمْدُ، حَمْداً كَثِيراً طَيِّباً مُبَارَكاً فِيهِ",
        "سُبْحَانَ رَبِّيَ الأَعْلَى",
        "رَبِّ اغْفِرْ لِي رَبِّ اغْفِرْ لِي",
        "التَّحِيَّاتُ لِلّهِ، وَالصَّلَوَاتُ، وَالطَّيِّبَاتُ، السَّلاَمُ عَلَيْكَ أَيُّهَا النَّبِيُّ وَرَحْمَةُ اللّهِ وَبَرَكَاتُهُ، السَّلاَمُ عَلَيْنَا وَعَلَى عِبَادِ للّهِ الصَّالِحِينَ. أَشْهَدُ أَنْ لَا إِلَهَ إِلَاّ اللّهُ، وَأَشْهَدُ أَنَّ مُحَمَّداً عَبْدُهُ وَرَسُولُهُ",
        "اللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحمَّد، كَمَا صَلَّيْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إبْرَاهِيمَ، إِنَّكَ حَميدٌ مَجِيدٌ، اللَّهُمَّ بَارِكْ عَلَى مُحمَّدٌ وَعَلَى آلِ مُحَمَّدٍ، كَمَا بَارَكْتَ عَلَى إبْرَاهِيمَ وَعَلَى آلِ إبْرَاهِيمَ، إِنَّكَ حَمِيدٌ مَجِيدٌ",
        "اللَّهُمَّ إِنِّي أَعُوذُ بِكَ مِنْ عَذَابِ القَبْر، وَمِنْ عَذَابِ جَهَنَّمَ، وَمِنْ فِتْنَةِ الْمَحْيَا وَالْمَمَاتِ، وَمِنْ شَرِّ فِتْنَةِ الْمَسيحِ الدَّجَّالِ"
    )

    private val doaTranslate = arrayOf(
        "Dengan nama Allah (aku berwudhu).",
        "Aku bersaksi, bahwa tiada Tuhan yang haq kecuali Allah, Yang Maha Esa dan tiada sekutu bagi-Nya. Aku bersaksi, bahwa Muhammad adalah hamba dan utusan-Nya, Ya Allah, jadikanlah aku termasuk orang-orang yang bertaubat dan jadikanlah aku termasuk orang-orang (yang senang) bersuci.",
        "Aku berlindung kepada Allah Yang Maha Agung, dengan wajah-Nya Yang Mulia dan kekuasaan-Nya yang abadi, dari setan yang terkutuk.  Dengan nama Allah dan semoga shalawat   dan salam tercurahkan kepada Rasulullah   Ya Allah, bukalah pintu-pintu rahmat-Mu untukku.",
        "Dengan nama Allah, semoga shalawat dan salam terlimpahkan kepada Rasulullah. Ya Allah, sesungguhnya aku minta kepada-Mu dari karunia-Mu. Ya Allah, peliharalah aku dari godaan setan yang terkutuk.",
        "Ya Allah, Tuhan Pemilik panggilan yang sempurna (adzan) ini dan shalat (wajib) yang didirikan. Berilah Al-Wasilah (derajat di Surga, yang tidak akan diberikan selain kepada Nabi) dan fadhilah kepada Muhammad. Dan bangkitkanlah beliau sehingga bisa menempati maqam terpuji yang telah Engkau janjikan. Sesungguhnya Engkau tidak menyalahi janji.",
        "Ya Allah, jauhkan antara aku dan kesalahan-kesalahanku, sebagaimana Engkau menjauhkan antara timur dan barat. Ya Allah, bersihkanlah aku dan kesalahan-kesalahanku, sebagaimana baju putih dibersihkan dari kotoran. Ya Allah, cucilah aku dari kesalahan-kesalahanku dengan, es, air dan salju.",
        "Maha Suci Tuhanku yang Maha Agung (Dibaca tiga kali).",
        "Semoga Allah mendengar pujian orang yang memuji-Nya, Wahai Tuhan kami, bagi-Mu segala puji, aku memuji-Mu dengan pujian yang banyak, yang baik dan penuh dengan berkah.",
        "Maha Suci Tuhanku, Yang Maha Tinggi (dari segala kekurangan dan hal yang tidak layak). (Dibaca tiga kali).",
        "Wahai Tuhanku, ampunilah dosaku, wahai Tuhanku, ampunilah dosaku.",
        "Segala penghormatan hanya milik Allah, juga segala pengagungan dan kebaikan. Semoga kesejahteraan terlimpahkan kepadamu, wahai Nabi, begitu juga rahmat dan berkah-Nya. Kesejahteraan semoga terlimpahkan kepada kita dan hamba-hamba Allah yang shalih. Aku bersaksi bahwa tiada Tuhan yang hak disembah selain Allah dan aku bersaksi bahwa Muhammad adalah hamba dan utusan-Nya.",
        "Ya Allah, berilah rahmat kepada Muhammad dan keluarganya, sebagaimana Engkau telah memberikan rahmat kepada Ibrahim dan keluarganya. Sesungguhnya Engkau Maha Terpuji dan Maha Agung. Berilah berkah kepada Muhammad dan keluarganya (termasuk anak dan istri atau umatnya), sebagaimana Engkau telah memberi berkah kepada Ibrahim dan keluarganya. Sesungguhnya Engkau Maha Terpuji dan Maha Agung.",
        "Ya Allah, Sesungguhnya aku berlindung kepada-Mu dari siksa kubur, siksa neraka Jahanam, fitnah kehidupan dan setelah mati, serta dari kejahatan fitnah Almasih Dajjal."
    )

    private val doaLatin = arrayOf(
        "Bismillah",
        "'Ash-hadu 'an laa 'ilaaha 'illallaahu wahdahu laa shariika lahu wa 'ash-hadu 'anna Muhammadan 'abduhu wa Rasuuluhu, Allaahummaj'alnii minat-tawwaabiina waj'alnii minal-mutatahhiriin",
        "'A'uudzu billaahil-'Adzhiim, wa bi-Wajhihil-Kariim, wa Sultaanihil-qadiim, minash-Shaytaanir-rajiim. Bismillaahi, wassalaatu. Wassalaamu 'alaaRasuulillaahi. Allaahum-maftah lii 'abwaaba rohmatika",
        "Bismillaahi wassalaatu wassalaamu 'alaa Rasuulillaahi, Allaahumma 'innii 'as'aluka min fadhlika, Allaahumma'simnii minash-Shaytoonir-rajiim",
        "Allaahumma Rabba haadzihid-da 'watit-taammati wassalaatil-qaa'imati, 'aati Muhammadanil-wasiilata walfadhiilata, wab 'ath-hu maqaamam-mahmuudanil-ladzii wa'adtahu, ['innaka laa tukhliful-mii'aad]",
        "Allaahumma baa'id baynii wa bayna khataayaaya kamaa baa'adta baynal-mashriqi walmaghribi, Allaahumma naqqinii min khataayaaya kamaa yunaqqath-thawbul-'abyadhu minad-danasi, Allaahum-maghsilnii min khataayaaya, bith-thalji walmaa'i walbarad",
        "Subhaana Rabbiyal-'Adziim",
        "Sami'allaahu liman hamidah, Rabbanaa wa lakal-hamd, hamdan katheeran tayyiban mubaarakanfiih",
        "Subhaana Rabbiyal-A'laa",
        "Rabbighfir lii Rabbighfir lii",
        "Attahiyyaatu lillaahi wassalawaatu , wattayyibaatu , assalaamu 'alayka 'ayyuhan-Nabiyyu wa rahmatullaahi wa barakaatuhu, assalaamu 'alaynaa wa 'alaa 'ibaadillaahis-saalihiin. 'Ash-hadu 'an laa 'ilaaha 'illallaahu wa 'ash-hadu 'anna Muhammadan 'abduhu wa Rasiiluhu",
        "Allaahumma salli 'alaa Muhammadin wa 'alaa 'aali Muhammadin, kamaa sollayta 'alaa 'Ibraahiima wa 'alaa 'aali 'Ibraahiima, 'innaka Hamiidun Majiid. Allaahumma baarik 'alaa Muhammadin wa 'alaa 'aali Muhammadin, kamaa baarokta 'alaa 'Ibraahiima wa 'alaa 'aali 'Ibraahiima, 'innaka Hamiidun Majiid",
        "Allaahumma 'innii 'a'uudzu bika min 'adzaabil-qabri, wa min 'adzaabi jahannama, wa min fitnatil-mahyaa walmamaati, wa min sharri fitnatil-masiihid-dajjaal"
    )

    private val doaProfile = arrayOf(
        "Hadist Riwayat Abu Dawud, Ibnu Majah, dan Irwa'ul-Ghain",
        "Hadist Riwayat Muslim, At-Tirmizi, Al-Albani, dan Shahih At-Tirmizi",
        "Hadist Riwayat Abu Dawud, Jami' As-Saghir, Ibn As-Sunni, Abu Dawud, Shahihul Jami', Muslim, dan Ibnu Majah",
        "Hadist Riwayat Abu Dawud, Sahih Al-Jami', Muslim, Shohih Ibnu Majah",
        "Hadist Riwayat Al Bukhari dan Al Bayhaqi",
        "Hadist Riwayat Al Bukhari dan Muslim",
        "Hadist Riwayat Abu Dawud, Ibnu Majah, An-Nasa'i, At-Tirmizi, Ahmad, Al-Albani",
        "Hadist Riwayat Al Bukhari, Al-Asqalani, dan Fathul Bari",
        "Hadist Riwayat Abu Dawud, Ibnu Majah, An-Nasa'i, At-Tirmizi, Ahmad, Al-Albani",
        "Hadist Riwayat Abu Dawud dan Shahih Ibnu Majah",
        "Hadist Riwayat Al Bukhari dan Muslim",
        "Hadist Riwayat Al Bukhari dan Fathul Bari",
        "Hadist Riwayat Al Bukhari dan Muslim"

    )

    val listDoaShalatData: ArrayList<DoaModel>
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
