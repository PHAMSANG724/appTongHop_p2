package com.example.apptonghop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Navigation extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,firstFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Production:
                        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,firstFragment).commit();
                        return true;
                    case R.id.Plot:
                        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,secondFragment).commit();
                        return true;
                    case R.id.Character:
                        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,thirdFragment).commit();
                        return true;
                }
                return false;
            }
        });

    }
}