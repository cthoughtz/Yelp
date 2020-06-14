package com.example.yelpmimic.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.yelpmimic.R
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.fragment_search.*


/**
 * A simple [Fragment] subclass.
 */
class SearchFragment : Fragment() {

    var isBoolean= false
    var scrollRange = -1


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       setSearchBar()
    }

    private fun setSearchBar() {

        var isShow = false
        var  scrollRange = -1
        appBarLayout.addOnOffsetChangedListener( object: AppBarLayout.OnOffsetChangedListener {

            override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {

                if (scrollRange == -1) {
                    scrollRange = appBarLayout!!.totalScrollRange
                }
                if (scrollRange + verticalOffset == 0) {

                   // toolbar.setTitle("This is a test")
                    searchView.visibility = View.INVISIBLE
                    searchViewToolbar.visibility = View.VISIBLE
                    isShow = true
                } else if (isShow) {

                 //   toolbar.setTitle(" ")
                    searchView.visibility = View.VISIBLE
                    searchViewToolbar.visibility = View.INVISIBLE
                    isShow = false
                }
            }
        })
    }
}
