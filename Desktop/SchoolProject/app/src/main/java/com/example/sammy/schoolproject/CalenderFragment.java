package com.example.sammy.schoolproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class CalenderFragment extends Fragment {
    RecyclerView recyclerView;
    Calender_Adapter adapter;
    RecyclerView.LayoutManager layoutManager;



    public CalenderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootview = inflater.inflate(R.layout.school_calender_fragment, container, false);
       // getActivity().getActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView = (RecyclerView) rootview.findViewById(R.id.calenderRecycle);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Calender_Adapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);


        return rootview;
    }

}
