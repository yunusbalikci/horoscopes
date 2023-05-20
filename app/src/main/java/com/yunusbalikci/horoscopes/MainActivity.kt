package com.yunusbalikci.horoscopes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yunusbalikci.horoscopes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var horoscopeList:List<Horoscopes>
    private lateinit var adapter: HoroscopeAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = LinearLayoutManager(this)



        horoscopeList = ArrayList()

        val k1 = Horoscopes("Aquarius","aquarius","asdasdasas")
        (horoscopeList as ArrayList<Horoscopes>).add(k1)

        val k2 = Horoscopes("Aries","aries","asdasdasdasda")
        (horoscopeList as ArrayList<Horoscopes>).add(k2)



        adapter = HoroscopeAdapter(this,horoscopeList)
        binding.rv.adapter = adapter

    }
}