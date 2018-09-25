package com.oderon.ian;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITG", "onCreate() has been executed...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITG", "onStart() has been executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITG", "onResume() has been executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITG", "onPause() has been executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITG", "onStop() has been executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITG", "onDestroy() has been executed...");
    }

    public void doSnackbar(View view) {
        Snackbar.make(view,"Hi! I am a Snackbar", Snackbar.LENGTH_LONG).show();
    }

    public void doToast(View v) {
        Toast.makeText(this, "Hi! I am a Toast", Toast.LENGTH_LONG).show();
    }
}
