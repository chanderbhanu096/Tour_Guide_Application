package com.example.tourguideapplication;

import java.util.ArrayList;

public class fakeData {
    static ArrayList<Lakes> getLakesData(){
        ArrayList<Lakes> fakedata =new ArrayList<>();
        fakedata.add(new Lakes("hello","hello",R.drawable.ic_launcher_background));
        fakedata.add(new Lakes("hello","hello",R.drawable.ic_launcher_background));
        return fakedata;
    }
}
