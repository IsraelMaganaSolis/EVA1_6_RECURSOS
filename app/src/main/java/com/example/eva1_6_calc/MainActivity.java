package com.example.eva1_6_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textVwDatos;
    ImageView imgVwLeon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgVwLeon = findViewById(R.id.imgVwLeon);
        imgVwLeon.setImageResource(R.drawable.imagen);
        textVwDatos = findViewById(R.id.textVwDatos);
        textVwDatos.setText(R.string.mis_datos);
        
    }
}