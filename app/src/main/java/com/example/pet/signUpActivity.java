package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class signUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button signUp = findViewById(R.id.btnSubmitSignUp);
        if (signUp != null) {
            signUp.setOnClickListener(v -> {
                startActivity(new Intent(signUpActivity.this, step1Activity.class));
            });
        }
        TextView SignIn = findViewById(R.id.sginIn);
        if (SignIn != null) {
            SignIn.setOnClickListener(v -> {
                startActivity(new Intent(signUpActivity.this, signInActivity.class));
            });
        }

    }
}