package com.alokagnihotri.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button, button2, button3, button4;
    EditText editTextNumber, getEditTextNumber2;
    TextView textView3;
    float num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        editTextNumber = findViewById(R.id.editTextNumber);
        getEditTextNumber2 = findViewById(R.id.editTextNumber2);
        textView3 = findViewById(R.id.textView3);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    public float getFloatFromEditText(EditText editText) {
        if (editText.getText().toString().equals("")) {
            Toast.makeText(this, "Enter Number!!", Toast.LENGTH_SHORT).show();
            return 0.0f;
        } else {
            return Float.parseFloat(editText.getText().toString());
        }
    }

    @Override
    public void onClick(View view) {
        num1 = getFloatFromEditText(editTextNumber);
        num2 = getFloatFromEditText(getEditTextNumber2);

        if (view.getId() == R.id.button) {
            textView3.setText("Answer is : " + (num1 + num2));
        } else if (view.getId() == R.id.button2) {
            textView3.setText("Answer is : " + (num1 - num2));
        } else if (view.getId() == R.id.button3) {
            textView3.setText("Answer is : " + (num1 * num2));
        } else if (view.getId() == R.id.button4) {
            if (num2 != 0.0f) {
                textView3.setText("Answer is : " + (num1 / num2));
            } else {
                Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
