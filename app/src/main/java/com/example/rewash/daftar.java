package com.example.rewash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class daftar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
    }


    public void masuk(View view) {
        Intent intent = new Intent(daftar.this,Login.class);
        startActivity(intent);
    }

    public void welcome(View view) {
        Intent intent = new Intent(daftar.this,Login.class);
        startActivity(intent);
    }
}