package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class step2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_step2);
        Button step2 = findViewById(R.id.btnContinue2);
        if (step2 != null) {
            step2.setOnClickListener(v -> {
                startActivity(new Intent(step2Activity.this, step3Activity.class));
            });
        }
    }
}