package com.example.onlinegalary.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.onlinegalary.Adapters.GalleryImageAdapter;
import com.example.onlinegalary.R;
import com.example.onlinegalary.interfaces.IRecyclerViewClickListener;

import java.util.Random;

public class GalleryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);


        Random random = new Random();

        final String[] images = new String[10];

        for (int i = 0 ; i < images.length; i++) {
            images[i] = "https://picsum.photos/600?image="+ random.nextInt(1000+1);
        }

        final IRecyclerViewClickListener listener = new IRecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                // open the full screen activity with image
            }
        };

        GalleryImageAdapter galaryImageAdaper = new GalleryImageAdapter(this, images, listener);
        recyclerView.setAdapter(galaryImageAdaper);
    }
}
