package com.example.tp_02_git_and_githube;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_display, btn_reset,btn_leave;
    EditText input_text;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_reset = findViewById(R.id.btn_reset);
        btn_display = findViewById(R.id.btn_display);
        btn_leave = findViewById(R.id.btn_leave);

        input_text = findViewById(R.id.input_text);

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