package com.example.autobiography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForthPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth_page);
    }
    public void thirdPage(View view){
        Intent intent = new Intent(this, ThirdPage.class);
        startActivity(intent);
    }
    public void fifthPage(View view){
        Intent intent = new Intent(this, FifthPage.class);
        startActivity(intent);
    }
}