package com.example.examplegridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();

        int position = intent.getExtras().getInt("id");
        ImageAdapter img = new ImageAdapter(this);


        ImageView imgView = findViewById(R.id.single_view);
        imgView.setImageResource(img.logo[position]);

    }
}