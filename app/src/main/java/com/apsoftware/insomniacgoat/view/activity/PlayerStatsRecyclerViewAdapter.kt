package com.apsoftware.insomniacgoat.view.activity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.apsoftware.insomniacgoat.databinding.PlayerDataViewHolderBinding
import com.apsoftware.insomniacgoat.model.database.entity.Player

class PlayerStatsRecyclerViewAdapter(
    private var statLines: List<Player>,
    private var onClickListener: OnClickListener
) : RecyclerView.Adapter<BasicStatViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasicStatViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = PlayerDataViewHolderBinding.inflate(layoutInflater, parent, false)
        return BasicStatViewHolder(binding)
    }

    fun replaceData(statLines: List<Player>) {
        this.statLines = statLines
        notifyDataSetChanged()
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    override fun getItemCount(): Int = statLines.size

    override fun onBindViewHolder(holder: BasicStatViewHolder, position: Int) =
        holder.bind(statLines[position], onClickListener)

    interface OnClickListener {
        fun onItemClick(position: Int)
    }
}