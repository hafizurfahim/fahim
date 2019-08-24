package com.example.attendancesystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class FacultyActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButton,r1,r2;

    private TextView show;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        radioGroup = findViewById(R.id.rg1);
        radioGroup=findViewById(R.id.rg2);
        show = findViewById(R.id.resultt);
        r1=findViewById(R.id.rbutton1);
        r2=findViewById(R.id.rbutton2,rbutton3);
        r1=findViewById(R.id.rbutton3);
        r2=findViewById(R.id.rbutton4);



    }



    public void outt(View view) {


        radioButton = findViewById(radioGroup.getCheckedRadioButtonId());

if(radioButton==r1) {
    int x;

        show.setText("Attendance is : present ");


}
        if(radioButton==r2) {
            show.setText("Attendance is : absent ");
        }





    }
}
