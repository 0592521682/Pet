package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);


        ImageView btnLogout = findViewById(R.id.iconLogout);
        if (btnLogout != null) {
            btnLogout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }

        LinearLayout navMain = findViewById(R.id.navHomeAcc);
        if (navMain != null) {
            navMain.setOnClickListener(v -> {
                startActivity(new Intent(AccountActivity.this, MainActivity.class));
            });
        }

        ImageView relativeMyProfile = findViewById(R.id.RelativeMyProfile);
        if (relativeMyProfile != null) {
            relativeMyProfile.setOnClickListener(v -> {
                startActivity(new Intent(AccountActivity.this, EditProfileActivity.class));
            });
        }

        RelativeLayout appAppearAcc = findViewById(R.id.AppAppearAcc);
        if (appAppearAcc != null) {
            appAppearAcc.setOnClickListener(v -> {
                startActivity(new Intent(AccountActivity.this, AppLanguage.class));
            });
        }
        RelativeLayout relativeHelpAcc = findViewById(R.id.RelativeHelpAcc);
        if (relativeHelpAcc != null) {
            relativeHelpAcc.setOnClickListener(v -> {
                startActivity(new Intent(AccountActivity.this, HelpSupportActivity.class));
            });
        }
        RelativeLayout linkedAccount = findViewById(R.id.linkedAccount);
        if (linkedAccount != null) {
            linkedAccount.setOnClickListener(v -> {
                startActivity(new Intent(AccountActivity.this, LinkedAccountsActivity.class));
            });
        }
        RelativeLayout relativeProfileAcc = findViewById(R.id.RelativeProfileAcc);
        if (relativeProfileAcc != null) {
            relativeProfileAcc.setOnClickListener(v -> {
                startActivity(new Intent(AccountActivity.this, LinkedAccountsActivity.class));
            });
        }
        RelativeLayout relativeMyPet = findViewById(R.id.RelativeMyPet);
        if (relativeMyPet != null) {
            relativeMyPet.setOnClickListener(v -> {
                startActivity(new Intent(AccountActivity.this, PreferencesListActivity.class));
            });
        }



    }
}



