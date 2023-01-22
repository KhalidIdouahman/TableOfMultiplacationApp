package com.example.tp_02_git_and_githube;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    View layout;
    Button btn_display, btn_reset,btn_leave;
    Button btn_white, btn_lavender,btn_pink;
    EditText input_text;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.main_layout);

        btn_reset = findViewById(R.id.btn_reset);
        btn_display = findViewById(R.id.btn_display);
        btn_leave = findViewById(R.id.btn_leave);

        input_text = findViewById(R.id.input_text);


        btn_white = findViewById(R.id.btn_white);
        btn_lavender = findViewById(R.id.btn_lavender);
        btn_pink = findViewById(R.id.btn_pink);

        btn_white.setOnClickListener(view -> layout.setBackgroundColor(Color.rgb(255 ,255 ,255)));
        btn_lavender.setOnClickListener(view -> layout.setBackgroundColor(Color.rgb(241 ,151 ,255)));
        btn_pink.setOnClickListener(view -> layout.setBackgroundColor(Color.rgb(253 ,155 ,206)));

        textView = findViewById(R.id.textView_display);

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_text.setText("");
                multiplicationDisplay("?");
            }
        });
        btn_leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        btn_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input_text.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter a number !!", Toast.LENGTH_LONG).show();
                    multiplicationDisplay("?");
                } else {
                    int number = Integer.parseInt(input_text.getText().toString());
                    multiplicationDisplay(number);
                }
            }
        });
    }

    @SuppressLint("DefaultLocale")
    public void multiplicationDisplay(Object x) {
        textView.setText("");
        String str = "";
        if (x instanceof Integer) {
            int num = (int) x;
            for (int i = 0; i < 11 ; i++) {
                int result = num * i;
                str += String.format("%d * %d = %s", num,i,result+"\n");
            }
            textView.setText(str);
        } else {
            for (int i = 0; i < 11 ; i++) {
                str += String.format("? * %d = ?\n" ,i);
            }
            textView.setText(str);
        }

    }


}