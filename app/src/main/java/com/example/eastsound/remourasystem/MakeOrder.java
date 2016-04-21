package com.example.eastsound.remourasystem;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MakeOrder extends Fragment {
    View[] section = new View[4] ;
    ImageView testImage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.menu_order, container, false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        createAccordion(getActivity());
    }

    private void createAccordion(Activity myActivity) {

        section[0] = myActivity.findViewById(R.id.section1);
        section[1] = myActivity.findViewById(R.id.section2);
        section[2] = myActivity.findViewById(R.id.section3);
        section[3] = myActivity.findViewById(R.id.section4);

        testImage =(ImageView)myActivity.findViewById(R.id.image);
        Glide.with(this).load(R.drawable.pizza).into(testImage);

        View[] header = new View[4];

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
}
