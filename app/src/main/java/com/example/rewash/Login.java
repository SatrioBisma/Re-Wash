package com.example.rewash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void daftar(View view) {
        Intent intent = new Intent(Login.this,daftar.class);
        startActivity(intent);
    }

    public void berandapage(View view) {
        Intent intent = new Intent(Login.this,beranda.class);
        startActivity(intent);
    }
}