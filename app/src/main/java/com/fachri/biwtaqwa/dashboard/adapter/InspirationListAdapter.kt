package com.fachri.biwtaqwa.dashboard.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fachri.biwtaqwa.R
import com.fachri.biwtaqwa.dashboard.model.InspirationModel

class InspirationListAdapter(private val listInspiration:ArrayList<InspirationModel>) : RecyclerView.Adapter<InspirationListAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemview: View): RecyclerView.ViewHolder(itemview) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.iv_item_photo)


    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): InspirationListAdapter.ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_inspiration, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: InspirationListAdapter.ListViewHolder, position: Int) {
        val inspiration = listInspiration[position]

        Glide.with(holder.itemView.context).load(inspiration.inspirationImage).into(holder.imgPhoto)
    }

    override fun getItemCount(): Int {
        return listInspiration.size
    }
}