package com.example.armen.tarproject4;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class RelativeActivity extends AppCompatActivity {

    private Drawable i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        final Button redButton = findViewById(R.id.redButtonId);
        final Button orangeButton = findViewById(R.id.orangeButtonId);
        final Button yellowButton = findViewById(R.id.yellowButtonId);
        final Button greenButton = findViewById(R.id.greenButtonId);
        final Button blueButton = findViewById(R.id.blueButtonId);
        final Button indigoButton = findViewById(R.id.indigoButtonId);
        final Button violetButton = findViewById(R.id.violetButtonId);
        final RelativeLayout myRelativeLayout = findViewById(R.id.myRelativeId);

        redButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                i = redButton.getBackground();
                myRelativeLayout.setBackground(i);
            }
        });
        orangeButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                i = orangeButton.getBackground();
                myRelativeLayout.setBackground(i);
            }
        });
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                i = yellowButton.getBackground();
                myRelativeLayout.setBackground(i);
            }
        });
        greenButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                i = greenButton.getBackground();
                myRelativeLayout.setBackground(i);
            }
        });
        blueButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                i = blueButton.getBackground();
                myRelativeLayout.setBackground(i);
            }
        });
        indigoButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                i = indigoButton.getBackground();
                myRelativeLayout.setBackground(i);
            }
        });
        violetButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                i = violetButton.getBackground();
                myRelativeLayout.setBackground(i);
            }
        });
    }
}
