package com.example.tugas01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class KonversiSuhu extends AppCompatActivity implements View.OnClickListener {

    Spinner spinner1, spinner2;
    EditText edinput;
    TextView edhasil;
    Button btnhitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi_suhu);

        spinner1 = (Spinner) findViewById(R.id.spin1);
        spinner2 = (Spinner) findViewById(R.id.spin2);
        edinput = (EditText) findViewById(R.id.ainput);
        edhasil = (TextView) findViewById(R.id.akonversi);
        btnhitung = (Button) findViewById(R.id.btnHitung);

        List<String>ListSuhu = new ArrayList<String>();
        ListSuhu.add("Fahrenheit");
        ListSuhu.add("Celcius");
        ListSuhu.add("Kelvin");

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,ListSuhu);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,ListSuhu);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        btnhitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnHitung:

                String pilih = spinner1.getSelectedItem().toString();
                System.out.println(pilih);
                String pilihan = spinner2.getSelectedItem().toString();
                System.out.println(pilihan);


                if (pilih.equals("Fahrenheit") && pilihan.equals("Celcius")) {
                    try {
                        double nilai = Double.parseDouble(String.valueOf(edinput.getText()));
                        double hasil = (nilai - 32) / 1.8;

                        DecimalFormat format = new DecimalFormat("#.##");
                        edhasil.setVisibility(View.VISIBLE);
                        edhasil.setText("" + String.valueOf(format.format(hasil)));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else if (pilih.equals("Fahrenheit") && pilihan.equals("Kelvin")) {
                    try {
                        double nilai = Double.parseDouble(String.valueOf(edinput.getText()));
                        double hasil = (nilai - 32) * 5 / 9 + 273.15;

                        DecimalFormat format = new DecimalFormat("#.##");
                        edhasil.setVisibility(View.VISIBLE);
                        edhasil.setText("" + String.valueOf(format.format(hasil)));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else if (pilih.equals("Celcius") && pilihan.equals("Kelvin")) {
                    try {
                        double nilai = Double.parseDouble(String.valueOf(edinput.getText()));
                        double hasil = nilai + 273.15;

                        DecimalFormat format = new DecimalFormat("#.##");
                        edhasil.setVisibility(View.VISIBLE);
                        edhasil.setText("" + String.valueOf(format.format(hasil)));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else if (pilih.equals("Celcius") && pilihan.equals("Fahrenheit")) {
                    try {
                        double nilai = Double.parseDouble(String.valueOf(edinput.getText()));
                        double hasil = (nilai * 1.8) + 32;

                        DecimalFormat format = new DecimalFormat("#.##");
                        edhasil.setVisibility(View.VISIBLE);
                        edhasil.setText("" + String.valueOf(format.format(hasil)));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else if (pilih.equals("Kelvin") && pilihan.equals("Fahrenheit")) {
                    try {
                        double nilai = Double.parseDouble(String.valueOf(edinput.getText()));
                        double hasil = (nilai - 273.15) * 9 / 5 + 32;

                        DecimalFormat format = new DecimalFormat("#.##");
                        edhasil.setVisibility(View.VISIBLE);
                        edhasil.setText("" + String.valueOf(format.format(hasil)));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else if (pilih.equals("Kelvin") && pilihan.equals("Celcius")) {
                    try {
                        double nilai = Double.parseDouble(String.valueOf(edinput.getText()));
                        double hasil = nilai - 273.15;

                        DecimalFormat format = new DecimalFormat("#.##");
                        edhasil.setVisibility(View.VISIBLE);
                        edhasil.setText("" + String.valueOf(format.format(hasil)));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

        }
    }
}