package com.example.animalclassifierv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import com.example.animalclassifierv3.R;

public class Splash extends AppCompatActivity {

    MediaPlayer wcSnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Intent home = new Intent(Splash.this, MainActivity.class);
        wcSnd = MediaPlayer.create(Splash.this, R.raw.wc_1_fairy);
        wcSnd.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(home);
                finish();
            }
        },2200);
    }
}