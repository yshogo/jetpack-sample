package com.example.yamadashougo.schejule_app.ui.schedule

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yamadashougo.schejule_app.databinding.ScheduleFragmentBinding
import com.example.yamadashougo.schejule_app.ui.main.MainNavigationFragment

class ScheduleFragment : Fragment(), MainNavigationFragment {

    private lateinit var scheduleViewModel: ScheduleViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        scheduleViewModel = ViewModelProviders.of(this).get(ScheduleViewModel::class.java)
        val binding = ScheduleFragmentBinding.inflate(inflater, container, false).apply {
            setLifecycleOwner(this@ScheduleFragment)
            viewModel = this@ScheduleFragment.scheduleViewModel
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        observeViewModel()
    }


    private fun observeViewModel() {

        scheduleViewModel.scheduleObservable.observe(this, Observer {
            print(it)
        })
    }

}
