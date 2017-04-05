package com.example.shashankverma.upes_ai_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;

public class Sign_Up extends AppCompatActivity {


       EditText editTextSignUpName;
       EditText editTextSignUpEmail;
       Spinner spinnerBranch;
       EditText editTextYear;
       EditText editTextEnterMobileNo;
       Button buttonSubmit;

     DatabaseReference databaseContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);
        databaseContact= FirebaseDatabase.getInstance().getReference("Contacts");


        editTextSignUpName = (EditText) findViewById(R.id.editTextSignUpName);
        editTextSignUpEmail = (EditText) findViewById(R.id.editTextSignUpEmail);
        editTextYear = (EditText) findViewById(R.id.editTextYear);
        editTextEnterMobileNo= (EditText) findViewById(R.id.editTextSignUpMobileNo);

        spinnerBranch = (Spinner) findViewById(R.id.spinnerBranch);
         buttonSubmit = (Button) findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    SignUp();
            }
        });

    }

    private void SignUp()
    {
        String name= editTextSignUpName.getText().toString();
        String email = editTextSignUpEmail.getText().toString();
        String branch =spinnerBranch.getSelectedItem().toString();
        String year =editTextYear.getText().toString();
        String mobileNumber = editTextEnterMobileNo.getText().toString();
        //If the fields are not empty , store it in  firebase database
        if(!TextUtils.isEmpty(name)&& !TextUtils.isEmpty(email) && !TextUtils.isEmpty(branch)
                &&!TextUtils.isEmpty(year) &&
                !TextUtils.isEmpty(mobileNumber))
        {


            String id =databaseContact.push().getKey();   // Create a unique String Id

            Contact addContact = new Contact(id,email,name,branch,year,mobileNumber);


            databaseContact.child(id).setValue(addContact);



           Toast.makeText(this,"Sign Up Completed",Toast.LENGTH_LONG).show();

               Intent i2 = new Intent();
                  finish();
           Toast.makeText(this,"Now You Can Log In",Toast.LENGTH_LONG).show();


        }

        //otherwise
        else

        {

            Toast.makeText(this,"Enter details to complete SignUp",Toast.LENGTH_LONG).show();
        }




    }



}
