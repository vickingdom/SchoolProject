package com.example.sammy.schoolproject.FragNotifications;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sammy.schoolproject.R;

import java.util.ArrayList;

/**
 * Created by Victor on 9/28/2017.
 */

public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.ViewHolder> {

    private ArrayList<DataModel> list;

    public NotificationsAdapter(ArrayList<DataModel> list){
        this.list = list;
    }
    @Override
    public NotificationsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notifications_menu,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(NotificationsAdapter.ViewHolder viewHolder, int position) {

      
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView empty;

        public ViewHolder(View view){
            super(view);
            cardView = (CardView)view.findViewById(R.id.cardView);
            empty =(TextView)view.findViewById(R.id.name);
        }

    }
}
