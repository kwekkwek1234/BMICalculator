package com.example.taruc.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView BMI;
        ImageView image;
        BMI = findViewById(R.id.BMIMessage);
        image = findViewById(R.id.imageView);
        Intent intent = getIntent();
        if(((Intent) intent).hasExtra(MainActivity.TAG_MASSAGE)){
            Double BMIMsg = intent.getDoubleExtra(MainActivity.TAG_MASSAGE,0);
            if(BMIMsg < 18.5){
                image.setImageDrawable(under.png);
            }else if(BMIMsg < 25){
                image.setImageDrawable(normal.png);
            }else{
                image.setImageDrawable(over.png);
            }
            BMI.setText("BMI: " + BMIMsg);
        }
    }
}
