package com.example.custombuttonapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.library.CustomButton;

public class SecondPage extends AppCompatActivity {
    CustomButton rectangleButton, roundButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);

        rectangleButton = findViewById(R.id.rectangleButton);
        roundButton = findViewById(R.id.roundButton);


        rectangleButton.setColor(Color.GRAY);
        rectangleButton.setShape(GradientDrawable.RECTANGLE);
        rectangleButton.setButtonText("Rectangle Button");

        rectangleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondPage.this, MainActivity.class);
                startActivity(intent);
            }
        });


        roundButton.setColor(Color.RED);
        roundButton.setShape(GradientDrawable.OVAL);
        roundButton.setButtonText("Round Button");

        roundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondPage.this,"Round Button is clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
