package com.example.animalclassifierv3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;

import java.util.ArrayList;

public class PhotosPage extends AppCompatActivity {

    ArrayList<PhotoClass> photoList = new ArrayList<>();
    RecyclerView recycler;
    String animal;
    int language;
    TextView heading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos_page);

        Intent intent = getIntent();
        animal = intent.getStringExtra("animal");
        language = intent.getIntExtra("language", 0);

        final Typeface tf = Typeface.createFromAsset(this.getAssets(),
                "font/kalpurush.ttf");

        heading = findViewById(R.id.heading);
        heading.setTypeface(tf);
        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        if(animal=="") {
            if(language==0) heading.setText(R.string.not_selected_photos);
            else heading.setText(R.string.not_selected_photos_bangla);
        }
        else {
            boolean found = false;
            for(int i=0; i<AnimalDetails.PHOTOS.length; i++) {
                if(animal.equals(AnimalDetails.PHOTOS[i][1])) {
                    found = true;
                    if(language==0) heading.setText(AnimalDetails.PHOTOS[i][1]);
                    else {
                        int bnClass = Integer.parseInt(AnimalDetails.PHOTOS[i][0]);
                        heading.setText(AnimalClasses.ANIMAL_CLASSES_BANGLA[bnClass]);
                    }
                    for(int j=2; j<AnimalDetails.PHOTOS[i].length; j++) {
                        photoList.add(new PhotoClass(AnimalDetails.PHOTOS[i][j], animal));
                    }
                    break;
                }
            }
            if(!found) {
                heading.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18f);
                if(language==0) heading.setText(R.string.data_not_added_sorry);
                else heading.setText(R.string.data_not_added_sorry_bangla);
            }
            RecyclerPhotosAdapter adp = new RecyclerPhotosAdapter(this, photoList);
            recycler.setAdapter(adp);
        }

    }
}