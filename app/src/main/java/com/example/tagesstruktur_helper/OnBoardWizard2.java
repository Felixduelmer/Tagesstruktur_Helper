package com.example.tagesstruktur_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class OnBoardWizard2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board_wizard2);
        Bundle extras = getIntent().getExtras();
        if(extras!= null){
            Toast.makeText(this, "Success!", Toast.LENGTH_LONG).show();
            System.out.println(extras.getCharSequence("time_frueh"));
        }
    }
}
