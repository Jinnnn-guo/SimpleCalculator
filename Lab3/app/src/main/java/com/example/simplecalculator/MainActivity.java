package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button5,button4,button6,button7,button8,button9,
            buttonPlus,buttonMult,buttonDiv,buttonEqual, buttonDot,buttonSub, buttonClear;
    TextView edttxt;

    float num1, num2;
    boolean sub, add, mul, div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        buttonPlus = (Button) findViewById(R.id.btnPlus);
        buttonMult = (Button) findViewById(R.id.btnMult);
        buttonDiv = (Button) findViewById(R.id.btnDiv);
        buttonEqual = (Button) findViewById(R.id.btnEqual);
        buttonDot = (Button) findViewById(R.id.btnDot);
        buttonSub = (Button) findViewById(R.id.btnSub);
        buttonClear = (Button) findViewById(R.id.btnC);

        edttxt = (TextView) findViewById(R.id.screen);


        button0.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+ "0");
        });

        button1.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+ "1");
        });

        button2.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+ "2");
        });

        button3.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+ "3");
        });

        button4.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+ "4");
        });

        button5.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+ "5");
        });

        button6.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+ "6");
        });

        button7.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+ "7");
        });

        button8.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+ "8");
        });

        button9.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+ "9");
        });

        buttonPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Float.parseFloat(edttxt.getText() + "");
                add = true;
                edttxt.setText(null);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Float.parseFloat(edttxt.getText() + "");
                sub = true;
                edttxt.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Float.parseFloat(edttxt.getText() + "");
                div = true;
                edttxt.setText(null);
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Float.parseFloat(edttxt.getText() + "");
                mul = true;
                edttxt.setText(null);
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edttxt.setText(edttxt.getText() + ".");
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num2 = Float.parseFloat(edttxt.getText() + "");
                if(add == true){
                    edttxt.setText(num1+num2+"");
                    add = false;
                }else if (sub == true){
                    edttxt.setText(num1-num2+"");
                    sub = false;
                }else if (div == true){
                    edttxt.setText(num1/num2 +"");
                    div = false;
                }else if (mul == true){
                    edttxt.setText(num1*num2+"");
                    mul = false;
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edttxt.setText("");
            }
        });


    }


}