package com.example.pet;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class PetListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_list);

        // 1. إعداد زر الرجوع والعنوان
        ImageView btnBack = findViewById(R.id.btnBack);
        TextView txtCategoryTitle = findViewById(R.id.txtCategoryTitle);
        
        btnBack.setOnClickListener(v -> finish());

        // 2. الحصول على الفئة المختارة
        String category = getIntent().getStringExtra("CATEGORY");
        if (category != null) {
            txtCategoryTitle.setText(category);
        }

        // 3. تطبيق الـ ListView مع الـ Custom Adapter (المحاضرة الثانية)
        ListView petsListView = findViewById(R.id.petsListView);

        // إنشاء المصفوفة لتخزين كائنات من نوع Pet
        ArrayList<Pet> petList = new ArrayList<>();
        
        // إضافة بيانات متكاملة بناءً على الفئة المختارة
        if ("Dogs".equals(category)) {
            petList.add(new Pet("Luna", "Chihuahua", R.drawable.dog, "$120", 4.5f));
            petList.add(new Pet("Rusty", "Shiba Inu", R.drawable.dog2, "$250", 5.0f));
            petList.add(new Pet("Max", "Golden Retriever", R.drawable.dogs, "$300", 4.8f));
            petList.add(new Pet("Scout", "Afghan Hound", R.drawable.dog, "$400", 4.2f));
        } else if ("Cats".equals(category)) {
            petList.add(new Pet("Kitty", "Persian", R.drawable.cats, "$150", 4.7f));
            petList.add(new Pet("Simba", "Main Coon", R.drawable.cat2, "$200", 4.9f));
            petList.add(new Pet("Misty", "Siamese", R.drawable.cat3, "$180", 4.3f));
        } else {
            // بيانات افتراضية لبقية الأنواع
            petList.add(new Pet("Buddy", "Common", R.drawable.other, "Free", 4.0f));
            petList.add(new Pet("Rex", "Friendly", R.drawable.reptiles, "$50", 3.5f));
        }

        // استخدام الـ Custom Adapter الذي صممناه
        PetAdapter adapter = new PetAdapter(this, petList);

        // ربط الـ Adapter بالـ ListView
        petsListView.setAdapter(adapter);
    }
}