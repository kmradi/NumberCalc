package com.example.numbercalc;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //
    //ImageButton imgbutton3 = (ImageButton) findViewById(R.id.MyButton3);
    //Button button,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imgbutton =  findViewById(R.id.MyButton);
        ImageButton imgbutton2 =  findViewById(R.id.MyButton2);
        ImageButton imgbutton3 =  findViewById(R.id.MyButton3);
        ImageButton imgbutton4 =  findViewById(R.id.MyButton4);

        imgbutton.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(MainActivity.this,
                        Main2Activity.class);
                startActivity(myIntent);
            }
        });

        //imgbutton2 = (ImageButton) findViewById(R.id.MyButton2);
        imgbutton2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent;
                myIntent = new Intent(MainActivity.this,
                        Main3Activity.class);
                startActivity(myIntent);
            }
        });

        //imgbutton3 = (ImageButton) findViewById(R.id.MyButton3);
        imgbutton3.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent;
                myIntent = new Intent(MainActivity.this,
                        Main4Activity.class);
                startActivity(myIntent);
            }
        });

        imgbutton4.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent;
                myIntent = new Intent(MainActivity.this,
                        Main5Activity.class);
                startActivity(myIntent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menufile, menu);
        return true;
    }
}
