package com.appers.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SuccessfulRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_registration);
        TextView fstName=findViewById(R.id.regtxtFirstName);
        TextView lstName=findViewById(R.id.regtxtLastName);
        TextView emlId= findViewById(R.id.regtxtEmail);
        String firstName=getIntent().getStringExtra("keyFirstName");
        String lastName=getIntent().getStringExtra("keyLastName");
        String emailId=getIntent().getStringExtra("keyEmailId");
        fstName.setText(firstName);
        lstName.setText(lastName);
        emlId.setText(emailId);
    }
}