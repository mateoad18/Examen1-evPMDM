package com.example.examenmateoalvarezduque;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        Button botonC;
        Button botonS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonC=findViewById(R.id.buttonC);
        botonS=findViewById(R.id.buttonS);

    }
    public void iniciar(View v){
        Intent i = new Intent();

    }
    public void salir(View v){
        finish();
    }
}