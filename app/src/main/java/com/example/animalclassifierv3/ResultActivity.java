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
import org.pytorch.torchvision.TensorImageUtils;
import org.pytorch.MemoryFormat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView alert,scifi,cst,desc;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle extras = getIntent().getExtras();
        byte[] byteArray = extras.getByteArray("userInput");

//        Intent intent = getIntent();
//        String img = intent.getStringExtra("userInput");
//        Uri file

        Bitmap bitmap = null;
        Module module = null;
        try {
            bitmap = BitmapFactory.decodeByteArray(byteArray,0,byteArray.length);
            //bitmap = BitmapFactory.decodeStream(getAssets().open("image.jpg"));
            module = LiteModuleLoader.load(assetFilePath(this, "model.pt"));
        } catch (IOException e) {
            Log.e("AnimalClassifier", "Error reading assets", e);
            finish();
        }

        // showing image on UI
        ImageView imageView = findViewById(R.id.image);
        imageView.setImageBitmap(bitmap);

        // preparing input tensor
        final Tensor inputTensor = TensorImageUtils.bitmapToFloat32Tensor(bitmap,
                TensorImageUtils.TORCHVISION_NORM_MEAN_RGB, TensorImageUtils.TORCHVISION_NORM_STD_RGB, MemoryFormat.CHANNELS_LAST);

        // running the model
        final Tensor outputTensor = module.forward(IValue.from(inputTensor)).toTensor();

        // getting tensor content as java array of floats
        final float[] scores = outputTensor.getDataAsFloatArray();

        // searching for the index with maximum score
        float maxScore = -Float.MAX_VALUE;
        int maxScoreIdx = -1, maxSecondScoreIdx = -1, maxThirdScoreIdx = -1, maxFourthScoreIdx = -1, maxFifthScoreIdx = -1;
        for (int i = 0; i < scores.length; i++) {
            if (i>=398) continue;
            if (scores[i] > maxScore) {
                maxScore = scores[i];
//                maxFifthScoreIdx = maxFourthScoreIdx;
//                maxFourthScoreIdx = maxThirdScoreIdx;
//                maxThirdScoreIdx = maxSecondScoreIdx;
//                maxSecondScoreIdx = maxScoreIdx;
                maxScoreIdx = i;
            }
        }

        String className = AnimalClasses.ANIMAL_CLASSES[maxScoreIdx];
        String mm = Float.toString(maxScoreIdx);
        //String[] details = AnimalDetails.DETAILS[maxScoreIdx];
        String[] details = AnimalDetails.Dummy;
        for(int i=0; i<AnimalDetails.DETAILS.length; i++){
            if(AnimalDetails.DETAILS[i][0] == mm) {
                details = AnimalDetails.DETAILS[maxScoreIdx];
            }
        }

        // showing className on UI
        TextView textView = findViewById(R.id.text);
        textView.setText(className);
        final String cd = className;


        // showing details on UI
        alert = findViewById(R.id.alert);
        scifi = findViewById(R.id.scidet);
        cst = findViewById(R.id.cstdet);
        desc = findViewById(R.id.descdet);

        btn = findViewById(R.id.morebtn);

        if(details[2] == "False") {
            alert.setVisibility(View.GONE);
        }
        else {
            alert.setText(details[2]);
        }
        scifi.setText(details[3]);
        cst.setText(details[4]);
        desc.setText(details[5]);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivity.this, WebViewActivity.class);
                intent.putExtra("searchItem", cd);
                startActivity(intent);
            }
        });

    }

    public static String assetFilePath(Context context, String assetName) throws IOException {
        File file = new File(context.getFilesDir(), assetName);
        if (file.exists() && file.length() > 0) {
            return file.getAbsolutePath();
        }

        try (InputStream is = context.getAssets().open(assetName)) {
            try (OutputStream os = new FileOutputStream(file)) {
                byte[] buffer = new byte[4 * 1024];
                int read;
                while ((read = is.read(buffer)) != -1) {
                    os.write(buffer, 0, read);
                }
                os.flush();
            }
            return file.getAbsolutePath();
        }
    }
}