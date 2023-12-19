package com.example.rewash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class messege extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messege);
    }


    public void berandapage(View view) {
        Intent intent = new Intent(messege.this,beranda.class);
        startActivity(intent);
    }

    public void mitrapage(View view) {
        Intent intent = new Intent(messege.this,mitra.class);
        startActivity(intent);
    }

    public void profil(View view) {
        Intent intent = new Intent(messege.this,pengaturan.class);
        startActivity(intent);
    }
}