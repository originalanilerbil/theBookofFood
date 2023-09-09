package com.anilerbil.thebookoffood.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.anilerbil.thebookoffood.model.Food

class FoodListViewModel : ViewModel() {

    val foods = MutableLiveData<List<Food>>()
    var errorMessage = MutableLiveData<Boolean>()
    var foodLoading = MutableLiveData<Boolean>()

    fun refreshData() {
        val muz = Food("Muz", "100", "50","25","12","www.test.com")
        val cilek = Food("Çilek", "100", "50","25","12","www.test.com")
        val elma = Food("Elma", "100", "50","25","12","www.test.com")

        val foodList = arrayListOf<Food>(muz,cilek,elma)

        foods.value = foodList
        errorMessage.value = false
        foodLoading.value = false

    }


}