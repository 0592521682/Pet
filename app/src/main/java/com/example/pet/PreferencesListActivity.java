package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class PreferencesListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences_list);

        ImageView btnBack = findViewById(R.id.btnBackPref);
        if (btnBack != null) {
            btnBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
        setupDetailsClick(R.id.imgPref1);
        setupDetailsClick(R.id.imgPref2);
        setupDetailsClick(R.id.imgPref3);
        setupDetailsClick(R.id.imgPref4);
    }
    private void setupDetailsClick(int viewId) {
        View view = findViewById(viewId);
        if (view != null) {
            view.setOnClickListener(v -> {
                startActivity(new Intent(PreferencesListActivity.this, PetDetailsActivity.class));
            });
        }
    }
}