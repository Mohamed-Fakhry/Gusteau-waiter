package com.example.eastsound.remourasystem;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eastsound.remourasystem.model.menu.Category;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MakeOrder extends Fragment {

    @Bind(R.id.categories)
    RecyclerView categoryRecyclerView;
    ArrayList<Category> categories;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        getCategories();
    /*
        categoryRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        CategoriesAdapter adapter = new CategoriesAdapter(getActivity(),categories);
        categoryRecyclerView.setAdapter(adapter);
    */
        return inflater.inflate(R.layout.menu_order, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ButterKnife.bind(getActivity());
    }


    @Override
    public void onResume() {
        super.onResume();
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
