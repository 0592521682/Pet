package com.example.pet;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class PetDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_details);

        ImageView btnBack = findViewById(R.id.btnBackDetails);
        if (btnBack != null) {
            btnBack.setOnClickListener(v -> finish());
        }
    }
}