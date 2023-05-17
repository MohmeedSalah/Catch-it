package com.example.homepagecatchit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class first_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button btn_Register = (Button)findViewById(R.id.Register);
        Button btn_Login = (Button)findViewById(R.id.Login);
        final DataBase_Helper Add_User =  new DataBase_Helper(this);
        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(first_activity.this, "Hahahah", Toast.LENGTH_SHORT).show();
                open_Register();
            }
        });
        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Login();
            }
        });
    }
    void open_Register()
    {
        Intent intent = new Intent(this ,Register.class);
        startActivity(intent);
    }
    //    void open_Home_page()
//    {
//        Intent intent = new Intent(this ,HomePage.class);
//        startActivity(intent);
//    }
    void open_Login()
    {
        Intent intent = new Intent(this ,Login.class);
        startActivity(intent);
    }
    }
