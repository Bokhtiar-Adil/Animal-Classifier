package com.example.animalclassifierv3;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.Random;

public class KidsPictureGameActivity extends AppCompatActivity implements View.OnClickListener{

    Button optionA, optionB, optionC, optionD, nextBtn, finishBtn;
    Button optionBtns[] = new Button[4];
    TextView heading, question, timerText, resMsg, resScore, resCorrect, rndfinMsg;
    ImageView imgView;
    int language, time, rtOpInd, ind, score, roundCnt;
    boolean flag;
    int[] questionsLbl, questionsPhotos, wrongs;
    ConstraintLayout optionsView;
    LinearLayout resultView;
    CountDownTimer roundTimer;

    @Override
    public void onBackPressed() {
        roundTimer.cancel();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_picture_game);

        Intent intent = getIntent();
        language = intent.getIntExtra("language", 0);

        optionsView = findViewById(R.id.optionsView);
        resultView = findViewById(R.id.resultView);

        //optionBtns = new Button[4];
        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);
        optionBtns[0] = findViewById(R.id.optionA);
        optionBtns[1] = findViewById(R.id.optionB);
        optionBtns[2] = findViewById(R.id.optionC);
        optionBtns[3] = findViewById(R.id.optionD);
        nextBtn = findViewById(R.id.nextbtn);
        finishBtn = findViewById(R.id.finishbtn);

        for(int i = 0; i < optionBtns.length; i++) optionBtns[i].setOnClickListener(this);
        nextBtn.setOnClickListener(this);
        finishBtn.setOnClickListener(this);

        heading = findViewById(R.id.heading);
        timerText = findViewById(R.id.timertext);
        question = findViewById(R.id.question);
        imgView = findViewById(R.id.img);
        resMsg = findViewById(R.id.resMsg);
        resScore = findViewById(R.id.currScore);
        resCorrect = findViewById(R.id.correct);
        rndfinMsg = findViewById(R.id.rndFinMsg);

        final Typeface tf = Typeface.createFromAsset(this.getAssets(),
                "font/kalpurush.ttf");
        optionBtns[0].setTypeface(tf);
        optionBtns[1].setTypeface(tf);
        optionBtns[2].setTypeface(tf);
        optionBtns[3].setTypeface(tf);
        heading.setTypeface(tf);
        timerText.setTypeface(tf);
        question.setTypeface(tf);
        resMsg.setTypeface(tf);
        resScore.setTypeface(tf);
        resCorrect.setTypeface(tf);
        rndfinMsg.setTypeface(tf);

        if(language==0) question.setText(R.string.kids_pic_quiz_question_1);
        else question.setText(R.string.kids_pic_quiz_question_1_bangla);

        roundTimer = new CountDownTimer(30000, 1000) {
            public void onTick(long millisUntilFinished) {
                if(time<10) timerText.setTextColor(getResources().getColor(R.color.red_1));
                else timerText.setTextColor(getResources().getColor(R.color.lime));
                timerText.setText(checkDigit(time));
                time--;
            }
            public void onFinish() {
                optionsView.setVisibility(View.GONE);
                resultView.setVisibility(View.GONE);
                optionsView.setVisibility(View.GONE);
                resultView.setVisibility(View.VISIBLE);
                resMsg.setTextColor(getResources().getColor(R.color.red_1));
                if(language==0) {
                    resMsg.setText("Times Up!!!");
                    resCorrect.setText("Correct Answer: "+optionBtns[rtOpInd].getText());
                    resScore.setText("Current Score: "+String.valueOf(score)+" / "+"10");
                }
                else {
                    if(!flag) {
                        resMsg.setText("সময় শেষ!!!");
                        resCorrect.setText("সঠিক উত্তর "+optionBtns[rtOpInd].getText());
                        resScore.setText("বর্তমান স্কোরঃ "+String.valueOf(score)+" / "+"10");
                    }
                }
            }
        };

        roundCnt = 0;
        score = 0;
        String lbl;
        questionsLbl = new int[10];
        wrongs = new int[3];
        rounds();

    }

    public String checkDigit(int number) {
        return number <= 9 ? "0" + number : String.valueOf(number);
    }


    public void rounds() {
        roundCnt++;
        if(language==0) heading.setText("Guess the animal: round "+String.valueOf(roundCnt)+" of 10");
        else heading.setText("প্রানীটি কি?: রাউন্ড "+String.valueOf(roundCnt)+" / 10");
        int curr = new Random().nextInt(AnimalDetails.PHOTOS.length);
        int rndmImgInd = new Random().nextInt(AnimalDetails.PHOTOS[curr].length);
        Picasso.get().load(AnimalDetails.PHOTOS[curr][rndmImgInd]).into(imgView);
        wrongs[0] = -1; wrongs[1] = -1; wrongs[2] = -1;
        Log.d("LBL", String.valueOf(curr));
        rtOpInd = new Random().nextInt(4);
        ind = Integer.parseInt(AnimalDetails.PHOTOS[curr][0]);
        for(int j=0; j<3; j++) {
            int tmp = new Random().nextInt(398);
            while(true){
                if(tmp == ind || tmp == wrongs[0] || tmp == wrongs[1] || tmp == wrongs[2])
                    tmp = new Random().nextInt(398);
                else break;
            }
            wrongs[j] = tmp;
        }
        if(language==0) {
            optionBtns[rtOpInd].setText(AnimalClasses.ANIMAL_CLASSES[ind]);
            for(int j=0, k=0; j<4; j++) {
                if(j==rtOpInd) continue;
                optionBtns[j].setText(AnimalClasses.ANIMAL_CLASSES[wrongs[k]]);
                k++;
            }
        }
        else {
            optionBtns[rtOpInd].setText(AnimalClasses.ANIMAL_CLASSES_BANGLA[ind]);
            for(int j=0, k=0; j<4; j++) {
                if(j==rtOpInd) continue;
                optionBtns[j].setText(AnimalClasses.ANIMAL_CLASSES_BANGLA[wrongs[k]]);
                k++;
            }
        }
        time = 30;
        roundTimer.start();
    }

    public void wrongAnswer(){
        roundTimer.cancel();
        optionsView.setVisibility(View.GONE);
        resultView.setVisibility(View.VISIBLE);
        if(roundCnt==10) roundEnd();
        resMsg.setTextColor(getResources().getColor(R.color.red_1));
        if(language==0) {
            resMsg.setText(R.string.quiz_wrong_answer);
            resCorrect.setText("Correct Answer: "+optionBtns[rtOpInd].getText());
            resScore.setText("Current Score: "+String.valueOf(score)+" / "+"10");
        }
        else {
            resMsg.setText(R.string.quiz_wrong_answer_bangla);
            resCorrect.setText("সঠিক উত্তরঃ "+optionBtns[rtOpInd].getText());
            resScore.setText("বর্তমান স্কোরঃ "+String.valueOf(score)+" / "+"10");
        }
    }

    public void roundEnd(){
        if(language==0) heading.setText("Gusess the animal: all rounds finished");
        else heading.setText("প্রাণীটি কি? সকল রাউন্ড শেষ");
        nextBtn.setVisibility(View.GONE);
        rndfinMsg.setVisibility(View.VISIBLE);
        finishBtn.setVisibility(View.VISIBLE);
        Log.d("SCORE", String.valueOf(score));
        if(language==0) rndfinMsg.setText("Total Score: "+String.valueOf(score)+" / 10");
        else rndfinMsg.setText("সর্বমোট স্কোরঃ "+String.valueOf(score)+" / 10");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.optionA:
                if(rtOpInd==0) {
                    roundTimer.cancel();
                    optionsView.setVisibility(View.GONE);
                    resultView.setVisibility(View.VISIBLE);
                    if(roundCnt==10) roundEnd();
                    score++;
                    resMsg.setTextColor(getResources().getColor(R.color.lime));
                    if(language==0) {
                        resMsg.setText(R.string.quiz_correct_answer);
                        resCorrect.setText("Correct Answer: "+optionA.getText());
                        resScore.setText("Current Score: "+String.valueOf(score)+" / "+"10");
                    }
                    else {
                        resMsg.setText(R.string.quiz_correct_answer_bangla);
                        resCorrect.setText("সঠিক উত্তরঃ "+optionA.getText());
                        resScore.setText("বর্তমান স্কোরঃ "+String.valueOf(score)+" / "+"10");
                    }
                }
                else wrongAnswer();
                break;

            case R.id.optionB:
                if(rtOpInd==1) {
                    roundTimer.cancel();
                    optionsView.setVisibility(View.GONE);
                    resultView.setVisibility(View.VISIBLE);
                    score++;
                    if(roundCnt==10) roundEnd();
                    resMsg.setTextColor(getResources().getColor(R.color.lime));
                    if(language==0) {
                        resMsg.setText(R.string.quiz_correct_answer);
                        resCorrect.setText("Correct Answer: "+optionB.getText());
                        resScore.setText("Current Score: "+String.valueOf(score)+" / "+"10");
                    }
                    else {
                        resMsg.setText(R.string.quiz_correct_answer_bangla);
                        resCorrect.setText("সঠিক উত্তরঃ "+optionB.getText());
                        resScore.setText("বর্তমান স্কোরঃ "+String.valueOf(score)+" / "+"10");
                    }
                }
                else wrongAnswer();
                break;

            case R.id.optionC:
                if(rtOpInd==2) {
                    roundTimer.cancel();
                    optionsView.setVisibility(View.GONE);
                    resultView.setVisibility(View.VISIBLE);
                    score++;
                    if(roundCnt==10) roundEnd();
                    resMsg.setTextColor(getResources().getColor(R.color.lime));
                    if(language==0) {
                        resMsg.setText(R.string.quiz_correct_answer);
                        resCorrect.setText("Correct Answer: "+optionC.getText());
                        resScore.setText("Current Score: "+String.valueOf(score)+" / "+"10");
                    }
                    else {
                        resMsg.setText(R.string.quiz_correct_answer_bangla);
                        resCorrect.setText("সঠিক উত্তরঃ "+optionC.getText());
                        resScore.setText("বর্তমান স্কোরঃ "+String.valueOf(score)+" / "+"10");
                    }
                }
                else wrongAnswer();
                break;

            case R.id.optionD:
                if(rtOpInd==3) {
                    roundTimer.cancel();
                    optionsView.setVisibility(View.GONE);
                    resultView.setVisibility(View.VISIBLE);
                    score++;
                    if(roundCnt==10) roundEnd();
                    resMsg.setTextColor(getResources().getColor(R.color.lime));
                    if(language==0) {
                        resMsg.setText(R.string.quiz_correct_answer);
                        resCorrect.setText("Correct Answer: "+optionD.getText());
                        resScore.setText("Current Score: "+String.valueOf(score)+" / "+"10");
                    }
                    else {
                        resMsg.setText(R.string.quiz_correct_answer_bangla);
                        resCorrect.setText("সঠিক উত্তরঃ "+optionD.getText());
                        resScore.setText("বর্তমান স্কোরঃ "+String.valueOf(score)+" / "+"10");
                    }
                }
                else wrongAnswer();
                break;

            case R.id.nextbtn:
                resultView.setVisibility(View.GONE);
                optionsView.setVisibility(View.VISIBLE);
                if(roundCnt<10) rounds();
                break;

            case R.id.finishbtn:
                finish();

        }
    }

}