package com.study.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG = "MainActivity";
    FlippedButton fButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fButton=findViewById(R.id.flippedButton);
        fButton.setOnMyClickListener(new FlippedButton.IMyClick(){
            @Override
            public void onMyClick(String str) {
                Log.d(LOG_TAG,str);
            }
        });
    }
}
