package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.toasty.ToastMaker;

public class MainActivity extends AppCompatActivity {
    private TextView tv_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_view=findViewById(R.id.tv_view);
        String str= ToastMaker.ToastDisplay(this,"Subham Mohanta");
        tv_view.setText(str);

    }
}