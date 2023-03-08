package com.andriod.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Hey, Ahmad.");
        getSupportActionBar().setSubtitle("Your Corona App");

        loadData();
    }

    private void loadData() {

    }

    public void btnClick(View view) {
        Toast.makeText(this, "Button Click Ahmad", Toast.LENGTH_SHORT).show();
        Log.e("Error", "Button Clicked Show in log AHmad");
    }
}