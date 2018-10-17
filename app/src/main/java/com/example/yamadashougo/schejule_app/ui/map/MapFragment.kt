package com.example.yamadashougo.schejule_app.ui.map

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yamadashougo.schejule_app.databinding.MapFragmentBinding
import com.example.yamadashougo.schejule_app.ui.main.MainNavigationFragment

class MapFragment : Fragment(), MainNavigationFragment {

    private lateinit var viewModel: MapViewModel
    private lateinit var mMapFragmentBinding: MapFragmentBinding
    var items: List<Map> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        viewModel = ViewModelProviders.of(this).get(MapViewModel::class.java)

        mMapFragmentBinding = MapFragmentBinding.inflate(inflater, container, false).apply {
            setLifecycleOwner(this@MapFragment)
            viewModel = this@MapFragment.viewModel
        }

        return mMapFragmentBinding.root
    }

    override fun onResume() {
        super.onResume()

        setList()
    }

    private fun setList() {
        val adapter = MapListAdapter(requireContext(), items, this)
        mMapFragmentBinding.mapList.apply {
            layoutManager = LinearLayoutManager(requireContext())
            addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))
            this.adapter = adapter
        }
    }
}
