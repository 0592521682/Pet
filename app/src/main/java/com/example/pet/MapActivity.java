package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        LinearLayout homeMAp = findViewById(R.id.navHomeMap);
        if (homeMAp != null) {
            homeMAp.setOnClickListener(v -> {
                startActivity(new Intent(MapActivity.this,MainActivity.class));
            });
        }
    }
}