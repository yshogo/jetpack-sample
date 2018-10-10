package com.example.yamadashougo.schejule_app.ui.info

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yamadashougo.schejule_app.R
import com.example.yamadashougo.schejule_app.databinding.InfoFragmentBinding
import com.example.yamadashougo.schejule_app.ui.main.MainNavigationFragment

class InfoFragment : Fragment(), MainNavigationFragment {

    lateinit var mInfoViewBinding: InfoFragmentBinding

    private lateinit var viewModel: InfoViewModel
    var items: List<Info> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        viewModel = ViewModelProviders.of(this).get(InfoViewModel::class.java)

        mInfoViewBinding = InfoFragmentBinding.inflate(inflater, container, false).apply {
            setLifecycleOwner(this@InfoFragment)
            viewModel = this@InfoFragment.viewModel
        }

        return inflater.inflate(R.layout.info_fragment, container, false)
    }

    override fun onResume() {
        super.onResume()

        viewModel.start()
        setList()
    }

    private fun setList() {
        val adapter = InfoListAdapter(requireContext(), items, this)
        mInfoViewBinding.infoList.layoutManager = LinearLayoutManager(context)
        mInfoViewBinding.infoList.adapter = adapter
    }
}
