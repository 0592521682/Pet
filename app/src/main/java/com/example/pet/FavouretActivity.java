package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class FavouretActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Pet> favouriteList;
    PetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favouret);


        ImageView btnBack = findViewById(R.id.btnBackFav);
        if (btnBack != null) {
            btnBack.setOnClickListener(v -> finish());
        }


        listView = findViewById(R.id.favouritesListView);
        favouriteList = new ArrayList<>();
        favouriteList.add(new Pet("Luna", "1.2 km", R.drawable.dog, "$100", 4.5f));
        favouriteList.add(new Pet("Mochi", "2.0 km", R.drawable.dogs1, "$120", 5.0f));
        favouriteList.add(new Pet("Rusty", "1.8 km", R.drawable.dog2, "$150", 4.0f));
        favouriteList.add(new Pet("Bella", "3.1 km", R.drawable.rabbits, "$60", 4.2f));

        adapter = new PetAdapter(this, favouriteList);
        if (listView != null) {
            listView.setAdapter(adapter);
            listView.setOnItemClickListener((parent, view, position, id) -> 
                startActivity(new Intent(FavouretActivity.this, PetDetailsActivity.class)));
        }
    }
}