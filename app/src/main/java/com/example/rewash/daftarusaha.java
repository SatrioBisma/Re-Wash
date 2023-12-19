package com.example.rewash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class daftarusaha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarusaha);
    }

    public void daftar(View view) {
        Intent intent = new Intent(daftarusaha.this,mitra.class);
        startActivity(intent);
    }
}