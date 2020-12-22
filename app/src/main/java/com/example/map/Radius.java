package com.example.map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Radius extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radius);
        radioGroup=(RadioGroup)findViewById(R.id.radiogrp);
    }

    public void checkSel(View view){
        Intent i= new Intent();
        int selRB=radioGroup.getCheckedRadioButtonId();
        radioButton=(RadioButton)findViewById(selRB);
        Toast.makeText(this,"Radius Has been Set to "+radioButton.getText(),Toast.LENGTH_SHORT).show();
        i.putExtra("message",radioButton.getText());
        setResult(RESULT_OK,i);
    }

}