package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        ImageView imgSearch = findViewById(R.id.imgSearch);
        imgSearch.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,SearchActivity.class));
        });


        LinearLayout imgChat = findViewById(R.id.navMsg);
        imgChat.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ChatActivity.class));
        });

        LinearLayout imgFavouret = findViewById(R.id.navFav);
        imgFavouret.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, FavouretActivity.class));
        });




        LinearLayout map = findViewById(R.id.navMaps);
        if (map != null) {
            map.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity.this,MapActivity.class));
            });
        }


        ImageView imgNotification = findViewById(R.id.imgNotification);
        imgNotification.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, NotificationsActivity.class));
        });


        TextView btnViewAllNear = findViewById(R.id.btnViewAllNear);
        if (btnViewAllNear != null) {
            btnViewAllNear.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity.this, PetsNearYouActivity.class));
            });
        }


        TextView btnViewAllPref = findViewById(R.id.btnViewAllPref);
        if (btnViewAllPref != null) {
            btnViewAllPref.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity.this, PreferencesListActivity.class));
            });
        }


        LinearLayout navAccount = findViewById(R.id.navAccount);
        if (navAccount != null) {
            navAccount.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity.this, AccountActivity.class));
            });
        }





        setupPetCardClick(R.id.petCard1);
        setupPetCardClick(R.id.petCard2);
        setupPetCardClick(R.id.petCard3);
        setupPetCardClick(R.id.petCard4);
        setupPetCardClick(R.id.petCard5);
        setupPetCardClick(R.id.petCard6);
        setupPetCardClick(R.id.petCard7);
        setupPetCardClick(R.id.petCard8);
        setupPetCardClick(R.id.petCard9);
        setupPetCardClick(R.id.petCard10);



        setupCategoryClick(R.id.catDogs, "Dogs");
        setupCategoryClick(R.id.catCats, "Cats");
        setupCategoryClick(R.id.catRabbits, "Rabbits");
        setupCategoryClick(R.id.catBirds, "Birds");
        setupCategoryClick(R.id.catReptiles, "Reptiles");
        setupCategoryClick(R.id.catFish, "Fish");
        setupCategoryClick(R.id.catPrimates, "Primates");
        setupCategoryClick(R.id.catOther, "Other");
    }

    private void setupPetCardClick(int viewId) {
        ConstraintLayout card = findViewById(viewId);
        if (card != null) {
            card.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity.this, PetDetailsActivity.class));//PetDetailsActivity.class مؤقت
            });
        }
    }

    private void setupCategoryClick(int viewId, final String categoryName) {
        LinearLayout categoryLayout = findViewById(viewId);
        if (categoryLayout != null) {
            categoryLayout.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, PetListActivity.class);
                intent.putExtra("CATEGORY", categoryName);
                startActivity(intent);
            });
        }
    }
}