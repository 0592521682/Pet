package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;

public class PetsNearYouActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Pet> petList;
    PetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets_near_you);

        // 1. برمجة زر الرجوع
        ImageView btnBack = findViewById(R.id.btnBackNearYou);
        if (btnBack != null) {
            btnBack.setOnClickListener(v -> finish());
        }

        // 2. إعداد الـ ListView والبيانات
        listView = findViewById(R.id.petsNearYouListView);
        petList = new ArrayList<>();
        petList.add(new Pet("Luna", "1.2 km", R.drawable.dog, "$100", 4.5f));
        petList.add(new Pet("Rusty", "1.8 km", R.drawable.dog2, "$150", 4.0f));
        petList.add(new Pet("Milo", "2.5 km", R.drawable.cats, "$80", 5.0f));
        petList.add(new Pet("Bella", "3.1 km", R.drawable.rabbits, "$60", 4.2f));

        adapter = new PetAdapter(this, petList);
        if (listView != null) {
            listView.setAdapter(adapter);
            listView.setOnItemClickListener((parent, view, position, id) -> 
                startActivity(new Intent(this, PetDetailsActivity.class)));
        }

        // 3. برمجة الـ BottomNavigationView الرسمي
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationViewNear);
        if (bottomNavigationView != null) {
            // نترك اختيار الأيقونة حسب التصميم (Home أو Maps)
            bottomNavigationView.setSelectedItemId(R.id.nav_maps);

            bottomNavigationView.setOnItemSelectedListener(item -> {
                int itemId = item.getItemId();
                if (itemId == R.id.nav_home) {
                    startActivity(new Intent(this, MainActivity.class));
                    return true;
                } else if (itemId == R.id.nav_maps) {
                    return true;
                } else if (itemId == R.id.nav_fav) {
                    startActivity(new Intent(this, FavouretActivity.class));
                    return true;
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