package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class FavouretActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favouret);


            LinearLayout homeFav = findViewById(R.id.HomeChat);
            homeFav.setOnClickListener(v -> {
                startActivity(new Intent(FavouretActivity.this, MainActivity.class));
            });


    }
}