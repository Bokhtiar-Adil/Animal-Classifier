package com.example.animalclassifierv3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.pytorch.IValue;
import org.pytorch.LiteModuleLoader;
import org.pytorch.Module;
import org.pytorch.Tensor;
import com.example.animalclassifierv3.R;
import org.pytorch.torchvision.TensorImageUtils;
import org.pytorch.MemoryFormat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animalclassifierv3.ImageNetClasses;

public class MainActivity extends AppCompatActivity {

  Button btn;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btn = findViewById(R.id.result);
    btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent res = new Intent(MainActivity.this, ResultActivity.class);
        startActivity(res);
      }
    });
  }
}
