package com.example.sammy.schoolproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {

    RecyclerView recyclerView;
    Home_Adapter adapter;
    RecyclerView.LayoutManager layoutManager;



    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.welcome_fragment, container, false);
        recyclerView = (RecyclerView) rootview.findViewById(R.id.recycle);
        layoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Home_Adapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        return rootview;
    }

}
