package com.example.attendancesystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void faculty(View view) {
       Intent intent =new Intent(MainActivity.this,FacultyActivity.class);
       startActivity(intent);

    }

    public void admin(View view) {

    }

    public void student(View view) {
    }


}
