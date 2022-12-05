package com.example.animalclassifierv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;

public class WebViewActivity extends AppCompatActivity {

    WebView wb;
    ProgressBar pg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        Intent intent = getIntent();
        String item = intent.getStringExtra("searchItem");

        wb = findViewById(R.id.webview);
        pg = findViewById(R.id.pgbar);

        wb.setVisibility(View.VISIBLE);
        String dest = "https://www.google.com/search?q=";
        String url = dest+item;
        wb.getSettings().setJavaScriptEnabled(true);
        wb.loadUrl(url);
        wb.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                pg.setVisibility(View.VISIBLE);
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                pg.setVisibility(View.GONE);
                super.onPageFinished(view, url);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(wb.canGoBack()){
            wb.goBack();
        } else {
            super.onBackPressed();
        }
    }
}