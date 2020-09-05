package com.parkererickson.wk02hw01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText username, password;


    public boolean usernamesMatch(String username){
        if(username.equals("Admin")){
            return true;
        }else {
            return false;
        }
    }

    public boolean passwordsMatch(String password){
        if(password.equals("Admin")){
            return true;
        }else {
            return false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button)findViewById(R.id.btnLogin);
        username = (EditText)findViewById(R.id.etUsername);
        password = (EditText)findViewById(R.id.etPassword);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usernamesMatch(username.getText().toString()) &&
                        passwordsMatch(password.getText().toString())){
                    Intent intent = new Intent(SecondActivity.getIntent(MainActivity.this));
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong username or password.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}