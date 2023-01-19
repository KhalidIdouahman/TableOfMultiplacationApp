package com.example.tp_02_git_and_githube;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
                textView.setText("");
                for (int i = 0; i < 11 ; i++) {
                    textView.append(multiplicationDisplay("?",i,"?\n"));
                }
            }
        });
        btn_leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public String multiplicationDisplay(String place1 , int place2, String place3) {
        return String.format("%s * %d = %s",place1,place2,place3);
    }

//    textView.setText("");
//                for (int i = 0; i < 11 ; i++) {
//        int y = 4;
//        int x = y*i;
//        textView.append(multiplicationDisplay(Integer.toString(y),i,Integer.toString(x))+"\n");
//    }
}