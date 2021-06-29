package com.example.fragment_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final String TAG="MainActivity";
    Button btnA,btnB;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG," MainActivity: Oncreate");
         btnA=findViewById(R.id.btn_A);
         btnB=findViewById(R.id.btn_B);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new FragmentC()).commit();
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new fragmentB()).commit();
            }
        });
       btnA.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new fragmentA()).commit();
           }
       });
    }

    @Override
    protected void onStart() {
        Log.v(TAG," MainActivity: OnStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.v(TAG," MainActivity: OnResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG," MainActivity: Onpause");
    }

    @Override
    protected void onStop() {
        Log.v(TAG," MainActivity: OnStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.v(TAG," MainActivity: OnDestroy");
        super.onDestroy();
    }
}