package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class PreferencesListActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Pet> petList;
    PetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences_list);

        // 1. برمجة زر الرجوع
        ImageView btnBack = findViewById(R.id.btnBackPref);
        if (btnBack != null) {
            btnBack.setOnClickListener(v -> finish());
        }

        // 2. إعداد الـ ListView والبيانات (المفضلة)
        listView = findViewById(R.id.preferencesListView);
        petList = new ArrayList<>();

        // إضافة بيانات بناءً على التفضيلات (مثلاً حيوانات مميزة)
        petList.add(new Pet("Max", "Golden Retriever", R.drawable.dog2, "$200", 4.9f));
        petList.add(new Pet("Oliver", "Siamese Cat", R.drawable.cat2, "$120", 4.7f));
        petList.add(new Pet("Leo", "Persian Cat", R.drawable.cats1, "$150", 4.8f));
        petList.add(new Pet("Cooper", "Beagle", R.drawable.dogs5, "$180", 4.6f));
        petList.add(new Pet("Charlie", "Parrot", R.drawable.bired, "$90", 4.5f));

        // 3. ربط الـ Adapter
        adapter = new PetAdapter(this, petList);
        if (listView != null) {
            listView.setAdapter(adapter);

            // الانتقال لصفحة التفاصيل عند الضغط على أي عنصر
            listView.setOnItemClickListener((parent, view, position, id) -> {
                Intent intent = new Intent(PreferencesListActivity.this, PetDetailsActivity.class);
                startActivity(intent);
            });
        }
    }
}