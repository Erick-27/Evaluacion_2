package com.example.evaluacion_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Datos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("GG16-I04-001");
        }
    }
}
