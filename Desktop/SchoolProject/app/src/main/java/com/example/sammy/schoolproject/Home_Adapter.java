package com.example.sammy.schoolproject;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sammy.schoolproject.FragNotifications.Notifications;

/**
 * Created by Sammy on 9/19/2017.
 */

public class Home_Adapter extends RecyclerView.Adapter<Home_Adapter.ViewHolder> {


    private String[] text = {"Fees & Payments", "School Calender", "Notifications", "Academia"};
    private int[] image = {R.drawable.fees, R.drawable.calender, R.drawable.notifications, R.drawable.academia};

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View menuItems = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_menu_layout, parent,false);
        ViewHolder viewHolder = new ViewHolder(menuItems);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.text.setText(text[position]);
        holder.image.setImageResource(image[position]);
    }


    @Override
    public int getItemCount() {
        return text.length;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private  Context context;
        public TextView text;
        public ImageView image;

        public ViewHolder(final View menuItem) {
            super(menuItem);
            context = menuItem.getContext();
            text = (TextView) menuItem.findViewById(R.id.name);
            image = (ImageView) menuItem.findViewById(R.id.image);

            final Fragment fragmentFee = new FeesFragement();
            final Fragment fragmentSchoolCalendar = new FeesFragement();

            menuItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(getAdapterPosition() == 0) {
                        final Fragment fragmentFee = new FeesFragement();
                        final FragmentManager fragmentManager = ((WelcomePage) context).getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_UNSET);
                        fragmentTransaction.replace(R.id.content_frame, fragmentFee).commit();
                        Toast.makeText((WelcomePage)context, "School Fees", Toast.LENGTH_LONG).show();

                    }

                    if(getAdapterPosition() == 1) {
                        final Fragment fragmentFee = new CalenderFragment();
                        final FragmentManager fragmentManager = ((WelcomePage) context).getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_UNSET);
                        fragmentTransaction.replace(R.id.content_frame, fragmentFee).commit();
                        Toast.makeText((WelcomePage)context, "School Calender", Toast.LENGTH_LONG).show();
                    }

                    if(getAdapterPosition() == 2) {
                        final Fragment fragmentNot = new Notifications();
                        final FragmentManager fragmentManager = ((WelcomePage) context).getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_UNSET);
                        fragmentTransaction.replace(R.id.content_frame,fragmentNot).commit();
                        Toast.makeText((WelcomePage)context, "Notifications", Toast.LENGTH_LONG).show();
                    }

                 /*   switch (menuItem.getId()){
                        case 0:
                            fragmentManager.beginTransaction().replace(R.id.content_frame, fragmentFee).commit();
                            break;
                        case 1:
                            //fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
                            Toast.makeText((WelcomePage)context, "Calendar Fragment", Toast.LENGTH_LONG).show();
                            break;
                        case 2:
                            Toast.makeText((WelcomePage)context, "Notification Fragment", Toast.LENGTH_LONG).show();
                           break;
                    } */
                }
            });

        }
    }
}
