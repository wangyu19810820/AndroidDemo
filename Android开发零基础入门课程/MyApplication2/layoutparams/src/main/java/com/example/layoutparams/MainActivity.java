package com.example.layoutparams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        linearLayout.setLayoutParams(layoutParams);
        setContentView(linearLayout);

        TextView textView = new TextView(this);
        textView.setText("我是文本");
        textView.setBackgroundColor(0xffff0000);
        LinearLayout.LayoutParams textLayoutParams = new LinearLayout.LayoutParams(300, 300);
//        textView.setLayoutParams(textLayoutParams);
//        linearLayout.addView(textView);
        linearLayout.addView(textView, textLayoutParams);
    }
}