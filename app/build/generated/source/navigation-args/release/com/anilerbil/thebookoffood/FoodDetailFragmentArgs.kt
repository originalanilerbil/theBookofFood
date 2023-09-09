package com.anilerbil.thebookoffood

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class FoodDetailFragmentArgs(
  public val besinId: Int = 0
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("besinId", this.besinId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("besinId", this.besinId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): FoodDetailFragmentArgs {
      bundle.setClassLoader(FoodDetailFragmentArgs::class.java.classLoader)
      val __besinId : Int
      if (bundle.containsKey("besinId")) {
        __besinId = bundle.getInt("besinId")
      } else {
        __besinId = 0
      }
      return FoodDetailFragmentArgs(__besinId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): FoodDetailFragmentArgs {
      val __besinId : Int?
      if (savedStateHandle.contains("besinId")) {
        __besinId = savedStateHandle["besinId"]
        if (__besinId == null) {
          throw IllegalArgumentException("Argument \"besinId\" of type integer does not support null values")
        }
      } else {
        __besinId = 0
      }
      return FoodDetailFragmentArgs(__besinId)
    }
  }
}
