package com.example.rewash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mitra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mitra);
    }

    public void berandapage(View view) {
        Intent intent = new Intent(mitra.this,beranda.class);
        startActivity(intent);
    }

    public void daftarusaha(View view) {
        Intent intent = new Intent(mitra.this,daftarusaha.class);
        startActivity(intent);
    }

    public void profil(View view) {
        Intent intent = new Intent(mitra.this,pengaturan.class);
        startActivity(intent);
    }

    public void messege(View view) {
        Intent intent = new Intent(mitra.this,messege.class);
        startActivity(intent);
    }
}