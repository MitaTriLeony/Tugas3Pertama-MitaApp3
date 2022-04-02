package com.example.mitaapp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void clickAirport(View view) {
        Intent i = new Intent(this, Air.class);
        startActivity(i);
    }

    public void clickmasjid(View view) {
        Intent i = new Intent(this, masjid.class);
        startActivity(i);
    }

    public void clickpolice(View view) {
        Intent i = new Intent(this, polici.class);
        startActivity(i);
    }

    public void clickRs(View view) {
        Intent i = new Intent(this, Rs.class);
        startActivity(i);
    }
}
