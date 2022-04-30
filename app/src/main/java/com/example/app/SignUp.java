package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class SignUp extends AppCompatActivity {

    private TextInputLayout username, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button registerB = findViewById(R.id.registerButton);
        Button signInB = findViewById(R.id.signInButton);
        username = findViewById(R.id.textInputLayoutUsername);
        email = findViewById(R.id.textInputLayoutEmail);
        password = findViewById(R.id.textInputLayoutPassword);

        registerB.setOnClickListener(v -> {

            if(Objects.requireNonNull(username.getEditText()).getText().toString().trim().isEmpty() ||
                Objects.requireNonNull(email.getEditText()).getText().toString().trim().isEmpty() ||
                    Objects.requireNonNull(password.getEditText()).getText().toString().trim().isEmpty()) {

                Toast.makeText(SignUp.this, "Input required", Toast.LENGTH_SHORT).show();
            }else {

                Toast.makeText(SignUp.this, "registered successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignUp.this, Login.class);
                startActivity(intent);
                finish();
            }
        });

        signInB.setOnClickListener(v -> {

            Intent intent = new Intent(SignUp.this, Login.class);
            startActivity(intent);
            finish();
        });
    }
}