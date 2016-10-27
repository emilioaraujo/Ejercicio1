package com.emi.ejercicio1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnGoToSecondActivityOnClick(View view) {
        Intent i = new Intent(getApplicationContext(), OtherActivity.class);
        startActivity(i);
    }
}
