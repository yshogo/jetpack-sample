package com.example.yamadashougo.schejule_app.ui.map

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yamadashougo.schejule_app.R
import com.example.yamadashougo.schejule_app.ui.main.MainNavigationFragment

class MapFragment : Fragment(), MainNavigationFragment {

    companion object {
        fun newInstance() = MapFragment()
    }

    private lateinit var viewModel: MapViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.map_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MapViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
