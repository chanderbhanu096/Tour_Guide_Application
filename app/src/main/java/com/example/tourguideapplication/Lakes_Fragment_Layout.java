package com.example.tourguideapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Lakes_Fragment_Layout#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Lakes_Fragment_Layout extends Fragment {


    public Lakes_Fragment_Layout() {
        // Required empty public constructor
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView list = (ListView)view.findViewById(R.id.list);
        LakesAdapter adapter;
        adapter = new LakesAdapter(getContext(),fakeData.getLakesData());
        list.setAdapter(adapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lakes___layout, container, false);
    }
}
