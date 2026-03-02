package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class getStartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        Button signUp = findViewById(R.id.btnSignUp);

        if (signUp != null) {
            signUp.setOnClickListener(v -> {
                startActivity(new Intent(getStartActivity.this,signUpActivity.class));
            });
        }
        Button sginIn = findViewById(R.id.btnSignIn);
        if (sginIn != null) {
            sginIn.setOnClickListener(v -> {
                startActivity(new Intent(getStartActivity.this,signInActivity.class));
            });
        }
    }
}