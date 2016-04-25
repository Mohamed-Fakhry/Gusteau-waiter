package com.example.eastsound.remourasystem.viewHolder;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.example.eastsound.remourasystem.R;
import com.example.eastsound.remourasystem.model.menu.MenuItem;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by EAST SOUND on 25/04/2016.
 */
public class MealItemViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.mealName)
    TextView mealName;

    @Bind(R.id.price)
    TextView mealPrice;

    Activity categoryActivity;

    public MealItemViewHolder(View itemView, Activity activity) {
        super(itemView);
        categoryActivity = activity;
        ButterKnife.bind(this,itemView);
    }

    public void setMeal(MenuItem menuItem){
        if(menuItem.getName() != null )
            mealName.setText(menuItem.getName());
        if(String.valueOf(menuItem.getPrice())!=null)
            mealPrice.setText(String.valueOf(menuItem.getPrice())+" EL");

    }
}
