package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {

    private TextInputLayout logUser, logPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button logInB = findViewById(R.id.logInButton);
        Button signUpB = findViewById(R.id.signUpTextButton);
        logUser = findViewById(R.id.textInputLayoutUsername);
        logPassword = findViewById(R.id.textInputLayoutPassword);

        logInB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (logUser.getEditText().getText().toString().trim().isEmpty() ||
                        logPassword.getEditText().getText().toString().trim().isEmpty()){

                    Toast.makeText(Login.this, "input required", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Login.this, "Loggin...", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, Login.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        signUpB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, SignUp.class);
                startActivity(intent);
                finish();
            }
        });
    }
}