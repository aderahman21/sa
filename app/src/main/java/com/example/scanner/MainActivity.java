package com.example.scanner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivHistory,ivScan,ivCreate;
    private BottomNavigationView navigationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.navbottom);

        ivHistory = findViewById(R.id.ivHistory);

        ivScan = findViewById(R.id.ivScan);

        ivCreate  = findViewById(R.id.ivCreta);

        navigationView.setOnClickListener(V -> {
            switch (navigationView.getId()) {
                case R.id.ivHistory:
                    Intent history = new Intent(MainActivity.this, HistoryActivity.class);
                    startActivity(history);
                    finish();
                    break;
                case R.id.ivScan:
                    break;
                case R.id.ivCreta:
                    Intent create = new Intent(MainActivity.this, CreateActivity.class);
                    startActivity(create);
                    finish();
                    break;
            }
        });


    }


}