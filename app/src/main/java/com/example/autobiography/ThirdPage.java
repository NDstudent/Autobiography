package com.example.autobiography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
    }
    public void secondPage(View view){
        Intent intent = new Intent(this, SecondPage.class);
        startActivity(intent);
    }
    public void forthPage(View view){
        Intent intent = new Intent(this, ForthPage.class);
        startActivity(intent);
    }
}