package com.example.week1day4hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvResult;
    Button btn0;
    Button btn9;
    Button btn8;
    Button btn7;
    Button btn6;
    Button btn5;
    Button btn4;
    Button btn3;
    Button btn2;
    Button btn1;
    Button btnAdd;
    Button btnDecimal;
    Button btnDiv;
    Button btnEquals;
    Button btnMin;
    Button btnMul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = findViewById(R.id.btn0);
        btn9 = findViewById(R.id.btn9);
        btn8 = findViewById(R.id.btn8);
        btn7 = findViewById(R.id.btn7);
        btn6 = findViewById(R.id.btn6);
        btn5 = findViewById(R.id.btn5);
        btn4 = findViewById(R.id.btn4);
        btn3 = findViewById(R.id.btn3);
        btn2 = findViewById(R.id.btn2);
        btn1 = findViewById(R.id.btn1);
        btnAdd = findViewById(R.id.btnAdd);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnDiv = findViewById(R.id.btnDiv);
        btnEquals = findViewById(R.id.btnEquals);
        btnMin = findViewById(R.id.btnMin);
        btnMul = findViewById(R.id.btnMul);
        tvResult = findViewById(R.id.tvResult);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnMin.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnDecimal.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
    }


    private  addNumbers(String num1, String num2) {
    }

    private  subtractNumbers(String num1, String num2) {
    }
    private  divideNumbers(String num1, String num2) {
    }
    private  addNumbers(String num1, String num2) {
    }


    @Override
    public void onClick(View v) {
       String string = " ";
        switch (v.getId()) {
            case R.id.btn0:
                string += 0;
                break;

            case R.id.btn1:
                string += 1;
                break;

            case R.id.btn2:
                string += 2;
                break;

            case R.id.btn3:
                string += 3;
                break;

            case R.id.btn4:
                string += 4;
                break;

            case R.id.btn5:
                string += 5;
                break;

            case R.id.btn6:
                string += 6;
                break;

            case R.id.btn7:
                string += 7;
                break;

            case R.id.btn8:
                string += 8;
                break;

            case R.id.btn9:
                string += 9;
                break;

            case R.id.btnAdd:
                addNumbers();
                break;



        }
    }
}
