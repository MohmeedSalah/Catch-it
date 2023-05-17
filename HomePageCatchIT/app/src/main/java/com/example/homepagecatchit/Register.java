package com.example.homepagecatchit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button btn_Login = (Button)findViewById(R.id.Login);
        Button btn_Register = (Button)findViewById(R.id.SignUp);
        final DataBase_Helper Add_User =  new DataBase_Helper(this);

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Login();
            }
        });
        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Name = (EditText) findViewById(R.id.Name);
                EditText Email = (EditText)findViewById(R.id.Email);
                EditText PassWord = (EditText)findViewById(R.id.Password);
                Cursor user = Add_User.User_found();
                boolean check = true ;
                while(!user.isAfterLast())
                {
                    if(user.getString(1).equals( Email.getText().toString())) {
                        Toast.makeText(Register.this, "sorry change email ", Toast.LENGTH_SHORT).show();
                        check = false ;
                        break;
                    }
                    user.moveToNext();
                }
                if(check) {
                    Add_User.insertUser(Name.getText().toString(), Email.getText().toString(), PassWord.getText().toString());
                    Toast.makeText(Register.this, "User " + Name.getText().toString() + "Register success", Toast.LENGTH_SHORT).show();
                    open_Login();
                }
                Add_User.insertUser(Name.getText().toString(), Email.getText().toString(), PassWord.getText().toString());
            }
        });
    }
    void open_Login()
    {
        Intent intent = new Intent(this ,Login.class);
        startActivity(intent);
    }
}