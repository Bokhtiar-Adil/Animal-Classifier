package com.example.animalclassifierv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class KidsPictureGameActivity extends AppCompatActivity {

    Button optionA, optionB, optionC, optionD;
    TextView heading, question, timerText;
    ImageView imgView;
    int language, time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_picture_game);

        Intent intent = getIntent();
        language = intent.getIntExtra("language", 0);

        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);
        heading = findViewById(R.id.heading);
        timerText = findViewById(R.id.timertext);
        question = findViewById(R.id.question);
        imgView = findViewById(R.id.img);

        if(language==0) question.setText(R.string.kids_pic_quiz_question_1);
        else question.setText(R.string.kids_pic_quiz_question_1_bangla);

        time = 30;

        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                if(time<10) timerText.setTextColor(getResources().getColor(R.color.red_1));
                else timerText.setTextColor(getResources().getColor(R.color.lime));
                timerText.setText(checkDigit(time));
                time--;
            }

            public void onFinish() {
                timerText.setText("try again");
            }

        }.start();

    }

    public String checkDigit(int number) {
        return number <= 9 ? "0" + number : String.valueOf(number);
    }
}