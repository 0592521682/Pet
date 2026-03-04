package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cath);


        LinearLayout homeChat = findViewById(R.id.HomeChat);
        if (homeChat != null) {
            homeChat.setOnClickListener(v -> {
                startActivity(new Intent(ChatActivity.this, MainActivity.class));
            });
        }


        TextView btnCallsTab = findViewById(R.id.tabCallsHeader);
        if (btnCallsTab != null) {
            btnCallsTab.setOnClickListener(v -> {
                startActivity(new Intent(ChatActivity.this, CallsActivity.class));
            });
        }


        setupChatItemClick(R.id.layoutChat1);
        setupChatItemClick(R.id.layoutChat2);
    }




    private void setupChatItemClick(int viewId) {
        RelativeLayout chatItem = findViewById(viewId);
        if (chatItem != null) {
            chatItem.setOnClickListener(v -> {

                Intent intent = new Intent(ChatActivity.this, ChatRoomActivity.class);
                startActivity(intent);
            });
        }
    }
}