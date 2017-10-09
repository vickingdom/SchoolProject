package com.example.sammy.schoolproject.FragFeesAndPayments;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.sammy.schoolproject.R;

import java.util.ArrayList;
import java.util.List;


public class FeesAndPayments extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter feesAndPaymentsAdapter;
    private ArrayList<DataModel> list;
    String[] items = {"View Pending Fees","Make Payments","Other Payments","Receipts"};
    int []icon = {R.drawable.fees, R.drawable.payment,R.drawable.make,R.drawable.reciept};

    public FeesAndPayments() {

    }
    // TODO: Rename and change types and number of parameters
    public static FeesAndPayments newInstance(String param1, String param2) {
        FeesAndPayments fragment = new FeesAndPayments();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fees_and_payments_fragment, container, false);

        if(recyclerView!=null){
            recyclerView.setHasFixedSize(true);
        }
        recyclerView = (RecyclerView) view.findViewById(R.id.feesRecycle);
        layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutManager);

        list = new ArrayList<>();
        for(int i = 0; i<items.length; i++){
            DataModel dataModel = new DataModel(items[i],icon[i]);
            list.add(dataModel);
        }
        feesAndPaymentsAdapter = new FeesAndPaymentsAdapter(list);
        recyclerView.setAdapter(feesAndPaymentsAdapter);
        feesAndPaymentsAdapter.notifyDataSetChanged();

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }
@Override
public boolean onOptionsItemSelected(MenuItem item) {
       return true;
}

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }

        public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
