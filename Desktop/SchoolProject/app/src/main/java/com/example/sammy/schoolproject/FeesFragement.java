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
public class FeesFragement extends Fragment {

    RecyclerView recyclerView;
    Fees_Adapter adapter;
    RecyclerView.LayoutManager layoutManager;


    public FeesFragement() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fees_and_payments_fragment, container, false);
        //getActivity().getActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) rootview.findViewById(R.id.feesRecycle);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Fees_Adapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        return rootview;
    }

}
