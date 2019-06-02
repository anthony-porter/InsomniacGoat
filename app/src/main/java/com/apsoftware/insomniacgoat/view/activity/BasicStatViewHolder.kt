package com.apsoftware.insomniacgoat.view.activity

import androidx.recyclerview.widget.RecyclerView
import com.apsoftware.insomniacgoat.databinding.PlayerDataViewHolderBinding
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine

class BasicStatViewHolder(private var binding: PlayerDataViewHolderBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(playerSeasonStatLine: PlayerSeasonStatLine, listener: PlayerStatsRecyclerViewAdapter.OnClickListener) {
        binding.model = playerSeasonStatLine
        binding.root.setOnClickListener { listener.onItemClick(layoutPosition) }
        binding.executePendingBindings()
    }

}