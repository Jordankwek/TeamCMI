package com.example.teamcmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class SignUpActivity extends AppCompatActivity {

    EditText registerName, registerEmail, registerPwd, registerCPwd;
    TextView signInText;
    TextInputLayout viewPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();

        //Retrieve user input for name
        registerName = findViewById(R.id.signUpName);

        //Retrieve user input for email
        registerEmail = findViewById(R.id.signInEmail);

        //Retrieve user input for password
        registerPwd = findViewById(R.id.signUpPassword);

        //Retrieve user input for confirm password
        registerCPwd = findViewById(R.id.signUpCPassword);

        //Text to go to register page
        signInText = findViewById(R.id.existingUserTxt);

        //Icon for password toggle
        viewPwd = findViewById(R.id.viewCPwd);

        signInText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });

       /* viewPwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(registerCPwd.getText().toString().isEmpty())
                {
                    registerCPwd.setHint("Confirm Password");
                }
                else {
                    registerCPwd.setHint("");
                }
            }
        });
*/
    }

    //Prevent activity from stacking
    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}