package com.example.animalclassifierv3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

  private final int CAMERA_REQ_CODE = 1;
  private final int GALLERY_REQ_CODE = 2;
  Button btn,camerabtn,gallerybtn,encyclobtn,aboutbtn, game1btn, game2btn;
  ImageView imgview;
  TextView head, header_1, header_2, header_3, para_1, para_2, para_3, langText;
  RadioGroup lang;
  TextToSpeech ts;
  int language = 0;
//  TextView temp;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    FirebaseApp.initializeApp(this);
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");

    myRef.setValue("Hello, World!");

    myRef.addValueEventListener(new ValueEventListener() {
      @Override
      public void onDataChange(DataSnapshot dataSnapshot) {
        // This method is called once with the initial value and again
        // whenever data at this location is updated.
        String value = dataSnapshot.getValue(String.class);
        Log.d("DBDB", "Value is: " + value);
      }

      @Override
      public void onCancelled(DatabaseError error) {
        // Failed to read value
        Log.w("RRRR", "Failed to read value.", error.toException());
      }
    });

    final MediaPlayer click = MediaPlayer.create(MainActivity.this,R.raw.click_1);
    final Typeface tf = Typeface.createFromAsset(this.getAssets(),
            "font/kalpurush.ttf");
    final Typeface tf2 = Typeface.createFromAsset(this.getAssets(),
            "font/roboto_condensed_regular.ttf");

    // Write a message to the database
//    FirebaseDatabase database = FirebaseDatabase.getInstance(FirebaseApp.getInstance("https://animalclassifierv3-default-rtdb.asia-southeast1.firebasedatabase.app/"));
//    DatabaseReference myRef = database.getReference("message");
//
//    myRef.setValue("Hello, World!");

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

    head = findViewById(R.id.head);
    langText = findViewById(R.id.lang);
    header_1 = findViewById(R.id.header1);
    header_2 = findViewById(R.id.header2);
    header_3 = findViewById(R.id.header3);
    para_1 = findViewById(R.id.para1);
    para_2 = findViewById(R.id.para2);
    para_3 = findViewById(R.id.para3);
    head.setTypeface(tf2);
    langText.setTypeface(tf2);
    header_1.setTypeface(tf2);
    header_2.setTypeface(tf2);
    header_3.setTypeface(tf2);
    para_1.setTypeface(tf2);
    para_2.setTypeface(tf2);
    para_3.setTypeface(tf2);
    camerabtn = findViewById(R.id.camerabtn);
    gallerybtn = findViewById(R.id.gallerybtn);
    encyclobtn = findViewById(R.id.encyclobtn);
    aboutbtn = findViewById(R.id.aboutbtn);
    game1btn = findViewById(R.id.game1);
    game2btn = findViewById(R.id.game2);
    camerabtn.setTypeface(tf2);
    gallerybtn.setTypeface(tf2);
    aboutbtn.setTypeface(tf2);
    encyclobtn.setTypeface(tf2);
    game1btn.setTypeface(tf2);
    game2btn.setTypeface(tf2);

    lang = findViewById(R.id.langSet);
    lang.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
          case R.id.english:
            langText.setText(R.string.lang);
            header_1.setText(getString(R.string.main_header_1));
            header_2.setText(getString(R.string.main_header_2));
            header_3.setText(getString(R.string.main_header_3));
            para_1.setText(getString(R.string.main_capture));
            para_2.setText(getString(R.string.main_encyclo));
            para_3.setText(getString(R.string.main_online_feature));
            camerabtn.setTypeface(tf2);
            gallerybtn.setTypeface(tf2);
            aboutbtn.setTypeface(tf2);
            encyclobtn.setTypeface(tf2);
            game1btn.setTypeface(tf2);
            game2btn.setTypeface(tf2);
            camerabtn.setText(R.string.main_camerabtn);
            gallerybtn.setText(R.string.main_gallerybtn);
            encyclobtn.setText(R.string.main_encybtn);
            game1btn.setText(R.string.main_game1btn);
            game2btn.setText(R.string.main_game2btn);
            aboutbtn.setText(R.string.main_aboutbtn);
            language = 0;
            GlobalSettings.language = 0;
            break;
          case R.id.bangla:
            langText.setText(R.string.lang_bangla);
            header_1.setText(getString(R.string.main_header_1_bangla));
            header_2.setText(getString(R.string.main_header_2_bangla));
            header_3.setText(getString(R.string.main_header_3_bangla));
            para_1.setText(getString(R.string.main_capture_bangla));
            para_2.setText(getString(R.string.main_encyclo_bangla));
            para_3.setText(getString(R.string.main_online_feature_bangla));
            camerabtn.setTypeface(tf);
            gallerybtn.setTypeface(tf);
            aboutbtn.setTypeface(tf);
            encyclobtn.setTypeface(tf);
            game1btn.setTypeface(tf);
            game2btn.setTypeface(tf);
            camerabtn.setText(R.string.main_camerabtn_bangla);
            gallerybtn.setText(R.string.main_gallerybtn_bangla);
            encyclobtn.setText(R.string.main_encybtn_bangla);
            aboutbtn.setText(R.string.main_aboutbtn_bangla);
            game1btn.setText(R.string.main_game1btn_bangla);
            game2btn.setText(R.string.main_game2btn_bangla);
            aboutbtn.setText(R.string.main_aboutbtn_bangla);
            language = 1;
            GlobalSettings.language = 1;
            break;
          default:
            throw new IllegalStateException("Unexpected value: " + i);
        }
      }
    });

    //imgview = findViewById(R.id.imageView);


    camerabtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        click.start();
        Intent cam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cam, CAMERA_REQ_CODE);
      }
    });

    gallerybtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        click.start();
        Intent gallery = new Intent(Intent.ACTION_PICK);
        gallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(gallery, GALLERY_REQ_CODE);
      }
    });

    encyclobtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        click.start();
        Intent intent = new Intent(MainActivity.this, EncyclopediaActivity.class);
        startActivity(intent);
      }
    });

    game1btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        click.start();
        Intent intent = new Intent(MainActivity.this, GuessPhotoGameActivity.class);
        startActivity(intent);
      }
    });

    game2btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        click.start();
        Intent intent = new Intent(MainActivity.this, DetectAnimalGameActivity.class);
        startActivity(intent);
      }
    });

    aboutbtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        click.start();
        Intent intent = new Intent(MainActivity.this, AboutAppActivity.class);
        startActivity(intent);
      }
    });


  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
    super.onActivityResult(requestCode, resultCode, data);

    if(resultCode==RESULT_OK){
      if(requestCode==CAMERA_REQ_CODE){
        Bitmap img = (Bitmap) data.getExtras().get("data");
        //imgview.setImageBitmap(img);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        img.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        byte[] byteArray = stream.toByteArray();

        Intent toResult = new Intent(this, ResultActivity.class);
        toResult.putExtra("userInput", byteArray);
        startActivity(toResult);
      }
      else if(requestCode==GALLERY_REQ_CODE){
        //imgview.setImageURI(data.getData());
//        Uri uri = data.getData();
//        Intent toResult = new Intent(this, ResultActivity.class);
//        toResult.putExtra("userInput", uri.toString());
//        startActivity(toResult);
        final Uri uri = data.getData();
        try {
          Bitmap img = MediaStore.Images.Media.getBitmap(this.getContentResolver(), uri);
          int ht = img.getHeight();
          int wt = img.getWidth();
//          String ddf = String.valueOf(ht), fff = String.valueOf(wt);
//          temp.setText(ddf+fff);
          Bitmap resizedImg = img;
          if(ht*wt > 876544 && wt>=ht) {
            int newHt = (int) ((ht*512)/wt);
            resizedImg = Bitmap.createScaledBitmap(img, 512,newHt,true);
//            if(newHt<856) resizedImg = Bitmap.createScaledBitmap(img, 512,newHt,true);
//            else {
//              newHt /= 2;
//              resizedImg = Bitmap.createScaledBitmap(img, 512, newHt,true);
//            }

          }
          else if(ht*wt > 876544 && ht>wt) {
            int newWt = (int) ((wt*512)/ht);
            resizedImg = Bitmap.createScaledBitmap(img, newWt,512,true);
//            if(newWt<856) resizedImg = Bitmap.createScaledBitmap(img, newWt,512,true);
//            else {
//              newWt /= 2;
//              resizedImg = Bitmap.createScaledBitmap(img, newWt, 512,true);
//            }
            //temp.setText(ddf+" "+fff+" "+String.valueOf(newWt)+" "+String.valueOf(1024));
          }
          //temp.setText(ddf+fff+String.valueOf(newWt));
          //resizedImg = Bitmap.createScaledBitmap(img, 512, 512,true);
          ByteArrayOutputStream stream = new ByteArrayOutputStream();
          resizedImg.compress(Bitmap.CompressFormat.JPEG, 100, stream);
          byte[] byteArray = stream.toByteArray();

          Intent toResult = new Intent(this, ResultActivity.class);
          toResult.putExtra("userInput", byteArray);
          startActivity(toResult);
        } catch (IOException e) {
          e.printStackTrace();
        }

      }
    }
  }
}
