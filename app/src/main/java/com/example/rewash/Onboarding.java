package com.example.rewash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Onboarding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
    }
    public void lanjut(View view) {
        Intent intent = new Intent(Onboarding.this,welcomepage.class);
        startActivity(intent);
    }
}