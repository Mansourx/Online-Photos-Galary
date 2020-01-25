package com.example.onlinegalary.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.example.onlinegalary.Adapters.FullSizeAdapter;
import com.example.onlinegalary.R;

/**
 * Created by ahmad Mansour on 25,January,2020
 */
public class FullScreenActivity extends Activity {

    ViewPager viewPager;
    String[] images;
    int position;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        if (savedInstanceState == null) {
            Intent i  = getIntent();
            images = i.getStringArrayExtra("IMAGES");
            position = i.getIntExtra("POSITION", 0);
        }

        viewPager = findViewById(R.id.view_pager);

        FullSizeAdapter fullSizeAdapter = new FullSizeAdapter(this, images);
        viewPager.setAdapter(fullSizeAdapter);
        viewPager.setCurrentItem(position, true);

    }




}
