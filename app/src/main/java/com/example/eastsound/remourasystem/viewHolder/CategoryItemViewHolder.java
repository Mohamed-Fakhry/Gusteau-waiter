package com.example.eastsound.remourasystem.viewHolder;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.eastsound.remourasystem.R;
import com.example.eastsound.remourasystem.adapter.MealsAdapter;
import com.example.eastsound.remourasystem.model.menu.Category;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by EAST SOUND on 24/04/2016.
 */
public class CategoryItemViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.header1)
    View view;
    @Bind(R.id.categoryImage)
    ImageView categoryImage;
    @Bind(R.id.categoryNameE)
    TextView categoryNameE;
    @Bind(R.id.categoryNameA)
    TextView categoryNameA;
    @Bind(R.id.mealRecycle)
    RecyclerView mealRecyclerView;

    Activity categoryActivity;

    public CategoryItemViewHolder(View itemView , Activity activity) {
        super(itemView);
        categoryActivity = activity;
        ButterKnife.bind(this,itemView);
    }

    public void setCategory(Category category){

        if(category.getImageURL()!=null)
            Glide.with(categoryActivity)
                    .load(R.drawable.pizza2)
                    .asBitmap()
                    .into(categoryImage);

        if (category.getNameArbic()!=null)
            categoryNameE.setText(category.getNameArbic());

        if (category.getNameEnglish()!=null)
            categoryNameE.setText(category.getNameEnglish());

        addMeals(category);

        showMeals();
    }

    private void addMeals(Category category) {
        MealsAdapter adapter = new MealsAdapter(categoryActivity,category.getCategoryItems());
        mealRecyclerView.setLayoutManager(new LinearLayoutManager(categoryActivity, LinearLayout.VERTICAL,false));
        mealRecyclerView.setAdapter(adapter);
    }

    private void showMeals() {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mealRecyclerView.getVisibility() == View.GONE) {
                    mealRecyclerView.setVisibility(View.VISIBLE);
                }
                else {
                    mealRecyclerView.setVisibility(View.GONE);
                }
            }
        });
    }

}
