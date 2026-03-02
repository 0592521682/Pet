package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;

public class FavouretActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Pet> favouriteList;
    PetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favouret);

        // 1. برمجة زر الرجوع
        ImageView btnBack = findViewById(R.id.btnBackFav);
        if (btnBack != null) {
            btnBack.setOnClickListener(v -> finish());
        }

        // 2. إعداد الـ ListView والمفضلات
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

        // 3. برمجة الـ BottomNavigationView الرسمي
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        if (bottomNavigationView != null) {
            // تفعيل أيقونة المفضلات كخيار محدد حالياً
            bottomNavigationView.setSelectedItemId(R.id.nav_fav);

            bottomNavigationView.setOnItemSelectedListener(item -> {
                int itemId = item.getItemId();
                if (itemId == R.id.nav_home) {
                    startActivity(new Intent(this, MainActivity.class));
                    return true;
                } else if (itemId == R.id.nav_maps) {
                    startActivity(new Intent(this, MapActivity.class));
                    return true;
                } else if (itemId == R.id.nav_fav) {
                    return true; // نحن بالفعل في المفضلات
                } else if (itemId == R.id.nav_msg) {
                    startActivity(new Intent(this, ChatActivity.class));
                    return true;
                } else if (itemId == R.id.nav_account) {
                    startActivity(new Intent(this, AccountActivity.class));
                    return true;
                }
                return false;
            });
        }
    }
}