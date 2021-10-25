package com.fachri.biwtaqwa.dashboard.data

import com.fachri.biwtaqwa.R
import com.fachri.biwtaqwa.dashboard.model.InspirationModel

object InspirationData {
    private val inspirationImage = intArrayOf(
        R.drawable.img_inspiration,
        R.drawable.img_inspiration
    )

    val listData: ArrayList<InspirationModel>
        get() {
            val list = ArrayList<InspirationModel>()
            for (position in inspirationImage.indices) {
                val inspiration = InspirationModel()
                inspiration.inspirationImage = inspirationImage[position]
                list.add(inspiration)
            }
            return list
        }
}