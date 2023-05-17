package com.example.homepagecatchit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Strach extends AppCompatActivity {
    int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strach);


        //Add
        Button add1=(Button)findViewById(R.id.precise_add1);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count1++;
                Dairy.mp.put(R.id.precise1,count1);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        Button add2=(Button)findViewById(R.id.rice_add);
        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count2++;
                Dairy.mp.put(R.id.rice,count2);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        Button add3=(Button)findViewById(R.id.lentil_add);
        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count3++;
                Dairy.mp.put(R.id.lentil,count3);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        Button add4=(Button)findViewById(R.id.starch_add);
        add4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count4++;
                Dairy.mp.put(R.id.starch,count4);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        Button add5=(Button)findViewById(R.id.pasta_add);
        add5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count5++;
                Dairy.mp.put(R.id.pasta,count5);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        Button add6=(Button)findViewById(R.id.spaghetti_add);
        add6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count6++;
                Dairy.mp.put(R.id.spaghetti,count6);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });

        //Remove
        Button remove1=(Button)findViewById(R.id.precise_remove1);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count1 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count1 > 0) {
                    count1--;
                    Dairy.mp.put(R.id.precise1,count1);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove2=(Button)findViewById(R.id.rice_remove);
        remove2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count2 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count2 > 0) {
                    count2--;
                    Dairy.mp.put(R.id.rice,count2);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove3=(Button)findViewById(R.id.lentil_remove);
        remove3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count3 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "You don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count3 > 0) {
                    count3--;
                    Dairy.mp.put(R.id.lentil,count3);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove4=(Button)findViewById(R.id.starch_remove);
        remove4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count4 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count4 > 0) {
                    count4--;
                    Dairy.mp.put(R.id.starch,count4);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove5=(Button)findViewById(R.id.pasta_remove);
        remove5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count5 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count5 > 0) {
                    count5--;
                    Dairy.mp.put(R.id.pasta,count5);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove6=(Button)findViewById(R.id.spaghetti_remove);
        remove6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count6 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count6 > 0) {
                    count6--;
                    Dairy.mp.put(R.id.spaghetti,count6);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}