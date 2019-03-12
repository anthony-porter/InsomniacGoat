package com.apsoftware.insomniacgoat.view.activity

import androidx.recyclerview.widget.RecyclerView
import com.apsoftware.insomniacgoat.databinding.PlayerDataViewHolderBinding
import com.apsoftware.insomniacgoat.model.StatLine

class BasicStatViewHolder(private var binding: PlayerDataViewHolderBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(statLine: StatLine, listener: PlayerStatsRecyclerViewAdapter.OnClickListener) {
        binding.model = statLine
        binding.root.setOnClickListener { listener.onItemClick(layoutPosition) }
        binding.executePendingBindings()
    }

}