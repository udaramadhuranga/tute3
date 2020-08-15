package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = findViewById(R.id.btnok);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context =getApplicationContext();
                CharSequence messeage ="You just clicked the ok button";

                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,messeage,duration);

                toast.show();

                toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);



                EditText number1 = findViewById(R.id.txt1);
                EditText number2 = findViewById(R.id.txt2);

                String n1 = number1.getText().toString();
                String n2 = number2.getText().toString();
                Intent i = new Intent(MainActivity.this,SecondActivity.class);

                i.putExtra("num1",n1);
                i.putExtra("num2",n2);




                startActivity(i);



            }
        });

    }
}