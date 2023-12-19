package com.example.rewash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pengaturan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturan);
    }


    public void edit(View view) {
            Intent intent = new Intent(pengaturan.this,editakun.class);
            startActivity(intent);
        }

    public void berandapage(View view) {
        Intent intent = new Intent(pengaturan.this,beranda.class);
        startActivity(intent);
    }

    public void mitrapage(View view) {
        Intent intent = new Intent(pengaturan.this,mitra.class);
        startActivity(intent);
    }

    public void messege(View view) {
        Intent intent = new Intent(pengaturan.this,messege.class);
        startActivity(intent);
    }
}
