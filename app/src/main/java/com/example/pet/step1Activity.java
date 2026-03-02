package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class step1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_step1);

        Button step1 = findViewById(R.id.btnContinue1);
        if (step1 != null) {
            step1.setOnClickListener(v -> {
                startActivity(new Intent(step1Activity.this, step2Activity.class));
            });
        }
    }
}