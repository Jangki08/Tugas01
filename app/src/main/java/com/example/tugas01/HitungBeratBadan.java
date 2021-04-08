package com.example.tugas01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class HitungBeratBadan extends AppCompatActivity {
    Spinner spinner;
    EditText edbb, edtinggi;
    TextView  edbmi, edket;
    Button btnhitung;
    Double vbb, vtinggi, vbmi;
    String vket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_berat_badan);

        spinner = (Spinner)findViewById(R.id.spin);
        edbb = (EditText)findViewById(R.id.cberat);
        edtinggi = (EditText)findViewById(R.id.ctinggi);
        edbmi = (TextView) findViewById(R.id.chasil);
        edket = (TextView) findViewById(R.id.cket);
        btnhitung = (Button)findViewById(R.id.btnHitung);


        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pilihan = spinner.getSelectedItem().toString();
                System.out.println(pilihan);

                vbb = Double.parseDouble(edbb.getText().toString());
                vtinggi = Double.parseDouble(edtinggi.getText().toString());

                vbmi = vbb / ((vtinggi/100)*(vtinggi/100));

                if (vbmi < 18.5){
                    vket = "kekurangan berat badan";
                }
                else if (vbmi >=18.5 && vbmi <24.9){
                    vket = "Normal (ideal)";
                }
                else if (vbmi >=25.0 && vbmi <29.9){
                    vket = "Kelebihan berat badan";
                }
                else{
                    vket = "Kegemukan (Obesitas)";
                }

                DecimalFormat format = new DecimalFormat("#.##");
                edbmi.setText("" + format.format(vbmi));
                edket.setText("" + vket);
            }
        });

    }
}