package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class signUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button skip = findViewById(R.id.btnSubmitSignUp);
        if (skip != null) {
            skip.setOnClickListener(v -> {
                startActivity(new Intent(signUpActivity.this, MainActivity.class));
            });
        }
    }
}