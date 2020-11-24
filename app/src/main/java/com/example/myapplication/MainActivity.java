package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button logInButton;
    private TextView forgotPassword;
    private TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.emailaddress);
        password=findViewById(R.id.password);
        forgotPassword=findViewById(R.id.forgotPassword);
        register=findViewById(R.id.register);
        //calling logging in method
        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //primitive code of login
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("password")){
                    openProfilePage();
                }else{
                    Toast.makeText(getApplicationContext(),"Invalid Username or Password.\nPlease Try again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //calling register method
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegisterPage();
            }
        });
        //calling forgot password method
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openForgotPasswordPage();
            }
        });

    }

    //method for opening profile page after succesfully logging in
    public void openProfilePage(){
        Intent intent=new Intent(this, ProfilePage.class);
        startActivity(intent);
    }

    //method for opening forgot password page
    public void openForgotPasswordPage(){
        Intent intent=new Intent(this, ForgotPasswordPage.class);
        startActivity(intent);
    }

    public void openRegisterPage(){
        Intent intent=new Intent(this, RegistrationPage.class);
        startActivity(intent);
    }

}