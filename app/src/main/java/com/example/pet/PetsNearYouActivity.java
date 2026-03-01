package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class PetsNearYouActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets_near_you);

        ImageView btnBack = findViewById(R.id.btnBackNearYou);
        if (btnBack != null) {
            btnBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
        setupDetailsClick(R.id.imgNear1);
        setupDetailsClick(R.id.imgNear2);

    }
    private void setupDetailsClick(int viewId) {
        View view = findViewById(viewId);
        if (view != null) {
            view.setOnClickListener(v -> {
                startActivity(new Intent(PetsNearYouActivity.this, PetDetailsActivity.class));
            });
        }
    }
}