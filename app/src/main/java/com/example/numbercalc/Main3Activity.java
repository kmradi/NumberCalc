package com.example.numbercalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageButton b = (ImageButton)this.findViewById(R.id.click_btn);
        //Button b = (Button)this.findViewById(R.id.click_btn);
        b.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)  {
                TextView resp = (TextView) findViewById(R.id.response);
                EditText number1 = (EditText) findViewById(R.id.number1);
                EditText number2 = (EditText) findViewById(R.id.number2);
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                long n1,n2;
                String s1;
                if(num1.matches("[0-9]+")&&num2.matches("[0-9]+")) {
                    n1 = Long.parseLong(num1);
                    n2 = Long.parseLong(num2);
                    s1 = "" + gcd(n1, n2);
                }
                else
                    s1 = "Idiot, enter a number";
                resp.setText(s1);
            }
        });
    }
    static long gcd(long a, long b)
    {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
}

