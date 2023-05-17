package com.example.homepagecatchit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class breads extends AppCompatActivity {

    int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breads);



        //Add
        Button add1=(Button)findViewById(R.id.bread_add1);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count1++;
                Dairy.mp.put(R.id.bread1,count1);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        Button add2=(Button)findViewById(R.id.fino_add1);
        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count2++;
                Dairy.mp.put(R.id.fino1,count2);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        Button add3=(Button)findViewById(R.id.kaizer_add1);
        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count3++;
                Dairy.mp.put(R.id.kaizer1,count3);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        Button add4=(Button)findViewById(R.id.toast_add1);
        add4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count4++;
                Dairy.mp.put(R.id.toast1,count4);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        Button add5=(Button)findViewById(R.id.donuts_add1);
        add5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count5++;
                Dairy.mp.put(R.id.donuts1,count5);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        Button add6=(Button)findViewById(R.id.pastries_add1);
        add6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count6++;
                Dairy.mp.put(R.id.pastries1,count6);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });

        //Remove
        Button remove1=(Button)findViewById(R.id.bread_remove1);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count1 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count1 > 0) {
                    count1--;
                    Dairy.mp.put(R.id.bread1,count1);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove2=(Button)findViewById(R.id.fino_remove1);
        remove2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count2 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count2 > 0) {
                    count2--;
                    Dairy.mp.put(R.id.fino1,count2);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove3=(Button)findViewById(R.id.kaizer_remove1);
        remove3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count3 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "You don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count3 > 0) {
                    count3--;
                    Dairy.mp.put(R.id.kaizer1,count3);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove4=(Button)findViewById(R.id.toast_remove1);
        remove4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count4 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count4 > 0) {
                    count4--;
                    Dairy.mp.put(R.id.toast1,count4);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove5=(Button)findViewById(R.id.donuts_remove1);
        remove5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count5 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count5 > 0) {
                    count5--;
                    Dairy.mp.put(R.id.donuts1,count5);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove6=(Button)findViewById(R.id.pastries_remove1);
        remove6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count6 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count6 > 0) {
                    count6--;
                    Dairy.mp.put(R.id.pastries1,count6);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}