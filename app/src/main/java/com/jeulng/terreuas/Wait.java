package com.jeulng.terreuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wait extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.activity_wait);

    }

    public void Start(View view){
        Intent intent = new Intent(this, gg.class);
        startActivity(intent);
    }

    public void PP(View view){
        Intent intent = new Intent(this, PPpp.class);
        startActivity(intent);
    }
    public void Exit(View view){
        finish();
    }
}