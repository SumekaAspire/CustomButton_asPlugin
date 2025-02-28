package com.example.library;


import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;

public class CustomButton extends androidx.appcompat.widget.AppCompatButton {

    private GradientDrawable drawable;

    public CustomButton(Context context) {
        super(context);
        init();
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        // Initialized drawable , default value
        drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE);
        setBackground(drawable);
        setColor(Color.BLUE);
        setText("Custom Button");
        setPadding(16,10,16,16);

    }

    public void setShape(int shape) {
        drawable.setShape(shape);
        setBackground(drawable);
    }

    public void setColor(int color) {
        drawable.setColor(color);
        setBackground(drawable);
    }

    public void setButtonText(String text) {
        setText(text);
    }
}