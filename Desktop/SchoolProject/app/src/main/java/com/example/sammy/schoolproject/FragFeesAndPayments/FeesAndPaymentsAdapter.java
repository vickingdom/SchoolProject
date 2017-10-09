package com.example.sammy.schoolproject.FragFeesAndPayments;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sammy.schoolproject.R;

import java.util.List;

/**
 * Created by Victor on 9/25/2017.
 */

public class FeesAndPaymentsAdapter extends RecyclerView.Adapter<FeesAndPaymentsAdapter.ViewHolder> {

    private List<DataModel> list;
    private static Context context;

    public FeesAndPaymentsAdapter(List<DataModel> list) {

        this.list = list;

    }

    @Override
    public FeesAndPaymentsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fees_payments_menu, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(FeesAndPaymentsAdapter.ViewHolder viewHolder, final int position) {
        viewHolder.tvItem.setText(list.get(position).name);
        viewHolder.iconView.setImageResource(list.get(position).icon);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView tvItem;
        ImageView iconView;

        public ViewHolder(View view) {
            super(view);
            cardView = (CardView) view.findViewById(R.id.cardView);
            tvItem = (TextView) view.findViewById(R.id.name);
            iconView = (ImageView) view.findViewById(R.id.image1);
        }


    }
}

