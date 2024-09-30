package com.example.finaliontion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        TextView textView = findViewById(R.id.textView);
        button.setOnClickListener(v -> textView.setText("Button Clicked!"));
        button2.setOnClickListener(v -> {
            textView.setText("Text Color Changed!");
            textView.setTextColor(Color.RED);
        });
    }
}
