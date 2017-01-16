package com.tinkersstudio.polyhike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MapActivity extends AppCompatActivity {

    //5 secs
    public static int TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        /****** Create Thread that will sleep for 5 seconds *************/
        Thread background = new Thread() {
            public void run() {

                try {
                    // Thread will sleep for a duration
                    sleep(TIME_OUT);

                    // After 5 seconds redirect to another intent
                    Intent i=new Intent(getBaseContext(),EndTrail.class);
                    startActivity(i);

                    //Remove activity
                    finish();

                } catch (Exception e) {

                }
            }
        };

        // start thread
        background.start();
    }
}
