package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    TextView sonucEkrani,cozumEkrani;
    Button button_C,button_kapali_parantez,button_acik_parantez;
    Button button_bolme,button_carpma,button_toplama,button_cikarma,button_esittir;
    Button button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9;
    Button button_AC,button_nokta;
    boolean plus,minus,div,multi;
    float valueOne,valueTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sonucEkrani = findViewById(R.id.sonucEkrani);
        cozumEkrani = findViewById(R.id.cozumEkrani);
        button_C= (Button) findViewById(R.id.button_C);
        button_kapali_parantez= (Button) findViewById(R.id.button_kapali_parantez);
        button_acik_parantez= (Button) findViewById(R.id.button_acik_parantez);
        button_bolme= (Button) findViewById(R.id.button_bolme);
        button_carpma= (Button) findViewById(R.id.button_carpma);
        button_toplama= (Button) findViewById(R.id.button_toplama);
        button_cikarma= (Button) findViewById(R.id.button_cikarma);
        button_esittir= (Button) findViewById(R.id.button_esittir);
        button_0= (Button) findViewById(R.id.button_0);
        button_1= (Button) findViewById(R.id.button_1);
        button_2= (Button) findViewById(R.id.button_2);
        button_3= (Button) findViewById(R.id.button_3);
        button_4= (Button) findViewById(R.id.button_4);
        button_5= (Button) findViewById(R.id.button_5);
        button_6= (Button) findViewById(R.id.button_6);
        button_7= (Button) findViewById(R.id.button_7);
        button_8= (Button) findViewById(R.id.button_8);
        button_9= (Button) findViewById(R.id.button_9);
        button_AC= (Button) findViewById(R.id.button_AC);
        button_nokta= (Button) findViewById(R.id.button_nokta);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucEkrani.setText(sonucEkrani.getText()+"1");
                cozumEkrani.setText(sonucEkrani.getText());
                String buttonText = button_0.getText().toString();
                String dataToCalculate = cozumEkrani.getText().toString();
                if (buttonText.equals("AC")){
                    cozumEkrani.setText("");
                    sonucEkrani.setText("0");
                    return;
                }
                if (buttonText.equals("C")){
                    dataToCalculate=dataToCalculate.substring(0,dataToCalculate.length()-1);
                    return;
                }else{
                    dataToCalculate = dataToCalculate+buttonText;
                }


                cozumEkrani.setText(dataToCalculate);
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucEkrani.setText(sonucEkrani.getText()+"2");
                cozumEkrani.setText(sonucEkrani.getText());
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucEkrani.setText(sonucEkrani.getText()+"3");
                cozumEkrani.setText(sonucEkrani.getText());
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucEkrani.setText(sonucEkrani.getText()+"4");
                cozumEkrani.setText(sonucEkrani.getText());
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucEkrani.setText(sonucEkrani.getText()+"5");
                cozumEkrani.setText(sonucEkrani.getText());
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucEkrani.setText(sonucEkrani.getText()+"6");
                cozumEkrani.setText(sonucEkrani.getText());
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucEkrani.setText(sonucEkrani.getText()+"7");
                cozumEkrani.setText(sonucEkrani.getText());
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucEkrani.setText(sonucEkrani.getText()+"8");
                cozumEkrani.setText(sonucEkrani.getText());
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucEkrani.setText(sonucEkrani.getText()+"9");
                cozumEkrani.setText(sonucEkrani.getText());
            }
        });
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucEkrani.setText(sonucEkrani.getText()+"0");
                cozumEkrani.setText(sonucEkrani.getText());
            }
        });
        button_acik_parantez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucEkrani.setText(sonucEkrani.getText()+"(");
                cozumEkrani.setText(sonucEkrani.getText());
            }
        });
        button_kapali_parantez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucEkrani.setText(sonucEkrani.getText()+")");
                cozumEkrani.setText(sonucEkrani.getText());
            }
        });
        button_nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucEkrani.setText(sonucEkrani.getText()+".");
                cozumEkrani.setText(sonucEkrani.getText());
            }
        });
        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucEkrani.setText(sonucEkrani.getText()+"");
                cozumEkrani.setText(sonucEkrani.getText());
            }
        });
        button_toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sonucEkrani==null){
                    sonucEkrani.setText("");
                }else{
                    valueOne=Float.parseFloat(sonucEkrani.getText()+"");
                    plus=true;
                    sonucEkrani.setText(null);
                }
            }
        });
        button_cikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sonucEkrani==null){
                    sonucEkrani.setText("");
                }else{
                    valueOne=Float.parseFloat(sonucEkrani.getText()+"");
                    minus=true;
                    sonucEkrani.setText(null);
                }
            }
        });
        button_bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sonucEkrani==null){
                    sonucEkrani.setText("");
                }else{
                    valueOne=Float.parseFloat(sonucEkrani.getText()+"");
                    div=true;
                    sonucEkrani.setText(null);
                }
            }
        });
        button_carpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sonucEkrani==null){
                    sonucEkrani.setText("");
                }else{
                    valueOne=Float.parseFloat(sonucEkrani.getText()+"");
                    multi=true;
                    sonucEkrani.setText(null);
                }
            }
        });


        button_esittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo=Float.parseFloat(sonucEkrani.getText()+"");
                if (plus==true){
                    sonucEkrani.setText(valueOne+valueTwo+"");
                    cozumEkrani.setText(valueOne+"+"+valueTwo);
                    boolean b = plus == false;
                }
                if (minus==true){
                    sonucEkrani.setText(valueOne-valueTwo+"");
                    cozumEkrani.setText(valueOne+"-"+valueTwo);
                    boolean b = minus == false;
                }
                if (div==true){
                    sonucEkrani.setText(valueOne/valueTwo+"");
                    cozumEkrani.setText(valueOne+"÷"+valueTwo);
                    boolean b = div == false;
                }
                if (multi==true){
                    sonucEkrani.setText(valueOne*valueTwo+"");
                    cozumEkrani.setText(valueOne+"×"+valueTwo);
                    boolean b = multi == false;
                }}});}










}










































































