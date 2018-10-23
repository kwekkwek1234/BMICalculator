package com.example.taruc.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG_MASSAGE = "com.example.taruc.bmicalculator.MESSAGE";
    private EditText Weight;
    private EditText Height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Weight = findViewById(R.id.WeightMsg);
        Height = findViewById(R.id.HeightMsg);
    }

    public void calculateBMI(View view){
        int weight,height;
        double BMI;
        if(TextUtils.isEmpty(Weight.getText())){
            Weight.setError("Please enter your weight");
            return;
        }
        if(TextUtils.isEmpty(Height.getText())){
            Height.setError("Please enter your height");
            return;
        }
        weight = Integer.parseInt(Weight.getText().toString());
        height = Integer.parseInt(Height.getText().toString());
        BMI = weight/(Math.sqrt(height/100));
        Intent intent = new Intent(this, SecondActivity.class);
        intent = intent.putExtra(TAG_MASSAGE,BMI);
        startActivity(intent);
    }
}
