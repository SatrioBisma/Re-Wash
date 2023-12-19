package com.example.rewash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class welcomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);
    }

    public void daftar(View view) {
        Intent intent = new Intent(welcomepage.this,daftar.class);
        startActivity(intent);
    }

    public void masuk(View view) {
        Intent intent = new Intent(welcomepage.this,Login.class);
        startActivity(intent);
    }
}