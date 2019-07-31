package com.example.convertmilestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConvMilesToKm =  findViewById(R.id.buttonConvMilesToKM);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener(){
            //miles to km
            @Override
            public void onClick(View v){
                EditText textBoxMiles =  findViewById(R.id.editTextMiles);
                EditText textBoxKm =  findViewById(R.id.editTextKm);
                double vMiles = Double.valueOf(textBoxMiles.getText().toString());
                double vKM = vMiles/0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(vKM));

            }
        });
        Button buttonConvKmToMiles =  findViewById(R.id.buttonConvKmToMiles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener(){
            //km to miles
            @Override
            public void onClick(View v){
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                double vKM = Double.valueOf(textBoxKm.getText().toString());
                double vMiles = vKM *0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxMiles.setText(formatVal.format(vMiles));

            }
        });
    }
}
