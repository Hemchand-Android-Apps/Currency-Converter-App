package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertAmount(View view) {
        EditText currencyAmount = findViewById(R.id.currencyAmount);
        double amountEntered = Double.parseDouble(currencyAmount.getText().toString());
        Double convertedAmount = amountEntered * 71.49;
        Toast.makeText(this, "$" + amountEntered + " = " + convertedAmount + " INR" , Toast.LENGTH_LONG).show();
    }
}
