package com.example.sammy.schoolproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sammy on 9/28/2017.
 */

public class Calender_Adapter extends RecyclerView.Adapter<Calender_Adapter.ViewHolder> {

    private String[] text = {"News & Events", "School Time Table"};
    private int[] image = {R.drawable.calender, R.drawable.time_table};

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View menuItems = LayoutInflater.from(parent.getContext()).inflate(R.layout.school_calender_menu, parent, false);
        ViewHolder viewHolder = new ViewHolder (menuItems);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.text.setText(text[position]);
        holder.image.setImageResource(image[position]);
    }

    @Override
    public int getItemCount() {
        return text.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private Context context;
        public TextView text;
        public ImageView image;

        public ViewHolder(View menuItem) {
            super(menuItem);
            context = menuItem.getContext();
            text = (TextView) menuItem.findViewById(R.id.name);
            image = (ImageView) menuItem.findViewById(R.id.image2);
        }
    }
}
