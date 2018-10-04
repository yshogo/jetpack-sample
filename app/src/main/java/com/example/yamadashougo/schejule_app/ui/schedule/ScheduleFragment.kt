package com.example.yamadashougo.schejule_app.ui.schedule

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yamadashougo.schejule_app.databinding.ScheduleFragmentBinding
import com.example.yamadashougo.schejule_app.ui.main.MainNavigationFragment

class ScheduleFragment : Fragment(), MainNavigationFragment {

    private lateinit var scheduleViewModel: ScheduleViewModel
    private lateinit var mScheduleBinding: ScheduleFragmentBinding
    var items: List<Schedule> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        scheduleViewModel = ViewModelProviders.of(this).get(ScheduleViewModel::class.java)

        mScheduleBinding = ScheduleFragmentBinding.inflate(inflater, container, false).apply {
            setLifecycleOwner(this@ScheduleFragment)
            viewModel = this@ScheduleFragment.scheduleViewModel
        }

        return mScheduleBinding.root
    }

    override fun onResume() {
        super.onResume()

        scheduleViewModel.start()
        setList()
    }

    private fun setList() {
        val adapter = ScheduleListAdapter(requireContext(), items)
        mScheduleBinding.scheduleList.layoutManager = LinearLayoutManager(context)
        mScheduleBinding.scheduleList.adapter = adapter
    }
}
