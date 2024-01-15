package com.example.autobiography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FifthPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_page);
    }
    public void forthPage(View view){
        Intent intent = new Intent(this, ForthPage.class);
        startActivity(intent);
    }
    public void endPage(View view){
        Intent intent = new Intent(this, EndPage.class);
        startActivity(intent);
    }
}