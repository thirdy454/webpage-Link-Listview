package com.example.hciactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView firetea;
    ArrayList<String> Link = new ArrayList<>();
    ArrayList<String> TitleList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firetea = findViewById(R.id.firetea);

        TitleList.add("DS Home");
        TitleList.add("DS Introduction");
        TitleList.add("DS What is Data");
        TitleList.add("DS Database Table");
        TitleList.add("DS Python");
        TitleList.add("DS Data Frame");
        TitleList.add("DS Functions");
        TitleList.add("DS Data Preparation");


        CustomAdapter customAdapter = new CustomAdapter();
        firetea.setAdapter(customAdapter);

//        WebView myWebView = (WebView) findViewById(R.id.webview);
//        myWebView.loadUrl("https://www.facebook.com");

        firetea.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(Tutorial.class);
                String link = String.valueOf(firetea.get(position));
                Toast.makeText(MainActivity.this,link , Toast.LENGTH_SHORT).show();

////
//                if(firetea.toString().equals("DS Home") ){
//                    Toast.makeText(MainActivity.this,"sadasdasd", Toast.LENGTH_LONG).show();
//                }


//                Intent intent = new Intent(Tutorial.class);
//                intent.putExtra("Link","https://www.w3schools.com/datascience/default.asp");
//                startActivity(intent);
            }
        });

    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return TitleList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View viewl = getLayoutInflater().inflate(R.layout.listview_main,null);
            TextView title = viewl.findViewById(R.id.title);
            title.setText(TitleList.get(position));
            return viewl;
        }

    }

//    public void onBackPressed(){
//        if(myWebView.canGoBack()){
//            myWebView.goBack();
//        }else{
//            super.onBackPressed();
//        }
//    }

}
