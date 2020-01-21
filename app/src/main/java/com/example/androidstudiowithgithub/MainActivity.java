package com.example.androidstudiowithgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //version 0.1
        Log.i(TAG, "onCreate: Started");

        //version 0.2
        String textString = "This is our version 2";

    }
}
