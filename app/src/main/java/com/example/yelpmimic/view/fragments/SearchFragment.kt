package com.example.yelpmimic.view.fragments

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.inputmethod.InputMethodManager
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.yelpmimic.R
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.fragment_search.*
import java.util.*


/**
 * A simple [Fragment] subclass.
 */
class SearchFragment : Fragment() {

    var isBoolean= false
    var scrollRange = -1
    var collaspedTracker = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val statusBarColor = activity!!.window

        randomHeader(statusBarColor)
        setSearchBar(statusBarColor)



        searchView.setOnQueryTextFocusChangeListener { v, hasFocus ->

            // hides keyboard
            hideSoftKeyboard(v)

            // Makes toolbar collapse
            if(collaspedTracker == 0) {

                appBarLayout.setExpanded(false)
                // Changes color of status bar
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.colorPrimaryDark)
                collaspedTracker = 1
            }

        }

    }

    private fun hideSoftKeyboard(view: View) {

        // hides keyboard
        var imm = activity!!.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, InputMethodManager.HIDE_IMPLICIT_ONLY)
    }


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun randomHeader(statusBarColor: Window) {

        val randomNumber = Random()

        val number = randomNumber.nextInt(30)

        when (number) {
            0 ->  {
                mainHeaderImage.setImageResource(R.drawable.art)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.art_header)
            }
            1 -> {
                mainHeaderImage.setImageResource(R.drawable.auto)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.auto_header)
                }
            2 ->  {
                mainHeaderImage.setImageResource(R.drawable.bars)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.bar_header)
            }
            3 ->  {
                mainHeaderImage.setImageResource(R.drawable.beauty)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.beauty_header)
            }
            4 ->  {
                mainHeaderImage.setImageResource(R.drawable.education)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.education_header)
            }
            5 ->  {
                mainHeaderImage.setImageResource(R.drawable.educationtwo)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.education_two_header)
            }
            6 ->  {
                mainHeaderImage.setImageResource(R.drawable.farmone)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.farm_one)

            }
            7 ->  {
                mainHeaderImage.setImageResource(R.drawable.farmtwo)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.farm_two)
            }
            8 ->  {
                mainHeaderImage.setImageResource(R.drawable.fashion)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.fashion)
            }
            9 ->  {
                mainHeaderImage.setImageResource(R.drawable.fitness)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.fitness_header)

            }
            11 ->  {
                mainHeaderImage.setImageResource(R.drawable.fitnesstwo)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.fitness_header_two)
            }
            12 ->  {
                mainHeaderImage.setImageResource(R.drawable.food)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.food_header)
            }
            13 ->  {
                mainHeaderImage.setImageResource(R.drawable.foodtwo)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.food_header_two)
            }
            14 -> {
                mainHeaderImage.setImageResource(R.drawable.health)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.health_header)
            }
            15 -> {
                mainHeaderImage.setImageResource(R.drawable.hotels)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.hotel_header)
            }
            16 -> {
                mainHeaderImage.setImageResource(R.drawable.italian)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.italian_header)
            }
            17 -> {
                mainHeaderImage.setImageResource(R.drawable.localservices)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.local_service_header)

            }
            18 -> {
                mainHeaderImage.setImageResource(R.drawable.medicalspa)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.medical_spa)
            }
            19 -> {
                mainHeaderImage.setImageResource(R.drawable.medicalspatwo)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.medical_spa_two)
            }
            20 -> {
                mainHeaderImage.setImageResource(R.drawable.medicalspathree)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.medical_spa_three)
            }
            21 -> {
                mainHeaderImage.setImageResource(R.drawable.museum)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.museum_header)
            }
            22 -> {
                mainHeaderImage.setImageResource(R.drawable.nightlife)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.night_life_header)
            }
            23 -> {
                mainHeaderImage.setImageResource(R.drawable.pets)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.pet_header)
            }
            24 -> {
                mainHeaderImage.setImageResource(R.drawable.physicians)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.physicians_header)
            }
            25 -> {
                mainHeaderImage.setImageResource(R.drawable.professional)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.professional_header)
            }
            26 -> {
                mainHeaderImage.setImageResource(R.drawable.realestate)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.real_estate_header)
            }
            27 -> {
                mainHeaderImage.setImageResource(R.drawable.resaurant)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.resaurant)
            }
            28 -> {
                mainHeaderImage.setImageResource(R.drawable.restauranttwo)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.restaurant_two)
            }
            29 -> {
                mainHeaderImage.setImageResource(R.drawable.transport)
                statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.airplain_header)
            }

        }

    }

    private fun setSearchBar(statusBarColor: Window) {

        var isShow = false
        var  scrollRange = -1
        appBarLayout.addOnOffsetChangedListener( object: AppBarLayout.OnOffsetChangedListener {

            @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
            override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {

                if (scrollRange == -1) {
                    scrollRange = appBarLayout!!.totalScrollRange
                }
                if (scrollRange + verticalOffset == 0) {

                    statusBarColor.statusBarColor = ContextCompat.getColor(requireContext(),R.color.colorPrimaryDark)
                    searchView.visibility = View.INVISIBLE
                    searchViewToolbar.visibility = View.VISIBLE
                    isShow = true
                } else if (isShow) {

                    randomHeader(statusBarColor)
                    searchView.visibility = View.VISIBLE
                    searchViewToolbar.visibility = View.INVISIBLE
                    isShow = false
                }
            }
        })
    }
}
