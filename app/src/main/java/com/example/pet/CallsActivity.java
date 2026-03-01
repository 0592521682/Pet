package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CallsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calls);

        LinearLayout homeCall = findViewById(R.id.HomeCalls);
        homeCall.setOnClickListener(v -> {
            startActivity(new Intent(CallsActivity.this, MainActivity.class));
        });

        // العودة لصفحة المحادثات عند الضغط على Chats
        TextView btnChatsTab = findViewById(R.id.tabChatsInCalls);
        if (btnChatsTab != null) {
            btnChatsTab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish(); // نغلق هذه الصفحة لنعود لصفحة الـ Chat
                }
            });
        }
    }
}