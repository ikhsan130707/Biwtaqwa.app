package com.fachri.biwtaqwa.menus.videokajian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fachri.biwtaqwa.menus.videokajian.adapter.VidioKajianListAdapter
import com.fachri.biwtaqwa.databinding.ActivityMenuVideoKajianBinding
import com.fachri.biwtaqwa.menus.videokajian.data.VidioKajianData
import com.fachri.biwtaqwa.menus.videokajian.model.VidioKajianModel

class MenuVideoKajianActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuVideoKajianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuVideoKajianBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setSupportActionBar(binding.toolbarMenuVidioKajian)
        initNavMenu()
    }

    private fun initNavMenu() {
        val list: ArrayList<VidioKajianModel> = arrayListOf()
        binding.rvVidioKajian.setHasFixedSize(true)
        list.addAll(VidioKajianData.listData)
        binding.rvVidioKajian.layoutManager = LinearLayoutManager(this)
        val listVideoAdapter = VidioKajianListAdapter(list)
        binding.rvVidioKajian.adapter = listVideoAdapter
    }
}