package com.tinkersstudio.polyhike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Splash extends AppCompatActivity {
    //5 secs
    public static int TIME_OUT = 5000;
    protected ImageButton facebook, google;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        facebook = (ImageButton) findViewById(R.id.facebook);
        google = (ImageButton) findViewById(R.id.google);
        initButton();
    }


    public void initButton()
    {
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // After 5 seconds redirect to another intent
                Intent i=new Intent(getBaseContext(),MainActivity.class);
                startActivity(i);
            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // After 5 seconds redirect to another intent
                Intent i=new Intent(getBaseContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}
