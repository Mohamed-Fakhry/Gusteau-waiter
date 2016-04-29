package com.example.eastsound.remourasystem.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.eastsound.remourasystem.R;
import com.example.eastsound.remourasystem.model.menu.Category;
import com.example.eastsound.remourasystem.model.menu.MenuItem;
import com.example.eastsound.remourasystem.viewHolder.MealItemViewHolder;

import java.util.ArrayList;


public class MealsAdapter extends RecyclerView.Adapter <MealItemViewHolder>{
    ArrayList<MenuItem> mealsCategory;
    Activity categoryActivity;

    public MealsAdapter(Activity categoryActivity,ArrayList<MenuItem> mealsCategory){
        this.mealsCategory = mealsCategory;
        this.categoryActivity = categoryActivity;
    }

    @Override
    public MealItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MealItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_meal,null),categoryActivity);

    }

    @Override
    public void onBindViewHolder(MealItemViewHolder holder, int position) {
        holder.setMeal(mealsCategory.get(position));
    }

    @Override
    public int getItemCount() {
        return mealsCategory.size();
    }
}
