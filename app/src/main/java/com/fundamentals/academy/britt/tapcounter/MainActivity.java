package com.fundamentals.academy.britt.tapcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    private TextView counterTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterTV = findViewById(R.id.tv_counter);
    }

    public void increaseNumber(View view) {
        counter++;
        counterTV.setText(String.valueOf(counter));
    }

    public void openSecondActivity(View view) {
        SecondActivity.start(this, counter);
    }
}
