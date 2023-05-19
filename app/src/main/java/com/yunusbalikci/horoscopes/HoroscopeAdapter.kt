package com.yunusbalikci.horoscopes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class HoroscopeAdapter(private val mContext: Context,private val horoscopeList:List<Horoscopes>)
    :RecyclerView.Adapter<HoroscopeAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(design:View) : RecyclerView.ViewHolder(design){
        var cardView:CardView
        var logo_id:ImageView
        var title_id:TextView

        init {
            cardView =design.findViewById(R.id.cardView)
            logo_id = design.findViewById(R.id.logo_id)
            title_id = design.findViewById(R.id.title_id)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val design = LayoutInflater.from(mContext).inflate(R.layout.card_tasarim,parent,false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val note =horoscopeList.get(position)

        holder.title_id.text = note.horos_name
        holder.logo_id.setImageResource(mContext.resources.getIdentifier(note.horos_pic,"drawable",mContext.packageName))

        holder.cardView.setOnClickListener {


        }
    }

    override fun getItemCount(): Int {
        return horoscopeList.size
    }
}