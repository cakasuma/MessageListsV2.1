package com.example.tp039314.messagelists;

/**
 * Created by tp039314 on 19/6/2017.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Contacts extends Fragment {

    RelativeLayout chatpath;
    ViewPager viewPager;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.contacts, container, false);

        chatpath = (RelativeLayout) rootView.findViewById(R.id.contactlayout);
        viewPager = (ViewPager) getActivity().findViewById(R.id.container);

        chatpath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
            }
        });

        return rootView;





    }



}
