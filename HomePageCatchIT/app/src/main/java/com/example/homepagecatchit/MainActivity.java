package com.example.homepagecatchit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button cartBtn,profileBtn,shopBtn,offersBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cartBtn=(Button) findViewById(R.id.cart);
        profileBtn=(Button) findViewById(R.id.profile);
        shopBtn=(Button) findViewById(R.id.shop);
        offersBtn=(Button) findViewById(R.id.offers);

        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent=Intent(MainActivity.this,);
                System.out.println("cart");
            }
        });

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Account.class);
                startActivity(intent);

            }
        });
        shopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ListOfDepartments.class);
                startActivity(intent);
            }
        });
        offersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, Offers.class);
                startActivity(intent);
            }
        });
    }

}