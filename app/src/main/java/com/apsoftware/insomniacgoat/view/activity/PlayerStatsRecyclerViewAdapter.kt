package com.apsoftware.insomniacgoat.view.activity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.apsoftware.insomniacgoat.databinding.PlayerDataViewHolderBinding
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine

class PlayerStatsRecyclerViewAdapter(
    private var statLines: List<PlayerSeasonStatLine>,
    private var onClickListener: OnClickListener
) : RecyclerView.Adapter<BasicStatViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasicStatViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = PlayerDataViewHolderBinding.inflate(layoutInflater, parent, false)
        return BasicStatViewHolder(binding)
    }

    fun replaceData(statLines: List<PlayerSeasonStatLine>) {
        this.statLines = statLines
        notifyDataSetChanged()
    }
    override fun getItemCount(): Int = statLines.size

    override fun onBindViewHolder(holder: BasicStatViewHolder, position: Int) =
        holder.bind(statLines[position], onClickListener)

    interface OnClickListener {
        fun onItemClick(position: Int)
    }
}