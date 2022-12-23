package com.example.animalclassifierv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class EncyclopediaActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView text,name,alert,alert2,scifi,cst,desc;
    TextView scilbl,cstlbl,venomlbl,desclbl,header,more;
    Spinner spin;
    ArrayList<String> animals = new ArrayList<>();
    Button speak, speak2, speak3, speak4, speak5, photos;
    TextToSpeech ts;
    int language;
    String bnCst, animal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encyclopedia);

        Intent intent = getIntent();
        Log.d("LANGUAGE", String.valueOf(GlobalSettings.getLanguage()));
        if(GlobalSettings.getLanguage()==0) language=0;
        else language = 1;

        scilbl = findViewById(R.id.sciname);
        cstlbl = findViewById(R.id.cst);
        venomlbl = findViewById(R.id.alert);
        desclbl = findViewById(R.id.desc);
        header = findViewById(R.id.text);
        more = findViewById(R.id.more);
        speak = findViewById(R.id.speak);
        speak2 = findViewById(R.id.speak2);
        speak3 = findViewById(R.id.speak3);
        speak4 = findViewById(R.id.speak4);
        speak5 = findViewById(R.id.speak5);
        photos = findViewById(R.id.photos);

        ts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                // if No error is found then only it will run
                if(i!=TextToSpeech.ERROR){
                    // To Choose language of speech
                    if(language==0) ts.setLanguage(Locale.ENGLISH);
                    else ts.setLanguage(new Locale("bn_IN"));
                }
            }
        });
        if(language == 0) ts.setPitch(1.1f);
        else ts.setPitch(1.0f);

        final MediaPlayer click = MediaPlayer.create(EncyclopediaActivity.this,R.raw.click_1);

        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ts.speak(name.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });


        final Typeface tf = Typeface.createFromAsset(this.getAssets(),
                "font/kalpurush.ttf");

        header.setTypeface(tf);
        scilbl.setTypeface(tf);
        desclbl.setTypeface(tf);
        cstlbl.setTypeface(tf);
        venomlbl.setTypeface(tf);
        more.setTypeface(tf);

        if(language==0) {
            header.setText(R.string.ency_header);
            scilbl.setText(R.string.res_scifi);
            venomlbl.setText(R.string.ency_venom);
            desclbl.setText(R.string.res_desc);
            cstlbl.setText(R.string.res_cst);
            more.setText(R.string.res_more);
            //btn.setText(R.string.res_more_btn);
        }
        else {
            header.setText(R.string.ency_header_bangla);
            scilbl.setText(R.string.res_scifi_bangla);
            venomlbl.setText(R.string.ency_venom_bangla);
            desclbl.setText(R.string.res_desc_bangla);
            cstlbl.setText(R.string.res_cst_bangla);
            more.setText(R.string.res_more_bangla);
            //btn.setText(R.string.res_more_btn_bangla);
        }

        text = findViewById(R.id.text);
        spin = findViewById(R.id.spin);
        spin.setOnItemSelectedListener(this);
        name = findViewById(R.id.name);
        alert = findViewById(R.id.alertdet);
        alert2 = findViewById(R.id.alertdet2);
        scifi = findViewById(R.id.scidet);
        cst = findViewById(R.id.cstdet);
        desc = findViewById(R.id.descdet);

        text.setTypeface(tf);
        name.setTypeface(tf);
        alert.setTypeface(tf);
        alert2.setTypeface(tf);
        scifi.setTypeface(tf);
        cst.setTypeface(tf);
        desc.setTypeface(tf);

        speak2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ts.speak(scifi.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        speak3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ts.speak(cst.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        speak4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(alert.getVisibility() == View.VISIBLE) ts.speak(alert.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                else ts.speak(alert2.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        speak5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ts.speak(desc.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        int len = AnimalDetails.DETAILS.length;
        animals.add("");

        for(int i=0; i<len; i++){
            if(language==0) animals.add(AnimalDetails.DETAILS[i][1]);
            else {
                int bnClass = Integer.parseInt(AnimalDetails.DETAILS[i][0]);
                animals.add(AnimalClasses.ANIMAL_CLASSES_BANGLA[bnClass]);
            }
        }
        ArrayAdapter<String> spinAdp = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, animals);
        spin.setAdapter(spinAdp);

        animal = "";

        photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click.start();
                if(isInternetConnected()) {
                    Intent photoPage = new Intent(EncyclopediaActivity.this, PhotosPage.class);
                    photoPage.putExtra("animal", animal);
                    photoPage.putExtra("language", language);
                    startActivity(photoPage);
                }
                else {
                    if(language==0) Toast.makeText(getApplicationContext(), R.string.no_internet, Toast.LENGTH_LONG).show();
                    else Toast.makeText(getApplicationContext(), R.string.no_internet_bangla, Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(i==0) {
            animal = "";
            name.setText("");
            scifi.setText("");
            cst.setText("");
            desc.setText("");
            alert2.setVisibility(View.GONE);
            alert.setVisibility(View.VISIBLE);
            alert.setText("");
        }
        else if(language==0){
            String details[] = AnimalDetails.DETAILS[i-1];
            animal = details[1];
            name.setText(details[1]);
            scifi.setText(details[3]);
            cst.setText(details[4]);
            desc.setText(details[5]);
            if(details[2]=="False") {
                alert2.setVisibility(View.GONE);
                alert.setVisibility(View.VISIBLE);
                alert.setText("Not venomous");
            }
            else {
                alert2.setVisibility(View.VISIBLE);
                alert.setVisibility(View.GONE);
                alert2.setText(details[2]);
            }
        }
        else {
            String details[] = AnimalDetails.DETAILS[i-1];
            animal = details[1];
            int bnClass = Integer.parseInt(details[0]);
            Log.d("BANGLA", String.valueOf(bnClass));
            name.setText(AnimalClasses.ANIMAL_CLASSES_BANGLA[bnClass]);
            scifi.setText(details[3]);

            if(details[4].equalsIgnoreCase("Extinct")) bnCst = "বিলুপ্ত";
            else if(details[4].equalsIgnoreCase("Threatened")) bnCst = "বিলুপ্তপ্রায়";
            else if(details[4].equalsIgnoreCase("Vulnerable")) bnCst = "বিলুপ্তির পথে";
            else if(details[4].equalsIgnoreCase("Not threatened")) bnCst = "আশংকা নাই";
            else if(details[4].equalsIgnoreCase("Least concern")) bnCst = "শংকামুক্ত";
            Log.d("BANGLA", details[4]);
            Log.d("BANGLA", bnCst);
            cst.setText(bnCst);
            if(details.length == 8) desc.setText(details[7]);
            else desc.setText(R.string.data_not_added_sorry_bangla);
            if(details[2]=="False") {
                alert2.setVisibility(View.GONE);
                alert.setVisibility(View.VISIBLE);
                alert.setText(details[6]);
            }
            else {
                alert2.setVisibility(View.VISIBLE);
                alert.setVisibility(View.GONE);
                alert2.setText(details[6]);
            }

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onBackPressed() {
        ts.shutdown();
        finish();
    }

    public boolean isInternetConnected() {
        try {
            String command = "ping -c 1 google.com";
            return (Runtime.getRuntime().exec(command).waitFor() == 0);
        } catch (Exception e) {
            return false;
        }
    }

}