package com.fachri.biwtaqwa.menus.videokajian.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions.bitmapTransform
import com.fachri.biwtaqwa.R
import com.fachri.biwtaqwa.menus.videokajian.DetailVideoKajianActivity
import com.fachri.biwtaqwa.menus.videokajian.model.VidioKajianModel
import jp.wasabeef.glide.transformations.BlurTransformation

class VidioKajianListAdapter(private val listVidioKajian: ArrayList<VidioKajianModel>) :
    RecyclerView.Adapter<VidioKajianListAdapter.listViewHolder>() {

    inner class listViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.iv_item_photo)
        var tvChannel: TextView = itemView.findViewById(R.id.tv_Channel)
        var tvSpeaker: TextView = itemView.findViewById(R.id.tv_speaker)
        var tvTitel: TextView = itemView.findViewById(R.id.tv_title)
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): listViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_vidio_kajian, parent, false)
        return listViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listVidioKajian.size

    }

    override fun onBindViewHolder(holder: listViewHolder, position: Int) {
        val vidio = listVidioKajian[position]

        holder.tvChannel.text = vidio.Channel
        holder.tvSpeaker.text = vidio.speaker
        holder.tvTitel.text = vidio.title

        Glide.with(holder.itemView.context)
            .load(vidio.thumbnail)
            .apply(bitmapTransform(BlurTransformation(10, 1)))
            .into(holder.imgPhoto)

        holder.itemView.setOnClickListener{
            val intent = Intent (it.context,DetailVideoKajianActivity::class.java)

            intent.putExtra(DetailVideoKajianActivity.EXTRA_VIDEO_KAJIAN, vidio)
            it.context.startActivity(intent)

        }
    }

}
