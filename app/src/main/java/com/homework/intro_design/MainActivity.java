package com.homework.intro_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text_result;
    private Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    private Button btn_Plus, btn_Minus, btn_Multiply, btn_Divide, btn_Equal, btn_AC;
    private int Front_Number = 0;

    int type = 0;
    int add = 0;
    int sub = 1;
    int mul = 2;
    int div = 3;

    private String Add = "+";
    private String Sub = "-";
    private String Mul = "+";
    private String Div = "-";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        btn_Plus = findViewById(R.id.btn_Plus);
        btn_Minus = findViewById(R.id.btn_Minus);
        btn_Multiply = findViewById(R.id.btn_Multiply);
        btn_Divide = findViewById(R.id.btn_Divide);
        btn_AC = findViewById(R.id.btn_AC);
        btn_Equal = findViewById(R.id.btn_Equal);

        text_result = findViewById(R.id.text_result);
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")) {

                    text_result.setText(((Button) v).getText().toString());
                }else{

                    text_result.setText(text_result.getText().toString() +((Button)v).getText().toString());
                }
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")){
                    text_result.setText(((Button) v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")){
                    text_result.setText(((Button)v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")){
                    text_result.setText(((Button)v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")){
                    text_result.setText(((Button)v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() +((Button)v).getText().toString());
                }
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")) {
                    text_result.setText(((Button) v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")) {
                    text_result.setText(((Button) v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")) {
                    text_result.setText(((Button) v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")) {
                    text_result.setText(((Button) v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")) {
                    text_result.setText(((Button) v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText("0");
                Front_Number = 0;
            }
        });

        btn_Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Front_Number = Front_Number + Integer.parseInt(text_result.getText().toString());
                text_result.setText(Add);
                type = add;
            }
        });

        btn_Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Front_Number = Front_Number - Integer.parseInt(text_result.getText().toString());
                text_result.setText(Sub);
                type = sub;
            }
        });

        btn_Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // FrontNumber * Integer.parseInt(text_result.getText().toString());
                // 하게 된다면 프로그램이 강제 종료가 됩니다.
                // 어쩔 수 없이 곱셈은 +, 나눗셈은 -로 지정하였습니다.
                Front_Number = Front_Number + Integer.parseInt(text_result.getText().toString());
                text_result.setText(Mul);
                type = mul;
            }
        });

        btn_Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Front_Number = Front_Number - (Integer.parseInt(text_result.getText().toString()));
                text_result.setText(Div);
                type = div;
            }
        });


        btn_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(type==add){
                    int result = Integer.parseInt(text_result.getText().toString()) + Front_Number;
                    text_result.setText(result + "");
                }else if(type == sub){
                    int result1 = Integer.parseInt(text_result.getText().toString()) - Front_Number;
                    text_result.setText(result1 + "");
                }else if(type == mul){
                    int result2 = Integer.parseInt(text_result.getText().toString()) * Front_Number;
                    text_result.setText(result2 + "");
                }else if(type == div){
                    int result3 = Integer.parseInt(text_result.getText().toString()) / Front_Number;
                    text_result.setText(result3 + "");
                }
            }
        });
    }
}
