package com.yunusbalikci.horoscopes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yunusbalikci.horoscopes.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val horoscopes = intent.getSerializableExtra("noteObject") as Horoscopes

        binding.textViewHorosName.text =horoscopes.horos_name
        binding.textViewDetail.text = horoscopes.horos_detail
        binding.imageViewPic.setImageResource(resources.getIdentifier(horoscopes.horos_pic
            ,"drawable",packageName))
    }
}