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

        val k1 = Horoscopes("Aries ","aries","Aries (March 21 - April 19): Aries is a fire sign. It is known for its energetic, courageous, and leadership qualities. Aries individuals are self-confident, adventurous, and competitive by nature.")
        (horoscopeList as ArrayList<Horoscopes>).add(k1)
        val k2 = Horoscopes("Taurus","taurus","Taurus (April 20 - May 20): Taurus is an earth sign. It represents patience, determination, and a practical approach. Reliability, endurance, and material security are important to Taurus individuals.")
        (horoscopeList as ArrayList<Horoscopes>).add(k2)
        val k3 = Horoscopes("Gemini","gemini","Gemini (May 21 - June 20): Gemini is an air sign. It is characterized by its flexibility, intelligence, and high communication skills. Geminis are curious, lively, and social by nature.")
        (horoscopeList as ArrayList<Horoscopes>).add(k3)
        val k4 = Horoscopes("Cancer","cancer","Cancer (June 21 - July 22): Cancer is a water sign. It signifies sensitivity, emotional attachment, and a strong sense of family. Protective, understanding, and emotional security are important to Cancer individuals.")
        (horoscopeList as ArrayList<Horoscopes>).add(k4)
        val k5 = Horoscopes("Leo","leo","Leo (July 23 - August 22): Leo is a fire sign. It is known for its pride, creativity, and generosity. Leos have a self-assured, leadership-oriented nature and enjoy being in the spotlight.")
        (horoscopeList as ArrayList<Horoscopes>).add(k5)
        val k6 = Horoscopes("Virgo","virgo","Virgo (August 23 - September 22): Virgo is an earth sign. It is associated with being analytical, practical, and detail-oriented. Precision, organization, and perfectionism are important to Virgo individuals.")
        (horoscopeList as ArrayList<Horoscopes>).add(k6)
        val k7 = Horoscopes("Libra","libra","Libra (September 23 - October 22): Libra is an air sign. It represents fairness, harmony, and diplomacy. Libras value relationships, have a sense of aesthetics, and seek justice.")
        (horoscopeList as ArrayList<Horoscopes>).add(k7)
        val k8 = Horoscopes("Scorpio","scorpio","Scorpio (October 23 - November 21): Scorpio is a water sign. It is characterized by its determination, passion, and deep thoughts. Scorpios have a mysterious, powerful nature and symbolize transformation.")
        (horoscopeList as ArrayList<Horoscopes>).add(k8)
        val k9 = Horoscopes("Sagittarius","sagittarius","Sagittarius (November 22 - December 21): Sagittarius is a fire sign. It is adventurous, free-spirited, and optimistic. Sagittarius individuals have a love for exploration, a jovial nature, and a thirst for knowledg")
        (horoscopeList as ArrayList<Horoscopes>).add(k9)
        val k10 = Horoscopes("Capricorn","capricornus","Capricorn (December 22 - January 19): Capricorn is an earth sign. It represents ambition, discipline, and practicality. Capricorns are responsible, determined, and value stability and success.")
        (horoscopeList as ArrayList<Horoscopes>).add(k10)
        val k11 = Horoscopes("Aquarius","aquarius","Aquarius (January 20 - February 18): Aquarius is an air sign. It is associated with originality, independence, and intellectual pursuits. Aquarians are known for their humanitarian values, open-mindedness, and innovative thinking.")
        (horoscopeList as ArrayList<Horoscopes>).add(k11)
        val k12 = Horoscopes("Pisces","pisces","Pisces (February 19 - March 20): Pisces is a water sign. It signifies sensitivity, intuition, and empathy. Pisceans are compassionate, artistic, and have a deep connection to spirituality and the subconscious.")
        (horoscopeList as ArrayList<Horoscopes>).add(k12)

        adapter = HoroscopeAdapter(this,horoscopeList)
        binding.rv.adapter = adapter

    }

}