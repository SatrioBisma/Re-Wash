package com.example.rewash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class beranda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
    }

    public void mitrapage(View view) {
        Intent intent = new Intent(beranda.this,mitra.class);
        startActivity(intent);
    }

    public void messege(View view) {
        Intent intent = new Intent(beranda.this,messege.class);
        startActivity(intent);
    }

    public void profil(View view) {
        Intent intent = new Intent(beranda.this,pengaturan.class);
        startActivity(intent);
    }
}