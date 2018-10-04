package com.example.yamadashougo.schejule_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.yamadashougo.schejule_app.ui.info.InfoFragment
import com.example.yamadashougo.schejule_app.ui.main.MainNavigationFragment
import com.example.yamadashougo.schejule_app.ui.map.MapFragment
import com.example.yamadashougo.schejule_app.ui.schedule.ScheduleFragment
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    private lateinit var currentFragment: MainNavigationFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.info -> {
                    replaceFragment(InfoFragment())
                    true
                }
                R.id.schedule -> {
                    replaceFragment(ScheduleFragment())
                    true
                }
                R.id.map -> {
                    replaceFragment(MapFragment())
                    true
                }
                else -> false
            }
        }

        if (savedInstanceState == null) {
            navigation.selectedItemId = R.id.schedule
        } else {
            currentFragment = supportFragmentManager.findFragmentById(R.id.container) as? MainNavigationFragment
                    ?: throw IllegalStateException("Activity recreated, but no fragment found!")
        }
    }


    private fun <F> replaceFragment(fragment: F) where F : Fragment, F : MainNavigationFragment {
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment).commitNow()
    }
}
