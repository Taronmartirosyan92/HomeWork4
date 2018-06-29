package com.example.armen.tarproject4;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;


public class ColorPoolActivity extends AppCompatActivity {
    private static final int MIN_VALUE_COLOR = 0;
    private static final int MAX_VALUE_COLOR = 255;
    private int seekR;
    private int seekG;
    private int seekB;
    private LinearLayout colorLinearPool;
    private TextView poolText;
    private TextView greenText;
    private TextView redText;
    private TextView blueText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_pool);
        final SeekBar seekBarRed = findViewById(R.id.redId);
        final SeekBar seekBarGreen = findViewById(R.id.greenId);
        final SeekBar seekBarBlue = findViewById(R.id.blueId);
        redText = findViewById(R.id.redValueId);
        greenText = findViewById(R.id.greenValueId);
        blueText = findViewById(R.id.blueValueId);
        poolText = findViewById(R.id.poolTextId);

        colorLinearPool = findViewById(R.id.linearColorPoolId);
        seekBarRed.setProgress(MIN_VALUE_COLOR);
        seekBarRed.setMax(MAX_VALUE_COLOR);
        seekBarGreen.setProgress(MIN_VALUE_COLOR);
        seekBarGreen.setMax(MAX_VALUE_COLOR);
        seekBarBlue.setProgress(MIN_VALUE_COLOR);
        seekBarBlue.setMax(MAX_VALUE_COLOR);
        seekBarRed.setOnSeekBarChangeListener(onSeekBarChangeListener);
        seekBarGreen.setOnSeekBarChangeListener(onSeekBarChangeListener);
        seekBarBlue.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    private SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            switch (seekBar.getId()) {
                case R.id.redId:
                    seekR = progress;
                    redText.setText(String.valueOf(progress));
                    break;
                case R.id.greenId:
                    seekG = progress;
                    greenText.setText(String.valueOf(progress));
                    break;
                case R.id.blueId:
                    seekB = progress;
                    blueText.setText(String.valueOf(progress));
                    break;
            }

            PoolColorMethod();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    private void PoolColorMethod() {
        int color = Color.rgb(seekR, seekG, seekB);
        colorLinearPool.setBackgroundColor(color);
        poolText.setTextColor(color);


    }
}
