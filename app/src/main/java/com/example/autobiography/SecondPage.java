package com.example.autobiography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
    }
    public void firstPage(View view){
        Intent intent = new Intent(this, FirstPage.class);
        startActivity(intent);
    }
    public void thirdPage(View view){
        Intent intent = new Intent(this, ThirdPage.class);
        startActivity(intent);
    }

}