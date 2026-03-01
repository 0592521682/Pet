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

        // 1. زر الهوم في الأسفل - يفتح الرئيسية
        LinearLayout homeChat = findViewById(R.id.HomeChat);
        if (homeChat != null) {
            homeChat.setOnClickListener(v -> {
                startActivity(new Intent(ChatActivity.this, MainActivity.class));
            });
        }

        // 2. تبويب المكالمات - يفتح صفحة المكالمات
        TextView btnCallsTab = findViewById(R.id.tabCallsHeader);
        if (btnCallsTab != null) {
            btnCallsTab.setOnClickListener(v -> {
                startActivity(new Intent(ChatActivity.this, CallsActivity.class));
            });
        }


        // 3. برمجة المحادثات لتفتح غرفة الدردشة (تم تصحيح الـ IDs هنا)
        setupChatItemClick(R.id.layoutChat1); // المحادثة الأولى
        setupChatItemClick(R.id.layoutChat2); // المحادثة الثانية
    }

    /**
     * دالة مساعدة لضمان فتح غرفة المحادثة عند الضغط على أي عنصر في القائمة
     */
    private void setupChatItemClick(int viewId) {
        RelativeLayout chatItem = findViewById(viewId);
        if (chatItem != null) {
            chatItem.setOnClickListener(v -> {
                // الانتقال لصفحة غرفة المحادثة
                Intent intent = new Intent(ChatActivity.this, ChatRoomActivity.class);
                startActivity(intent);
            });
        }
    }
}