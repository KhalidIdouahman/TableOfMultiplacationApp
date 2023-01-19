package com.example.tp_02_git_and_githube;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

        btn_white.setOnClickListener(view -> layout.setBackgroundColor(Color.rgb(255 ,255 ,255)));
        btn_lavender.setOnClickListener(view -> layout.setBackgroundColor(Color.rgb(241 ,151 ,255)));
        btn_pink.setOnClickListener(view -> layout.setBackgroundColor(Color.rgb(253 ,155 ,206)));
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