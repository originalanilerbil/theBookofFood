package com.anilerbil.thebookoffood

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anilerbil.thebookoffood.model.Food
import kotlinx.android.synthetic.main.food_recycler_view.view.*

class FoodRecyclerAdapter(val foodList : ArrayList<Food>) : RecyclerView.Adapter<FoodRecyclerAdapter.FoodViewHolder>() {
    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.food_recycler_view,parent,false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.itemView.textView.text = foodList.get(position).foodName
        holder.itemView.textView2.text = foodList.get(position).foodCalori

        //görsel eklenecek glide ile


    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    fun foodListRefresh(newFoodList: List<Food>){
        foodList.clear()
        foodList.addAll(newFoodList)
        notifyDataSetChanged()
    }

}