package com.example.animalclassifierv3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

  private final int CAMERA_REQ_CODE = 1;
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
    }
  }
}
