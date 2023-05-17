package com.example.homepagecatchit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;

public class Dairy extends AppCompatActivity {
    int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;
    public static  HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy);

        mp.put(6,6);
        //Add
        Button add1=(Button)findViewById(R.id.milk_add);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count1++;
                mp.put(R.id.milk,count1);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
                System.out.println(mp.get(R.id.milk));
                            }
        });
        Button add2=(Button)findViewById(R.id.yogurt_add);
        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count2++;
                mp.put(R.id.yogurt,count2);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        Button add3=(Button)findViewById(R.id.butter_add);
        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count3++;
                mp.put(R.id.butter,count3);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        Button add4=(Button)findViewById(R.id.yoghurtrice_add);
        add4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count4++;
                mp.put(R.id.imageView7,count4);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        Button add5=(Button)findViewById(R.id.wh_cheese_add);
        add5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count5++;
                mp.put(R.id.wh_cheese,count5);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        Button add6=(Button)findViewById(R.id.ch_cheese_add);
        add6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count6++;
                mp.put(R.id.ch_cheese,count6);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });

        //Remove
        Button remove1=(Button)findViewById(R.id.milk_remove);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count1 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count1 > 0) {
                    count1--;
                    mp.put(R.id.milk,count1);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove2=(Button)findViewById(R.id.yogurt_remove);
        remove2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count2 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count2 > 0) {
                    count2--;
                    mp.put(R.id.yogurt,count2);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove3=(Button)findViewById(R.id.butter_remove);
        remove3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count3 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "You don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count3 > 0) {
                    count3--;
                    mp.put(R.id.butter,count3);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove4=(Button)findViewById(R.id.yoghurtrice_remove);
        remove4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count4 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count4 > 0) {
                    count4--;
                    mp.put(R.id.imageView7,count4);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove5=(Button)findViewById(R.id.wh_cheese_remove);
        remove5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count5 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count5 > 0) {
                    count5--;
                    mp.put(R.id.wh_cheese,count5);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button remove6=(Button)findViewById(R.id.ch_cheese_remove);
        remove6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count6 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (count6 > 0) {
                    count6--;
                    mp.put(R.id.ch_cheese,count6);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}