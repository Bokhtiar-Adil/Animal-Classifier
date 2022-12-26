package com.example.animalclassifierv3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class AboutAppActivity extends AppCompatActivity {

    TextView heading, subheading, madeBy, bokhtiar, rakib, supervisedBy, sir, rights, dept, varsity, country;
    int language = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);

        heading = findViewById(R.id.heading);
        subheading = findViewById(R.id.subheading);
        madeBy = findViewById(R.id.madeBy);
        bokhtiar = findViewById(R.id.bokhtiar);
        rakib = findViewById(R.id.rakib);
        supervisedBy = findViewById(R.id.supervisedBy);
        sir = findViewById(R.id.sir);
        rights = findViewById(R.id.rights);
        dept = findViewById(R.id.dept);
        varsity = findViewById(R.id.varsity);
        country = findViewById(R.id.country);

        final Typeface tf = Typeface.createFromAsset(this.getAssets(),
                "font/kalpurush.ttf");

        heading.setTypeface(tf);
        subheading.setTypeface(tf);
        madeBy.setTypeface(tf);
        bokhtiar.setTypeface(tf);
        rakib.setTypeface(tf);
        supervisedBy.setTypeface(tf);
        sir.setTypeface(tf);
        rights.setTypeface(tf);
        dept.setTypeface(tf);
        varsity.setTypeface(tf);
        country.setTypeface(tf);

        if(GlobalSettings.language==0) language = 0;
        else language = 1;

        if(language==0) {
            heading.setText("ANIMALO");
            subheading.setText("Learn about animals in fun way with Animalo!!");
            madeBy.setText("Made by");
            bokhtiar.setText("Bokhtiar Adil Prottoy");
            rakib.setText("Rakibul Islam");
            supervisedBy.setText("Supervised by");
            sir.setText("Professor Dr. Aminul Haque Akhand");
            rights.setText("All rights reserved by");
            dept.setText("Department of Computer Science and Engineering");
            varsity.setText("Khulna University of Engineering and Technology");
            country.setText("Khulna, Bangladesh");
        }
        else {
            heading.setText("এনিমেলো");
            subheading.setText("আনন্দের সাথে প্রাণী সম্পর্কে জানুন এনিমেলোর সাথে!!");
            madeBy.setText("এপ ডেভেলপার");
            bokhtiar.setText("বখতিয়ার আদিল প্রত্যয়");
            rakib.setText("রাকিবুল ইসলাম");
            supervisedBy.setText("তত্ত্বাবধায়ক");
            sir.setText("অধ্যাপক ডঃ আমিনুল হক আখন্দ");
            rights.setText("স্বত্বাধিকারী");
            dept.setText("কম্পিউটার বিজ্ঞান ও প্রকৌশল বিভাগ");
            varsity.setText("খুলনা বিজ্ঞান ও প্রকৌশল বিশ্ববিদ্যালয়");
            country.setText("খুলনা, বাংলাদেশ");
        }

    }
}