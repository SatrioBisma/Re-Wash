package com.example.rewash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class editakun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editakun);
    }
    public void profil(View view) {
        Intent intent = new Intent(editakun.this,pengaturan.class);
        startActivity(intent);
    }
}