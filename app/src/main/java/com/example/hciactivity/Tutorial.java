package com.example.hciactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

public class Tutorial extends AppCompatActivity {
    Button mainmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        mainmenu = findViewById(R.id.mainmenu);


        Intent intent = getIntent();

        WebView myWebView = (WebView) findViewById(R.id.webview);
       myWebView.loadUrl(intent.getStringExtra("Link"));

       mainmenu.setOnClickListener(view -> {
           Intent menu = new Intent(Tutorial.this,MainActivity.class);
           startActivity(menu);
       });

    }
}