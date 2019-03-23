package com.example.numbercalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ImageButton b = (ImageButton)this.findViewById(R.id.click_btn);
        //Button b = (Button)this.findViewById(R.id.click_btn);
        b.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)  {
                TextView resp = (TextView) findViewById(R.id.response);
                EditText number1 = (EditText) findViewById(R.id.number1);
                EditText number2 = (EditText) findViewById(R.id.number2);
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                int p,n;
                String s1;
                if(num1.matches("[0-9]+")&&num2.matches("[0-9]+")) {
                    p = Integer.parseInt(num1);
                    n = Integer.parseInt(num2);
                    if(squareRootExists(n, p))
                        s1="YES  :)";
                    else
                        s1 = "no  :(";
                }
                else
                    s1 = "Idiot, enter a number";
                resp.setText(s1);
            }
        });
    }
    static boolean squareRootExists(int n, int p)
    {
        n = n % p;

        // One by one check all numbers from 2
        // to p-1
        for (int x = 2; x < p; x++)
            if ((x * x) % p == n)
                return true;

        return false;
    }

}
