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


public class MainActivity extends AppCompatActivity {
    CustomButton navigateToSecondPage, showCustomButton, showQRScanner,exampleButton;


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigateToSecondPage = findViewById(R.id.navigateToSecondPage);
        showCustomButton = findViewById(R.id.showCustomButton );
        showQRScanner = findViewById(R.id.showQrScanner);
        exampleButton =findViewById(R.id.example);

//        // Set padding for all buttons
//        int paddingInDp = 16;
//        int paddingInPixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, paddingInDp, getResources().getDisplayMetrics());
//
//        navigateToSecondPage.setPadding(paddingInPixels, paddingInPixels, paddingInPixels, paddingInPixels);
//        showCustomButton.setPadding(paddingInPixels, paddingInPixels, paddingInPixels, paddingInPixels);
//        showQRScanner.setPadding(paddingInPixels, paddingInPixels, paddingInPixels, paddingInPixels);
//        exampleButton.setPadding(paddingInPixels, paddingInPixels, paddingInPixels, paddingInPixels);

        // Set properties dynamically
        navigateToSecondPage.setColor(Color.RED);
        navigateToSecondPage.setShape(GradientDrawable.RECTANGLE);
        navigateToSecondPage.setButtonText("Go to Second Page");



        showCustomButton.setColor(Color.GREEN);
        showCustomButton.setShape(GradientDrawable.OVAL);
        showCustomButton.setButtonText("Show Custom Button");

        navigateToSecondPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSecondPage = new Intent(MainActivity.this, SecondPage.class);
                startActivity(intentSecondPage);
            }
        });

        showCustomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This is the custom button - CLICKED",Toast.LENGTH_SHORT).show();
            }
        });

        //QR SCANNER IMPLEMENTATION
        showQRScanner.setColor(Color.GRAY);
        showQRScanner.setShape(GradientDrawable.OVAL);
        showQRScanner.setButtonText("QR SCANNER");
        showQRScanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentQrScanner = new Intent(MainActivity.this, QR_Scanner.class);
                startActivity(intentQrScanner);
            }
        });

        exampleButton.setColor(Color.MAGENTA);
        exampleButton.setShape(GradientDrawable.RECTANGLE);
        exampleButton.setButtonText("Example");
        exampleButton.setPadding(30,16,30,16);
        exampleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentExampleButton = new Intent(MainActivity.this, SecondPage.class);
                startActivity(intentExampleButton);
            }
        });
    }
}

















//package com.example.taskapplication;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//
//public class MainActivity extends AppCompatActivity {
//    Button navigateToSecondPage, showcustomButton;
//
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        navigateToSecondPage = findViewById(R.id.navigateToSecondPage);
//        showcustomButton = findViewById(R.id.showCustomButton );
//
//        navigateToSecondPage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, SecondPage.class);
//                startActivity(intent);
//            }
//        });
//
//        showcustomButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"This is the custom button - CLICKED",Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}
