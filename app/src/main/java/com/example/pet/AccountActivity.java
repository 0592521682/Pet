package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);


        View btnLogout = findViewById(R.id.btnSignout);
        if (btnLogout != null) {
            btnLogout.setOnClickListener(v -> {
                startActivity(new Intent(AccountActivity.this, signInActivity.class));
                finish();
            });
        }


        setupNavigation(R.id.navHomeAcc, MainActivity.class);
        setupNavigation(R.id.navMapsAcc, MapActivity.class);
        setupNavigation(R.id.navFavAcc, FavouretActivity.class);
        setupNavigation(R.id.navMsgAcc, ChatActivity.class);



        setupOptionClick(R.id.RelativeProfileAcc, EditProfileActivity.class);
        setupOptionClick(R.id.RelativeMyPet, PreferencesListActivity.class);
        setupOptionClick(R.id.RelativeHelpAcc, HelpSupportActivity.class);
    }

    private void setupNavigation(int viewId, Class<?> activityClass) {
        LinearLayout navItem = findViewById(viewId);
        if (navItem != null) {
            navItem.setOnClickListener(v -> startActivity(new Intent(AccountActivity.this, activityClass)));
        }
    }

    private void setupOptionClick(int viewId, Class<?> activityClass) {
        View view = findViewById(viewId);
        if (view != null) {
            view.setOnClickListener(v -> startActivity(new Intent(AccountActivity.this, activityClass)));
        }
    }
}