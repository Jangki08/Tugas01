package com.example.tugas01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      final Button pindahHal1 = findViewById(R.id.hal1);
      final Button pindahHal2 = findViewById(R.id.hal2);

      pindahHal1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(MainActivity.this, HitungBeratBadan.class);
              startActivity(i);
          }
      });

      pindahHal2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(MainActivity.this, KonversiSuhu.class);
              startActivity(i);
          }
      });

    }
}