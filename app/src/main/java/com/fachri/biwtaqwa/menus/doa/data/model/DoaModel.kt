package com.fachri.biwtaqwa.menus.doa.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class DoaModel (
    var title: String = "",
    var doa: String = "",
    var translate: String = "",
    var latin: String = "",
    var profile: String = "",

        ): Parcelable
