package com.allysoftsolutions.lifecycledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String MAIN_ACTIVITY_TAG = MainActivity.class.getSimpleName();

    private void showLog(String text){
        Log.d(MAIN_ACTIVITY_TAG, text);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showLog("Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showLog("Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showLog("Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showLog("Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showLog("Activity Stoped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showLog("Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showLog("Activity Destroyed");
    }
}
