package com.fachri.biwtaqwa.menus.videokajian.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class VidioKajianModel (
    var thumbnail : Int = 0,
    var Channel : String = "",
    var speaker : String = "",
    var title : String = "",
    var urlVidio : String = "",
    var summary : String = "",
        ) : Parcelable