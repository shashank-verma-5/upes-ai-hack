package com.example.shashankverma.upes_ai_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


      EditText editTextEmail;
      EditText editTextPassword;

       Button buttonSignUp;

       /*
                 Facebook, GitHub,  Google+

        */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       buttonSignUp = (Button) findViewById(R.id.buttonSignUp);

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1=new Intent(MainActivity.this,Sign_Up.class);

                startActivityForResult(i1,-1);




            }
        });




    }



}


