package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class step2Activity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Pet> animalTypes;
    PetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);


        ImageView btnBack = findViewById(R.id.btnBackStep2);
        if (btnBack != null) {
            btnBack.setOnClickListener(v -> finish());
        }


        gridView = findViewById(R.id.animalsGridView);
        animalTypes = new ArrayList<>();


        animalTypes.add(new Pet("Dogs", "", R.drawable.dogs, "", 0));
        animalTypes.add(new Pet("Cats", "", R.drawable.cat3, "", 0));
        animalTypes.add(new Pet("Birds", "", R.drawable.birds, "", 0));
        animalTypes.add(new Pet("Rabbits", "", R.drawable.rabbits, "", 0));
        animalTypes.add(new Pet("Fish", "", R.drawable.fish, "", 0));
        animalTypes.add(new Pet("Reptiles", "", R.drawable.reptiles, "", 0));


        adapter = new PetAdapter(this, animalTypes);
        if (gridView != null) {
            gridView.setAdapter(adapter);
        }


        Button btnContinue = findViewById(R.id.btnContinue2);
        if (btnContinue != null) {
            btnContinue.setOnClickListener(v -> {
                startActivity(new Intent(step2Activity.this, step3Activity.class));
            });
        }
    }
}