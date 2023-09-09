package com.anilerbil.thebookoffood

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.anilerbil.thebookoffood.databinding.FoodRecyclerViewBinding
import com.anilerbil.thebookoffood.model.Food
import com.anilerbil.thebookoffood.viewmodel.FoodListViewModel
import kotlinx.android.synthetic.main.fragment_food_detail_.*
import kotlinx.android.synthetic.main.fragment_food_list_.*


class FoodListFragment : Fragment() {

    private lateinit var viewModel : FoodListViewModel
    private val recyclerViewAdapter = FoodRecyclerAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_food_list_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(FoodListViewModel::class.java)
        viewModel.refreshData()


        foodListRecyclerViewId.layoutManager = LinearLayoutManager(context)
        foodListRecyclerViewId.adapter = recyclerViewAdapter

        observeLiveData()
        swiperefreshlayoutId.isRefreshing = false  //swiperefresh devam ediyor??


    }

    fun observeLiveData(){

        viewModel.foods.observe(viewLifecycleOwner) { foods ->
            recyclerViewAdapter.foodListRefresh(foods)
            foodListRecyclerViewId.visibility = View.VISIBLE
            errorId.visibility = View.GONE
            progressBarId.visibility = View.GONE
            //swiperefreshlayoutId.isRefreshing = false
        }

        /*
        viewModel.foods.observe(this, Observer {Foods->
         /* direkt foods çağrılmadı?*/   viewModel.foods.let {
                recyclerViewAdapter.foodListRefresh(Foods)
                foodListRecyclerViewId.visibility = View.VISIBLE
           }
        })
        */

        viewModel.errorMessage.observe(viewLifecycleOwner) {errorMessage ->
           errorMessage?. let {
               if (it) {
                   errorId.visibility = View.VISIBLE
                   foodListRecyclerViewId.visibility = View.GONE
                   progressBarId.visibility = View.GONE
               }
               else{
                   errorId.visibility = View.GONE
               }
           }
        }

        viewModel.foodLoading.observe(viewLifecycleOwner) {loading->
            loading?.let {
                if(loading == true){
                    progressBarId.visibility = View.VISIBLE
                    errorId.visibility = View.GONE
                    foodListRecyclerViewId.visibility = View.GONE
                }
                else {
                    progressBarId.visibility = View.GONE
                }
            }
        }
    }

}



