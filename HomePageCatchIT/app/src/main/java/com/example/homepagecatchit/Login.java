package com.example.homepagecatchit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btn_Register = (Button)findViewById(R.id.Register);
        Button btn_Login = (Button)findViewById(R.id.Login);
        final DataBase_Helper Add_User =  new DataBase_Helper(this);
        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Register();
            }
        });
        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText Email = (EditText)findViewById(R.id.Email);
                EditText PassWord = (EditText)findViewById(R.id.Password);
                if(Email.getText().toString().equals("admin" )&& PassWord.getText().toString().equals("admin")){
                    Intent outerIntent = new Intent(Login.this, admin_insert.class);
                    startActivity(outerIntent);
                }else {

                    Cursor user = Add_User.User_found();
                    boolean check = false;
                    while (!user.isAfterLast()) {
                        if (user.getString(1).equals(Email.getText().toString()) && user.getString(2).equals(PassWord.getText().toString())) {
                            open_HomePage();
//                    Toast.makeText(Login_Activity.this, user.getString(0)+ " "  + user.getString(1) + " " +user.getString(2), Toast.LENGTH_SHORT).show();
                            Toast.makeText(Login.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                            check = true;
                            break;
                        }
                        user.moveToNext();
                    }
                    if (!check)
                        Toast.makeText(Login.this, "This user not Found", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    void open_HomePage()
    {
        Intent intent = new Intent(this ,MainActivity.class);
        startActivity(intent);
    }
    void open_Login()
    {
        Intent intent = new Intent(this ,Login.class);
        startActivity(intent);
    }
    void open_Register()
    {
        Intent intent = new Intent(this ,Register.class);
        startActivity(intent);
    }
    }
