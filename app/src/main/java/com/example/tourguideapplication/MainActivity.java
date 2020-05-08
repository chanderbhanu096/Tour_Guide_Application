package com.example.tourguideapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        // Set the content of the activity to use the activity_main.xml layout file


        // Find the view pager that will allow the user to swipe between fragments
        final ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        // Create an adapter that knows which fragment should be shown on each page
        FragmentPagerAdapter adapter = new Fragment_Pager_Adapter(this,getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        // Set the adapter onto the view pager
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
        });
    }
}