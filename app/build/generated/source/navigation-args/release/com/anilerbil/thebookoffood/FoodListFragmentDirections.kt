package com.anilerbil.thebookoffood

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int

public class FoodListFragmentDirections private constructor() {
  private data class ActionFoodListFragmentToFoodDetailFragment(
    public val besinId: Int = 0
  ) : NavDirections {
    public override val actionId: Int = R.id.action_foodList_Fragment_to_foodDetail_Fragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("besinId", this.besinId)
        return result
      }
  }

  public companion object {
    public fun actionFoodListFragmentToFoodDetailFragment(besinId: Int = 0): NavDirections =
        ActionFoodListFragmentToFoodDetailFragment(besinId)
  }
}
