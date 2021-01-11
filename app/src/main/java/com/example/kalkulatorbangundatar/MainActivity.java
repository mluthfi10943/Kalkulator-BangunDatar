package com.example.kalkulatorbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button htpersegi,htsegitiga,htlingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        htpersegi=findViewById(R.id.htpersegi);
        htpersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this.getApplicationContext(), persegi.class);
                MainActivity.this.startActivity(intent);
            }
        });

        htsegitiga=findViewById(R.id.htsegitiga);
        htsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this.getApplicationContext(), segitiga.class);
                MainActivity.this.startActivity(intent);
            }
        });

        htlingkaran=findViewById(R.id.htlingkaran);
        htlingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this.getApplicationContext(), lingkaran.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}