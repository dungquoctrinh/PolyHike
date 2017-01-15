package com.tinkersstudio.polyhike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    //5 secs
    public static int TIME_OUT = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);



    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}
