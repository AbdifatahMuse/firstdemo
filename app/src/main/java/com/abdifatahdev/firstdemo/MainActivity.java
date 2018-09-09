package com.abdifatahdev.firstdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        int ar[] =  new int[5];
//
//        for(int i = 0; i < 5; i++)
//            ar[i]=i;
    }

    public void buGetAge(View view) {
        EditText etAge = (EditText)findViewById(R.id.etAge);
        int YearOfBirth = Integer.parseInt(etAge.getText().toString());
        int age = 2018 - YearOfBirth;

        Toast.makeText(this,"age:" + String.valueOf(age) ,Toast.LENGTH_LONG).show();
    }


}
