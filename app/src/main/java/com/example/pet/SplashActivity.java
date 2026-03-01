package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // إظهار الرسالة فور فتح شاشة البداية
        // استخدام Handler للانتقال بعد 3 ثواني
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // الانتقال إلى شاشة الترحيب الأولى
                Intent intent = new Intent(SplashActivity.this, Wlcoum1Activity.class);
                startActivity(intent);
                // إنهاء هذه الصفحة
                finish();
            }
        }, 3000);
    }
}