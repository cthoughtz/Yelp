package com.example.yelpmimic.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.yelpmimic.R
import com.example.yelpmimic.view.fragments.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchFragment = SearchFragment()
        val accountFragment = AccountFragment()
        val deliveryFragment = DeliveryFragment()
        val collectionFragment = CollectionsFragment()
        val moreFragment = MoreFragment()

        makeCurrentFragment(searchFragment)


            bottomNavBar.setOnNavigationItemSelectedListener {

                when (it.itemId) {
                    R.id.search -> makeCurrentFragment(searchFragment)
                    R.id.me -> makeCurrentFragment(accountFragment)
                    R.id.delivery -> makeCurrentFragment(deliveryFragment)
                    R.id.collections -> makeCurrentFragment(collectionFragment)
                    R.id.more -> makeCurrentFragment(moreFragment)
                }
                true
            }
        }

        private fun makeCurrentFragment(fragment: Fragment) =
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.wrapper,fragment)
                    .commit()
            }

    }


