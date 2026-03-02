package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Wlcoum1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome1);

        Button contnue = findViewById(R.id.contnue);
        if (contnue != null) {
            contnue.setOnClickListener(v -> {
                startActivity(new Intent(Wlcoum1Activity.this, getStartActivity.class));
            });
        }
    }
}