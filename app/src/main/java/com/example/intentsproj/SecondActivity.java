package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();

        final String num1 =i.getStringExtra("num1");
        String num2 = i.getStringExtra("num2");

        EditText txt1 = findViewById(R.id.txtnum1);
        EditText txt2 = findViewById(R.id.txtnum2);

        txt1.setText(num1);
        txt2.setText(num2);

        final int n1 = Integer.parseInt(num1);
       final  int n2 = Integer.parseInt(num2);

        Button addition =findViewById(R.id.add);
        Button minus = findViewById(R.id.min);
        Button multi = findViewById(R.id.multi);
        Button divide = findViewById(R.id.div);

        final EditText answer = findViewById(R.id.answer);
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int ans = n1+n2;
                answer.setText(""+n1+" + "+""+n2+" = "+ans);

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int ans = n1-n2;
                answer.setText(""+n1+" - "+""+n2+" = "+ans);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int ans = n1*n2;
                answer.setText(""+n1+" * "+""+n2+" = "+ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float ans = n1/(float)n2;
                answer.setText(""+n1+" / "+""+n2+" = "+ans);
            }
        });



    }
}