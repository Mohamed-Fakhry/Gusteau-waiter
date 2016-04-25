package com.example.eastsound.remourasystem.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.eastsound.remourasystem.R;
import com.example.eastsound.remourasystem.model.menu.Category;
import com.example.eastsound.remourasystem.viewHolder.CategoryItemViewHolder;
import java.util.ArrayList;


public class CategoriesAdapter extends RecyclerView.Adapter<CategoryItemViewHolder> {

    ArrayList<Category> categories;
    Activity categoriesActivity;

    public CategoriesAdapter(Activity categoriesActivity,ArrayList<Category> categories){
        this.categories = categories;
        this.categoriesActivity = categoriesActivity;
    }

    @Override
    public CategoryItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CategoryItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category,null),categoriesActivity);
    }

    @Override
    public void onBindViewHolder(CategoryItemViewHolder holder, int position) {
        holder.setCategory(categories.get(position));
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
