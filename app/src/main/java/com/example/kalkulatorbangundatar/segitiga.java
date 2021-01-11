package com.example.kalkulatorbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {

    EditText s1,s2,a,t;
    Button keliling_btn,luas_btn;
    TextView kelilinghasil,luashasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        s1=(EditText) findViewById(R.id.sisi1_klm);
        s2=(EditText) findViewById(R.id.sisi2_klm);
        a=(EditText) findViewById(R.id.alas_klm);
        t=(EditText) findViewById(R.id.tinggi_klm);
        keliling_btn=(Button) findViewById(R.id.kelilingbtn);
        luas_btn=(Button) findViewById(R.id.luasbtn);
        kelilinghasil=(TextView) findViewById(R.id.kelsegitiga);
        luashasil=(TextView) findViewById(R.id.luassegitiga);

        keliling_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2, bil3, hasil;
                bil1=Double.valueOf(s1.getText().toString().trim());
                bil2=Double.valueOf(s2.getText().toString().trim());
                bil3=Double.valueOf(a.getText().toString().trim());
                hasil=bil1+bil2+bil3;
                String hasil1 = String.valueOf(hasil);
                kelilinghasil.setText(hasil1);
            }
        });

        luas_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(a.getText().toString().trim());
                bil2=Double.valueOf(t.getText().toString().trim());
                hasil=(bil1/2) * bil2;
                String hasil1 = String.valueOf(hasil);
                luashasil.setText(hasil1);
            }
        });
    }
}