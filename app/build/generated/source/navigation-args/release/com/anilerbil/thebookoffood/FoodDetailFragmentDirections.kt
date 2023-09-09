package com.anilerbil.thebookoffood

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class FoodDetailFragmentDirections private constructor() {
  public companion object {
    public fun actionFoodDetailFragmentToFoodListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_foodDetail_Fragment_to_foodList_Fragment)
  }
}
