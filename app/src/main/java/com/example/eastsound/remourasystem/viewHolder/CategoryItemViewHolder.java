package com.example.eastsound.remourasystem.viewHolder;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.eastsound.remourasystem.R;
import com.example.eastsound.remourasystem.model.menu.Category;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by EAST SOUND on 24/04/2016.
 */
public class CategoryItemViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.categoryImage)
    ImageView categoryImage;
    @Bind(R.id.categoryNameE)
    TextView categoryNameE;
    @Bind(R.id.categoryNameA)
    TextView categoryNameA;
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
            categoryNameA.setText(category.getNameArbic());

        if (category.getNameEnglish()!=null)
            categoryNameE.setText(category.getNameEnglish());

    }

}
