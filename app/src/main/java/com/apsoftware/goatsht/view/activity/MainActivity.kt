package com.apsoftware.insomniacgoat.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.apsoftware.insomniacgoat.R
import com.apsoftware.insomniacgoat.databinding.ActivityMainBinding
import com.apsoftware.insomniacgoat.viewmodel.StatsViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), PlayerStatsRecyclerViewAdapter.OnClickListener {

    lateinit var binding: com.apsoftware.insomniacgoat.databinding.ActivityMainBinding
    lateinit var viewModel: StatsViewModel
    val playerStatsRecyvlerViewAdapter: PlayerStatsRecyclerViewAdapter = PlayerStatsRecyclerViewAdapter(arrayListOf(), this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(StatsViewModel::class.java)
        binding.viewModel = viewModel
        binding.executePendingBindings()

        binding.playerStatRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.playerStatRecyclerView.adapter = playerStatsRecyvlerViewAdapter
        viewModel.statList.observe(
            this,
            Observer { it ->
                it?.let {
                    playerStatsRecyvlerViewAdapter.replaceData(it)
                }
            }
        )
    }

    override fun onItemClick(position: Int) {
        // TODO pop up a fragment with additional player info
    }
}
