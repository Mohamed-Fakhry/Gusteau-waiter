package com.example.eastsound.remourasystem;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.eastsound.remourasystem.Service.Responed;
import com.example.eastsound.remourasystem.Service.SetupService;
import com.example.eastsound.remourasystem.adapter.CategoriesAdapter;
import com.example.eastsound.remourasystem.model.menu.Category;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MakeOrder extends Fragment {

    @Bind(R.id.categories)
    RecyclerView categoryRecyclerView;
    ArrayList<Category> categories;

    public static MakeOrder newMakeOrder(Bundle bundle){
        MakeOrder makeOrder = new MakeOrder();
        makeOrder.setArguments(bundle);
        return makeOrder;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //// TODO: 25/04/2016 get paramenters
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_order, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getCategories(getActivity());
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    public void getCategories(final Activity activity){
        SetupService.getservice.getcategories().enqueue(new Callback<Responed>() {
            @Override
            public void onResponse(Call<Responed> call, Response<Responed> response) {
                categories = response.body().getCategoryArrayList();
                categoryRecyclerView.setLayoutManager(new LinearLayoutManager(activity, LinearLayout.VERTICAL,false));
                CategoriesAdapter adapter = new CategoriesAdapter(activity,categories);
                categoryRecyclerView.setAdapter(adapter);
                Log.d("Test","Seccess");
            }

            @Override
            public void onFailure(Call<Responed> call, Throwable t) {
                Log.d("Test","Fail");
            }
        });
    }

}
/*
    private void createAccordion(Activity myActivity) {

        section[0] = myActivity.findViewById(R.id.section1);
        section[1] = myActivity.findViewById(R.id.section2);
        section[2] = myActivity.findViewById(R.id.section3);
        section[3] = myActivity.findViewById(R.id.section4);

       testImage =(ImageView)myActivity.findViewById(R.id.image);
        Glide.with(this).load(R.drawable.pizza).into(testImage);


        header[0] = myActivity.findViewById(R.id.header1);
        header[1] = myActivity.findViewById(R.id.header2);
        header[2] = myActivity.findViewById(R.id.header3);
        header[3] = myActivity.findViewById(R.id.header4);


        for (int i = 0 ; i < header.length ;i++){
            setLisener(header[i],section[i]);
        }

    }

    private void setLisener(final View view, final View view2) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (View view1 : section){
                    if (view1.getVisibility() == View.GONE && view1.equals(view2)) {
                        view1.setVisibility(View.VISIBLE);
                        view1.setFocusable(true);
                    } else {
                        view1.setVisibility(View.GONE);
                    }
                }
            }
        });
    }
*/
