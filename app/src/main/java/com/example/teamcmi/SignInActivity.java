package com.example.teamcmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    EditText loginEmail, loginPassword;
    Button loginBtn;
    TextView signUpText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().hide();

        //Retrieve user input for email
        loginEmail = findViewById(R.id.signUpEmail);

        //Retrieve user input for password
        loginPassword = findViewById(R.id.signInPassword);

        //Button to login
        loginBtn = findViewById(R.id.loginBtn);

        //Text to go to register page
        signUpText = findViewById(R.id.signUpTxt);

        signUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    //Prevent activity from stacking
    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}