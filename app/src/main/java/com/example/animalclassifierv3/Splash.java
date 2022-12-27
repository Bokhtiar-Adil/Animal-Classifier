package com.example.animalclassifierv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.example.animalclassifierv3.R;

public class Splash extends AppCompatActivity {

    MediaPlayer wcSnd;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Intent home = new Intent(Splash.this, MainActivity.class);
        wcSnd = MediaPlayer.create(Splash.this, R.raw.wc_1_fairy);
        wcSnd.start();

        final Typeface tf = Typeface.createFromAsset(this.getAssets(),
                "font/roboto_condensed_bold.ttf");
        text = findViewById(R.id.name);
        text.setTypeface(tf);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(home);
                finish();
            }
        },2200);
    }
}