package com.example.kalkulatorbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lingkaran extends AppCompatActivity {

    EditText jarijari;
    Button tombolkeliling, tombolluas;
    TextView hasilkeliling, hasilluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        jarijari =(EditText) findViewById(R.id.jarijari_klm);
        tombolkeliling =(Button) findViewById(R.id.kelilingbtn);
        tombolluas =(Button) findViewById(R.id.luasbtn);
        hasilkeliling =(TextView) findViewById(R.id.kellingkaran);
        hasilluas =(TextView) findViewById(R.id.luaslingkaran);


        tombolkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, hasil;
                bil1=Double.valueOf(jarijari.getText().toString().trim());
                hasil=2*3.14*bil1;
                String hasil1 = String.valueOf(hasil);
                hasilkeliling.setText(hasil1);
            }
        });

        tombolluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, hasil;
                bil1=Double.valueOf(jarijari.getText().toString().trim());
                hasil=3.14*bil1*bil1;
                String hasil1 = String.valueOf(hasil);
                hasilluas.setText(hasil1);
            }
        });
    }
}