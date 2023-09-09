package com.anilerbil.thebookoffood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import androidx.navigation.Navigation
import com.anilerbil.thebookoffood.model.Food
import com.anilerbil.thebookoffood.viewmodel.FoodDetailViewModel
import kotlinx.android.synthetic.main.fragment_food_detail_.*

class FoodDetailFragment : Fragment() {

    private lateinit var viewModel : FoodDetailViewModel
    private var foodId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_food_detail_, container, false)
    }

     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)

         viewModel = ViewModelProviders.of(this).get(FoodDetailViewModel::class.java)
         viewModel.getRoomData()

         // Argümanı alır:
         arguments?.let {
             foodId = FoodDetailFragmentArgs.fromBundle(it).besinId
             println(foodId)
         }

         fun observeLiveData(){

         }
     }
}