package com.example.tourguideapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class LakesAdapter extends ArrayAdapter<Lakes> {
Context context;
ArrayList<Lakes> lakeslist;
    public LakesAdapter(@NonNull Context context, ArrayList<Lakes> lakeslist) {
       super(context,0);
        this.context = context;
        this.lakeslist = lakeslist;
    }
   public View getView(int position, View convertView, ViewGroup parent) {
    // Check if the existing view is being reused, otherwise inflate the view
    View listItemView = convertView;
    if(listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list, parent, false);
    }

    // Get the {@link AndroidFlavor} object located at this position in the list
    Lakes current_Song = getItem(position);

    // Find the TextView in the list_item.xml layout with the ID version_name
    TextView songTextView = (TextView) listItemView.findViewById(R.id.tvName);
    // Get the version name from the current AndroidFlavor object and
    // set this text on the name TextView
    songTextView.setText(current_Song.getVersionNumber());

    // Find the TextView in the list_item.xml layout with the ID version_number
    TextView authorTextView = (TextView) listItemView.findViewById(R.id.tvDesc);
    // Get the version number from the current AndroidFlavor object and
    // set this text on the number TextView
    authorTextView.setText(current_Song.getVersionName());
    ImageView iconView = (ImageView) listItemView.findViewById(R.id.ivImage);
    // Get the image resource ID from the current AndroidFlavor object and
    // set the image to iconView
    iconView.setImageResource(current_Song.getImageResourceId());

    // Return the whole list item layout (containing 2 TextViews and an ImageView)
    // so that it can be shown in the ListView
    return listItemView;

}

}
