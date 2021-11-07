package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "wy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, TAG + "--->onCreate()");
    }

    public void startActivity2(View view) {
        startActivity(new Intent(this, MainActivity2.class));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, TAG + "--->onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, TAG + "--->onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, TAG + "--->onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, TAG + "--->onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, TAG + "--->onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, TAG + "--->onDestroy()");
    }

}