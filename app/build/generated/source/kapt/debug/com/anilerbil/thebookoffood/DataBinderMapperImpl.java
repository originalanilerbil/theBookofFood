package com.anilerbil.thebookoffood;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.anilerbil.thebookoffood.databinding.FoodRecyclerViewBindingImpl;
import com.anilerbil.thebookoffood.databinding.FragmentFoodDetailBindingImpl;
import com.anilerbil.thebookoffood.databinding.FragmentFoodListBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FOODRECYCLERVIEW = 1;

  private static final int LAYOUT_FRAGMENTFOODDETAIL = 2;

  private static final int LAYOUT_FRAGMENTFOODLIST = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.anilerbil.thebookoffood.R.layout.food_recycler_view, LAYOUT_FOODRECYCLERVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.anilerbil.thebookoffood.R.layout.fragment_food_detail_, LAYOUT_FRAGMENTFOODDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.anilerbil.thebookoffood.R.layout.fragment_food_list_, LAYOUT_FRAGMENTFOODLIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FOODRECYCLERVIEW: {
          if ("layout/food_recycler_view_0".equals(tag)) {
            return new FoodRecyclerViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for food_recycler_view is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFOODDETAIL: {
          if ("layout/fragment_food_detail__0".equals(tag)) {
            return new FragmentFoodDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_food_detail_ is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFOODLIST: {
          if ("layout/fragment_food_list__0".equals(tag)) {
            return new FragmentFoodListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_food_list_ is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/food_recycler_view_0", com.anilerbil.thebookoffood.R.layout.food_recycler_view);
      sKeys.put("layout/fragment_food_detail__0", com.anilerbil.thebookoffood.R.layout.fragment_food_detail_);
      sKeys.put("layout/fragment_food_list__0", com.anilerbil.thebookoffood.R.layout.fragment_food_list_);
    }
  }
}
