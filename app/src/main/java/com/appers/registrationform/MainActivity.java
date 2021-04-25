package com.appers.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Button regBtn = findViewById(R.id.regbtn);
        EditText edtFstName = findViewById(R.id.editTextFirstName);
        EditText edtLstName = findViewById(R.id.editTextLastName);
        EditText edtEmail = findViewById(R.id.editTextEmailId);
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName=edtFstName.getText().toString();
                String lastName=edtLstName.getText().toString();
                String emailId=edtEmail.getText().toString();
                Intent intent=new Intent(MainActivity.this,SuccessfulRegistration.class);
                intent.putExtra("keyFirstName",firstName);
                intent.putExtra("keyLastName",lastName);
                intent.putExtra("keyEmailId",emailId);
                startActivity(intent);
            }
        });
    }
}