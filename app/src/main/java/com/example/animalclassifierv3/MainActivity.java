package com.example.animalclassifierv3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

  private final int CAMERA_REQ_CODE = 1;
  private final int GALLERY_REQ_CODE = 2;
  Button btn,camerabtn,gallerybtn,encyclobtn,aboutbtn;
  ImageView imgview;
  TextView header_1, header_2, header_3, para_1, para_2, para_3;
  RadioGroup lang;
  int language = 0;
//  TextView temp;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final Typeface tf = Typeface.createFromAsset(this.getAssets(),
            "font/kalpurush.ttf");
    final Typeface tf2 = Typeface.DEFAULT;

    // Write a message to the database
//    FirebaseDatabase database = FirebaseDatabase.getInstance(FirebaseApp.getInstance("https://animalclassifierv3-default-rtdb.asia-southeast1.firebasedatabase.app/"));
//    DatabaseReference myRef = database.getReference("message");
//
//    myRef.setValue("Hello, World!");

    header_1 = findViewById(R.id.header1);
    header_2 = findViewById(R.id.header2);
    header_3 = findViewById(R.id.header3);
    para_1 = findViewById(R.id.para1);
    para_2 = findViewById(R.id.para2);
    para_3 = findViewById(R.id.para3);
    header_1.setTypeface(tf);
    header_2.setTypeface(tf);
    header_3.setTypeface(tf);
    para_1.setTypeface(tf);
    para_2.setTypeface(tf);
    para_3.setTypeface(tf);
    camerabtn = findViewById(R.id.camerabtn);
    gallerybtn = findViewById(R.id.gallerybtn);
    encyclobtn = findViewById(R.id.encyclobtn);
    aboutbtn = findViewById(R.id.aboutbtn);


    lang = findViewById(R.id.langSet);
    lang.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
          case R.id.english:
            header_1.setText(getString(R.string.main_header_1));
            header_2.setText(getString(R.string.main_header_2));
            header_3.setText(getString(R.string.main_header_3));
            para_1.setText(getString(R.string.main_capture));
            para_2.setText(getString(R.string.main_encyclo));
            para_3.setText(getString(R.string.main_online_feature));
            camerabtn.setTypeface(Typeface.DEFAULT);
            gallerybtn.setTypeface(Typeface.DEFAULT);
            aboutbtn.setTypeface(Typeface.DEFAULT);
            encyclobtn.setTypeface(Typeface.DEFAULT);
            camerabtn.setText(R.string.main_camerabtn);
            gallerybtn.setText(R.string.main_gallerybtn);
            encyclobtn.setText(R.string.main_encybtn);
            aboutbtn.setText(R.string.main_aboutbtn);
            language = 0;
            break;
          case R.id.bangla:
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
            camerabtn.setText(R.string.main_camerabtn_bangla);
            gallerybtn.setText(R.string.main_gallerybtn_bangla);
            encyclobtn.setText(R.string.main_encybtn_bangla);
            aboutbtn.setText(R.string.main_aboutbtn_bangla);
            language = 1;
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
        Intent cam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cam, CAMERA_REQ_CODE);
      }
    });

    gallerybtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent gallery = new Intent(Intent.ACTION_PICK);
        gallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(gallery, GALLERY_REQ_CODE);
      }
    });

    encyclobtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, EncyclopediaActivity.class);
        intent.putExtra("language", language);
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
        toResult.putExtra("language", language);
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
          toResult.putExtra("language", language);
          startActivity(toResult);
        } catch (IOException e) {
          e.printStackTrace();
        }

      }
    }
  }
}
