package com.example.animalclassifierv3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
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

public class DetectAnimalGameActivity extends AppCompatActivity implements View.OnClickListener{

    Button optionA, optionB, optionC, optionD, startBtn, nextBtn, finishBtn;
    Button optionBtns[] = new Button[4];
    TextView heading, question, questionAnimal, timerText, startHeader, startPara, resMsg, resScore, resCorrect, rndfinMsg, bye, gameName;
    ImageView imgA, imgB, imgC, imgD;
    ImageView[] imgs;
    int language, time, rtOpInd, ind, score, roundCnt;
    boolean flag;
    int[] wrongs;
    ConstraintLayout optionsView;
    LinearLayout startView,resultView;
    CountDownTimer roundTimer;
    CardView cardView;
    MediaPlayer click, correctSnd, wrongSnd, timeSnd, timesUpSnd;
    @Override
    public void onBackPressed() {
        roundTimer.cancel();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detect_animal_game);

        Intent intent = getIntent();
        if(GlobalSettings.getLanguage()==0) language=0;
        else language = 1;

        startView = findViewById(R.id.startView);
        optionsView = findViewById(R.id.optionsView);
        resultView = findViewById(R.id.resultView);

        //optionBtns = new Button[4];
        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);
        imgs[0] = findViewById(R.id.imgA);
        imgs[1] = findViewById(R.id.imgB);
        imgs[2] = findViewById(R.id.imgC);
        imgs[3] = findViewById(R.id.imgD);
        startBtn = findViewById(R.id.startbtn);
        nextBtn = findViewById(R.id.nextbtn);
        finishBtn = findViewById(R.id.finishbtn);

        for(int i = 0; i < optionBtns.length; i++) optionBtns[i].setOnClickListener(this);
        startBtn.setOnClickListener(this);
        nextBtn.setOnClickListener(this);
        finishBtn.setOnClickListener(this);

        startHeader = findViewById(R.id.startHeader);
        startPara = findViewById(R.id.startPara);
        heading = findViewById(R.id.heading);
        timerText = findViewById(R.id.timertext);
        question = findViewById(R.id.question);
        questionAnimal = findViewById(R.id.questionAnimal);

        resMsg = findViewById(R.id.resMsg);
        resScore = findViewById(R.id.currScore);
        resCorrect = findViewById(R.id.correct);
        rndfinMsg = findViewById(R.id.rndFinMsg);
        gameName = findViewById(R.id.gameName);
        bye = findViewById(R.id.bye);

        click = MediaPlayer.create(DetectAnimalGameActivity.this,R.raw.click_1);
        correctSnd = MediaPlayer.create(DetectAnimalGameActivity.this,R.raw.correct_1);
        wrongSnd = MediaPlayer.create(DetectAnimalGameActivity.this,R.raw.wrong_1);
        timeSnd = MediaPlayer.create(DetectAnimalGameActivity.this, R.raw.time_1);
        timesUpSnd = MediaPlayer.create(DetectAnimalGameActivity.this, R.raw.times_up_1);

        final Typeface tf = Typeface.createFromAsset(this.getAssets(),
                "font/kalpurush.ttf");
        optionA.setTypeface(tf);
        optionB.setTypeface(tf);
        optionC.setTypeface(tf);
        optionD.setTypeface(tf);
        startBtn.setTypeface(tf);
        nextBtn.setTypeface(tf);
        finishBtn.setTypeface(tf);
        startHeader.setTypeface(tf);
        startPara.setTypeface(tf);
        heading.setTypeface(tf);
        timerText.setTypeface(tf);
        question.setTypeface(tf);
        questionAnimal.setTypeface(tf);
        resMsg.setTypeface(tf);
        resScore.setTypeface(tf);
        resCorrect.setTypeface(tf);
        rndfinMsg.setTypeface(tf);
        gameName.setTypeface(tf);
        bye.setTypeface(tf);

        if(language==0) {
            startHeader.setText(R.string.game2_start_header);
            startPara.setText(R.string.game2_start_msg);
            startBtn.setText("Start");
            nextBtn.setText("Next");
            finishBtn.setText("Home");
        }
        else {
            startHeader.setText(R.string.game2_start_header_bangla);
            startPara.setText(R.string.game2_start_msg_bangla);
            startBtn.setText("শুরু");
            nextBtn.setText("পরবর্তী প্রশ্ন");
            finishBtn.setText("হোমপেজ");
        }

        if(language==0) question.setText(R.string.game2_question_1);
        else question.setText(R.string.game2_question_1_bangla);

        roundTimer = new CountDownTimer(15000, 1000) {
            public void onTick(long millisUntilFinished) {
                timeSnd.start();
                if(time<=5) timerText.setTextColor(getResources().getColor(R.color.red_1));
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
                timesUpSnd.start();
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

//        roundCnt = 0;
//        score = 0;
//        String lbl;
//        questionsLbl = new int[10];
//        wrongs = new int[3];
//        rounds();

    }

    public String checkDigit(int number) {
        return number <= 9 ? "0" + number : String.valueOf(number);
    }


    public void rounds() {
        roundCnt++;
        int curr = new Random().nextInt(AnimalDetails.PHOTOS.length);
        if(language==0) {
            heading.setText("Find the animal: round "+String.valueOf(roundCnt)+" of 10");
            int ind = Integer.parseInt(AnimalDetails.PHOTOS[curr][0]);
            questionAnimal.setText(AnimalClasses.ANIMAL_CLASSES[curr]);
        }
        else {
            heading.setText("প্রানীটির ছবি কোনটি?: রাউন্ড "+String.valueOf(roundCnt)+" / 10");
            int ind = Integer.parseInt(AnimalDetails.PHOTOS[curr][0]);
            questionAnimal.setText(AnimalClasses.ANIMAL_CLASSES_BANGLA[curr]);
        }
        int curr2 = new Random().nextInt(AnimalDetails.PHOTOS[curr].length);
        //Picasso.get().load(AnimalDetails.PHOTOS[curr][rndmImgInd]).into(imgView);
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
        time = 15;
        roundTimer.start();
    }

    public void wrongAnswer(){
        roundTimer.cancel();
        wrongSnd.start();
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

    public void gameFinished(){
        resultView.setVisibility(View.VISIBLE);
        optionsView.setVisibility(View.GONE);
        question.setVisibility(View.GONE);
        questionAnimal.setVisibility(View.GONE);
        resMsg.setVisibility(View.GONE);
        resCorrect.setVisibility(View.GONE);
        resScore.setVisibility(View.GONE);
        nextBtn.setVisibility(View.GONE);
        rndfinMsg.setVisibility(View.VISIBLE);
        finishBtn.setVisibility(View.VISIBLE);
        gameName.setVisibility(View.VISIBLE);
        bye.setVisibility(View.VISIBLE);
        Log.d("SCORE", String.valueOf(score));
        if(language==0) {
            gameName.setText(R.string.game1_start_header);
            bye.setText(R.string.game1_bye);
            rndfinMsg.setText("Total Score: "+String.valueOf(score)+" / 10");
        }
        else {
            gameName.setText(R.string.game1_start_header_bangla);
            bye.setText(R.string.game1_bye_bangla);
            rndfinMsg.setText("সর্বমোট স্কোরঃ "+String.valueOf(score)+" / 10");
        }
    }

    public void roundEnd(){
        if(language==0) heading.setText("Gusess the animal: all rounds finished");
        else heading.setText("প্রাণীটি কি? সকল রাউন্ড শেষ");
//        resMsg.setVisibility(View.GONE);
//        resCorrect.setVisibility(View.GONE);
//        resScore.setVisibility(View.GONE);
//        nextBtn.setVisibility(View.GONE);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.optionA:
                if(rtOpInd==0) {
                    roundTimer.cancel();
                    correctSnd.start();
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
                    correctSnd.start();
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
                    correctSnd.start();
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
                    correctSnd.start();
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
                click.start();
                resultView.setVisibility(View.GONE);
                optionsView.setVisibility(View.VISIBLE);
                if(roundCnt<10) rounds();
                else gameFinished();
                break;

            case R.id.startbtn:
                click.start();
                startView.setVisibility(View.GONE);
                optionsView.setVisibility(View.VISIBLE);
                heading.setVisibility(View.VISIBLE);
                cardView.setVisibility(View.VISIBLE);
                question.setVisibility(View.VISIBLE);
                questionAnimal.setVisibility(View.VISIBLE);
                roundCnt = 0;
                score = 0;
                wrongs = new int[3];
                rounds();
                break;

            case R.id.finishbtn:
                click.start();
                finish();
                break;
        }
    }

}