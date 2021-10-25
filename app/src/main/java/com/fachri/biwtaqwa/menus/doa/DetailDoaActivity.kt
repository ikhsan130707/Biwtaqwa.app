package com.fachri.biwtaqwa.menus.doa

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.fachri.biwtaqwa.databinding.ActivityDetailDoaBinding
import com.fachri.biwtaqwa.menus.doa.data.model.DoaModel

class DetailDoaActivity: AppCompatActivity() {

    private lateinit var binding: ActivityDetailDoaBinding

    companion object {
        const val EXTRA_DOA = "extra_doa"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailDoaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val doa = intent.getParcelableExtra<DoaModel>(EXTRA_DOA) as DoaModel
        setSupportActionBar(binding.toolbarDetailDoa)
        supportActionBar?.title = doa.title

        binding.tvTitleDoa.text = doa.title
        binding.tvTitleDoa.text = doa.doa
        binding.tvTitleLatin.text = "(${doa.latin})"
        binding.tvTitleArti.text = doa.translate
        binding.tvTitleRiwayat.text = doa.profile
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}