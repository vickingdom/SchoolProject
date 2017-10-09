package com.example.sammy.schoolproject.FragSchoolCalender;

/**
 * Created by Victor on 9/27/2017.
 */

public class DataModel {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String name;
    public int icon;


    public DataModel(String name, int icon) {
        this.name = name;
        this.icon = icon;
    }



}
