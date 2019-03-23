package com.example.numbercalc;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageButton b = (ImageButton)this.findViewById(R.id.click_btn);
        b.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)  {
                TextView resp = (TextView) findViewById(R.id.response);
                EditText name = (EditText) findViewById(R.id.number);
                String sd = name.getText().toString();
                String s1="";
                if(sd.matches("[0-9]+")) {
                    Long n = Long.parseLong(sd);

                    // Print the number of 2s that divide n
                    while (n % 2 == 0) {
                        s1 = s1 + 2 + ", ";
                        n /= 2;
                    }

                    // n must be odd at this point. So we can
                    // skip one element (Note i = i +2)
                    for (long i = 3; i <= Math.sqrt(n); i += 2) {
                        // While i divides n, print i and divide n
                        while (n % i == 0) {
                            s1 = s1 + i + ", ";
                            n /= i;
                        }
                    }

                    // This condition is to handle the case whien
                    // n is a prime number greater than 2
                    if (n > 2)
                        s1 = s1 + n;
                }
                else
                    s1 ="Enter a number you moron";
                resp.setText(s1);
            }
        });
    }
}
