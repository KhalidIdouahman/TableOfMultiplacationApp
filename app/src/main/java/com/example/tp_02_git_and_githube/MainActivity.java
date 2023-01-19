package com.example.tp_02_git_and_githube;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn_display, btn_reset,btn_leave;
    Button btn_white, btn_lavender,btn_pink;
    EditText input_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_reset = findViewById(R.id.btn_reset);
        btn_display = findViewById(R.id.btn_display);
        btn_leave = findViewById(R.id.btn_leave);
        input_text = findViewById(R.id.input_text);

        btn_white = findViewById(R.id.btn_white);
        btn_lavender = findViewById(R.id.btn_lavender);
        btn_pink = findViewById(R.id.btn_pink);

//        btn_white.setBackg;
//        btn_lavender.setBackground(Drawable.createFromPath("lavender"));
//        btn_pink.setBackground(Drawable.createFromPath("pink"));

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_text.setText("");
            }
        });
        btn_leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}