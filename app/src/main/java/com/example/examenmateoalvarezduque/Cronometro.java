package com.example.examenmateoalvarezduque;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cronometro extends AppCompatActivity {
    int tiempo =0;
    TextView temp;
    Button play;
    Button record;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronometro);
        temp=findViewById(R.id.tvTiempo);
        play=findViewById(R.id.Play);
        record=findViewById(R.id.Record);
        temp.setText(tiempo);
    }
    public void play(View v) throws InterruptedException {
        int c=0;
     try {
         Thread.sleep(1000);
         c++;
         tiempo=c;
     } catch (InterruptedException e) {
         throw new RuntimeException(e);
     }

    }
}