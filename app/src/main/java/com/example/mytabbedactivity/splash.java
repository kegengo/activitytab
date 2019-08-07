package com.example.mytabbedactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Thread  splash = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(30000);

                    Intent  go = new Intent(splash.this,MainActivity.class);
                    startActivity(go);
                    finish();


                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        };
        splash.start();

    }
}
