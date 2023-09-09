package com.anilerbil.thebookoffood.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.anilerbil.thebookoffood.model.Food

class FoodDetailViewModel: ViewModel() {

    val foodLiveData = MutableLiveData<Food>()

    fun getRoomData(){
        val muz = Food("Muz", "100", "50","25","12","www.test.com")
        foodLiveData.value = muz
    }
}