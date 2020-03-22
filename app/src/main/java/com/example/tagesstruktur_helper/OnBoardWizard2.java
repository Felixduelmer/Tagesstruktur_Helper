package com.example.tagesstruktur_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class OnBoardWizard2 extends AppCompatActivity {

    RadioGroup radioGroup_sport;
    Button button_sport;
    RadioButton radioSportbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board_wizard2);
        Bundle extras = getIntent().getExtras();
        if(extras!= null){
            Toast.makeText(this, "Success!", Toast.LENGTH_LONG).show();
            System.out.println(extras.getCharSequence("time_frueh"));
        }

        button_sport = (Button) findViewById(R.id.button_sport);
        radioGroup_sport = (RadioGroup) findViewById(R.id.radio_group_sport);
        button_sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                int selectedID = radioGroup_sport.getCheckedRadioButtonId();
                radioSportbutton = (RadioButton) findViewById(selectedID);
                intent.putExtra("Sport", radioSportbutton.getText());
                startActivity(intent);
            }
        });




    }
}
