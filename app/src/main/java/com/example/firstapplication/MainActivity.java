package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onBtnClick(View view){
        TextView helloText=findViewById(R.id.helloText);
        EditText getName=findViewById(R.id.getName);

        helloText.setText("Hello "+getName.getText().toString());
    }
}