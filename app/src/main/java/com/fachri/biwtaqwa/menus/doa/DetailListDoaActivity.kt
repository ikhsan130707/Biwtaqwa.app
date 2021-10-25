package com.fachri.biwtaqwa.menus.doa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.fachri.biwtaqwa.R
import com.fachri.biwtaqwa.databinding.ActivityDetailListDoaBinding
import com.fachri.biwtaqwa.menus.doa.adapter.DoaListAdapter
import com.fachri.biwtaqwa.menus.doa.data.*
import com.fachri.biwtaqwa.menus.doa.data.model.DoaModel

class DetailListDoaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailListDoaBinding

    lateinit var title: String
    var logo: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailListDoaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        title = intent.getStringExtra("ext_title").toString()
        logo = intent.getIntExtra("ext_icon", 0)

        setSupportActionBar(binding.toolbarListDetailDoa)
        supportActionBar?.title = title
        initRecyclerview()
    }

    private fun initRecyclerview() {
        val list: ArrayList<DoaModel> = arrayListOf()
        when (title) {
            getString(R.string.text_pagi_amp_malam) -> list.addAll(DoaPagiMalamData.listDoaPagiDanMalamData)
            getString(R.string.text_rumah) -> list.addAll(DoaRumahData.listDoaRumahData)
            getString(R.string.text_makanan_amp_minuman) -> list.addAll(DoaMakanMinumData.listDoaMakananDanMinumanData)
            getString(R.string.text_perjalanan) -> list.addAll(DoaPerjalananData.listDoaPerjalananData)
            getString(R.string.text_sholat) -> list.addAll(DoaSholatData.listDoaShalatData)
            getString(R.string.text_etika_baik) -> list.addAll(EtikaBaikData.listDoaEtikaBaikData)
        }
        binding.rvDoa.setHasFixedSize(true)
        binding.rvDoa.layoutManager = LinearLayoutManager(this)
        val listDoa = DoaListAdapter(list, logo)
        binding.rvDoa.adapter = listDoa
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}