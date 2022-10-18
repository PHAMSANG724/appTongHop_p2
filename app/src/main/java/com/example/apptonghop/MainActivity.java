package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout llProfile, llList, llImage, llMovie, llCollection, llSetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llProfile = findViewById(R.id.layoutProfile);
        llProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        llList = findViewById(R.id.layoutList);
        llList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });

        llImage = findViewById(R.id.layoutImage);
        llImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Coming in the next update(Image)", Toast.LENGTH_SHORT).show();
            }
        });

        llMovie = findViewById(R.id.layoutMovie);
        llMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Coming in the next update(Movie)", Toast.LENGTH_SHORT).show();
            }
        });

        llCollection = findViewById(R.id.layoutCollection);
        llCollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Coming in the next update(Collection)", Toast.LENGTH_SHORT).show();
            }
        });

        llSetting = findViewById(R.id.layoutSetting);
        llSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Coming in the next update(Setting)", Toast.LENGTH_SHORT).show();
            }
        });

    }
}