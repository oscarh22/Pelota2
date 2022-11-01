package com.example.pelota2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Mipelota dibujo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dibujo = new Mipelota( this);
         setContentView(dibujo);
         setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER_PORTRAIT);
    }
}