package com.example.animalclassifierv3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    imgview = findViewById(R.id.imageView);
    camerabtn = findViewById(R.id.camerabtn);
    gallerybtn = findViewById(R.id.gallerybtn);
    encyclobtn = findViewById(R.id.encyclobtn);
    aboutbtn = findViewById(R.id.aboutbtn);
//    TextView temp = findViewById(R.id.temp);

//    btn = findViewById(R.id.result);
//    btn.setOnClickListener(new View.OnClickListener() {
//      @Override
//      public void onClick(View view) {
//        Intent res = new Intent(MainActivity.this, ResultActivity.class);
//        startActivity(res);
//      }
//    });


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
          if(ht*wt > 876544 && wt>ht) {
            int newHt = (int) ((ht*1024)/wt);
            if(newHt!=1024) resizedImg = Bitmap.createScaledBitmap(img, 1024,newHt,true);
            else resizedImg = Bitmap.createScaledBitmap(img, 512, 512,true);
          }
          else if(ht*wt > 876544 && ht>wt) {
            int newWt = (int) ((wt*1024)/ht);
            if(newWt!=1024) resizedImg = Bitmap.createScaledBitmap(img, newWt,1024,true);
            else resizedImg = Bitmap.createScaledBitmap(img, 512, 512,true);
          }
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
