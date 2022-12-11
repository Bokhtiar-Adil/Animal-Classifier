package com.example.animalclassifierv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class EncyclopediaActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView text,name,alert,alert2,scifi,cst,desc;
    TextView scilbl,cstlbl,venomlbl,desclbl,header,more;
    Spinner spin;
    ArrayList<String> animals = new ArrayList<>();
    int language;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encyclopedia);

        Intent intent = getIntent();
        language = intent.getIntExtra("language", 0);

        scilbl = findViewById(R.id.sciname);
        cstlbl = findViewById(R.id.cst);
        venomlbl = findViewById(R.id.alert);
        desclbl = findViewById(R.id.desc);
        header = findViewById(R.id.text);
        more = findViewById(R.id.more);

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

        int len = AnimalDetails.DETAILS.length;
        animals.add("");

        for(int i=0; i<len; i++){
            animals.add(AnimalDetails.DETAILS[i][1]);
        }
        ArrayAdapter<String> spinAdp = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, animals);
        spin.setAdapter(spinAdp);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(i!=0){
            String details[] = AnimalDetails.DETAILS[i-1];
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
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}