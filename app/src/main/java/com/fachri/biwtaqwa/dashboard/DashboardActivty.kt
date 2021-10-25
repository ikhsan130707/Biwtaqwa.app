package com.fachri.biwtaqwa.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.fachri.biwtaqwa.R
import com.fachri.biwtaqwa.dashboard.adapter.InspirationListAdapter
import com.fachri.biwtaqwa.dashboard.data.InspirationData
import com.fachri.biwtaqwa.dashboard.model.InspirationModel
import com.fachri.biwtaqwa.databinding.ActivityDasboardBinding
import com.fachri.biwtaqwa.menus.doa.MenuDoaActivity
import com.fachri.biwtaqwa.menus.dzikir.MenuDzikirActivity
import com.fachri.biwtaqwa.menus.jadwalsholat.MenuJadwalSholatActivity
import com.fachri.biwtaqwa.menus.videokajian.MenuVideoKajianActivity
import com.fachri.biwtaqwa.menus.zakat.MenuZakatActivity
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class DashboardActivty : AppCompatActivity() {

    private lateinit var binding: ActivityDasboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDasboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initNavMenu()
        initHeader()
        initRecycleView()
    }

    private fun initRecycleView() {
        val list:ArrayList<InspirationModel> = arrayListOf()
        binding.rvInspiration.setHasFixedSize(true)
        list.addAll(InspirationData.listData)
        binding.rvInspiration.layoutManager = LinearLayoutManager(this)
        val listInspirationAdapter = InspirationListAdapter(list)
        binding.rvInspiration.adapter = listInspirationAdapter
    }

    private fun initHeader() {
        val timeNow = Calendar.getInstance()
        val timeFormat = SimpleDateFormat("HH")
        val time = timeFormat.format(timeNow.time)

        when {
            time.toInt() in 0..6 -> {
                binding.ivHeader.setBackgroundResource(R.drawable.bg_header_dashboard_night)
            }
            time.toInt() in 7..12 -> {
                binding.ivHeader.setBackgroundResource(R.drawable.bg_header_dashboard_morning)
            }
            time.toInt() in 13..18 -> {
                binding.ivHeader.setBackgroundResource(R.drawable.bg_header_dashboard_afternoon)

            }
            time.toInt() in 19..23 -> {
                binding.ivHeader.setBackgroundResource(R.drawable.bg_header_dashboard_night)
            }
        }

    }

    private fun initNavMenu() {
        binding.ivIconMenuDoa.setOnClickListener {
            startActivity(Intent(this, MenuDoaActivity::class.java))
        }
        binding.ivIconMenuDzikir.setOnClickListener {
            startActivity(Intent(this, MenuDzikirActivity::class.java))
        }
        binding.ivIconMenuZakat.setOnClickListener {
            startActivity(Intent(this, MenuZakatActivity::class.java))
        }
        binding.inIconMenuJadwalSholat.setOnClickListener {
            startActivity(Intent(this, MenuJadwalSholatActivity::class.java))
        }
        binding.ivIconMenuVideoKajian.setOnClickListener {
            startActivity(Intent(this, MenuVideoKajianActivity::class.java))
        }
    }
}