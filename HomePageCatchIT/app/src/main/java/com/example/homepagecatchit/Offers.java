package com.example.homepagecatchit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Offers extends AppCompatActivity {

    Button button7, btn1 , btn2 , btn3 , btn4 , btn5 , btn6 ;
    int cnt1=0,cnt2=0,cnt3=0,cnt4=0,cnt5=0,cnt6=0,cnt7=0,cnt8=0,cnt9=0,cnt10=0,cnt11=0,cnt12=0;
    ScrollView sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);

        sv=findViewById(R.id.verscroll);

        btn1= findViewById(R.id.button1);
        btn2= findViewById(R.id.button2);
        btn3= findViewById(R.id.button3);
        btn4= findViewById(R.id.button4);
        btn5= findViewById(R.id.button5);
        btn6= findViewById(R.id.button6);
        button7= findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Meat=(TextView)findViewById(R.id.tex5);

                sv.scrollTo(0,Meat.getTop());

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView HB=(TextView)findViewById(R.id.tex1);

                sv.scrollTo(0,HB.getTop());

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView sp=(TextView)findViewById(R.id.tex2);

                sv.scrollTo(0,sp.getTop());

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView MD=(TextView)findViewById(R.id.tex4);

                sv.scrollTo(0,MD.getTop());

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView B=(TextView)findViewById(R.id.tex3);

                sv.scrollTo(0,B.getTop());

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView CH=(TextView)findViewById(R.id.tex7);

                sv.scrollTo(0,CH.getTop());

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView FF=(TextView)findViewById(R.id.tex6);

                sv.scrollTo(0,FF.getTop());

            }
        });
        //Add
        Button add1=(Button)findViewById(R.id.btn1SP1);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt1++;
                Dairy.mp.put(R.id.SP1,cnt1);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        //Remove
        Button remove1=(Button)findViewById(R.id.btn2SP1);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnt1 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (cnt1 > 0) {
                    cnt1--;
                    Dairy.mp.put(R.id.SP1,cnt1);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button add2=(Button)findViewById(R.id.btn1SP2);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt2++;
                Dairy.mp.put(R.id.SP2,cnt2);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        //Remove
        Button remove2=(Button)findViewById(R.id.btn2SP2);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnt2 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (cnt2 > 0) {
                    cnt2--;
                    Dairy.mp.put(R.id.SP2,cnt2);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button add3=(Button)findViewById(R.id.btn1BK1);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt3++;
                Dairy.mp.put(R.id.BK1,cnt3);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        //Remove
        Button remove3=(Button)findViewById(R.id.btn2BK1);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnt3== 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (cnt3 > 0) {
                    cnt3--;
                    Dairy.mp.put(R.id.BK1,cnt3);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button add4=(Button)findViewById(R.id.btn1BK2);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt4++;
                Dairy.mp.put(R.id.BK2,cnt4);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        //Remove
        Button remove4=(Button)findViewById(R.id.btn2BK2);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnt4== 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (cnt4 > 0) {
                    cnt4--;
                    Dairy.mp.put(R.id.BK2,cnt4);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button add5=(Button)findViewById(R.id.btn1MD1);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt5++;
                Dairy.mp.put(R.id.MD1,cnt5);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        //Remove
        Button remove5=(Button)findViewById(R.id.btn2MD1);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnt5== 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (cnt5 > 0) {
                    cnt5--;
                    Dairy.mp.put(R.id.MD1,cnt5);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button add6=(Button)findViewById(R.id.btn1MD2);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt6++;
                Dairy.mp.put(R.id.MD2,cnt6);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        //Remove
        Button remove6=(Button)findViewById(R.id.btn2MD2);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnt6== 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (cnt6 > 0) {
                    cnt6--;
                    Dairy.mp.put(R.id.MD2,cnt6);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button add7=(Button)findViewById(R.id.btn1M1);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt7++;
                Dairy.mp.put(R.id.M1,cnt7);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        //Remove
        Button remove7=(Button)findViewById(R.id.btn2M1);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnt7== 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (cnt7 > 0) {
                    cnt7--;
                    Dairy.mp.put(R.id.M1,cnt7);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button add8=(Button)findViewById(R.id.btn1M2);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt8++;
                Dairy.mp.put(R.id.M2,cnt8);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        //Remove
        Button remove8=(Button)findViewById(R.id.btn2M2);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnt8== 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (cnt8 > 0) {
                    cnt8--;
                    Dairy.mp.put(R.id.M2,cnt8);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button add9=(Button)findViewById(R.id.btn1FS1);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt9++;
                Dairy.mp.put(R.id.FS1,cnt9);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        //Remove
        Button remove9=(Button)findViewById(R.id.btn2FS1);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnt9== 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (cnt9 > 0) {
                    cnt9--;
                    Dairy.mp.put(R.id.FS1,cnt9);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button add10=(Button)findViewById(R.id.btn1FS2);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt10++;
                Dairy.mp.put(R.id.FS2,cnt10);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        //Remove
        Button remove10=(Button)findViewById(R.id.btn2FS2);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnt10== 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (cnt10 > 0) {
                    cnt10--;
                    Dairy.mp.put(R.id.FS2,cnt10);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button add11=(Button)findViewById(R.id.btn1CH1);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt11++;
                Dairy.mp.put(R.id.CH1,cnt11);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        //Remove
        Button remove11=(Button)findViewById(R.id.btn2CH1);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnt11== 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (cnt11 > 0) {
                    cnt11--;
                    Dairy.mp.put(R.id.CH1,cnt11);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });
        Button add12=(Button)findViewById(R.id.btn1CH2);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt12++;
                Dairy.mp.put(R.id.CH2,cnt12);
                Toast.makeText(getApplicationContext(),
                        "One piece added to your car",Toast.LENGTH_LONG).show();
            }
        });
        //Remove
        Button remove12=(Button)findViewById(R.id.btn2CH2);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnt12== 0) {
                    Toast.makeText(getApplicationContext(),
                            "you don't have one in your car", Toast.LENGTH_LONG).show();
                }
                else if (cnt12 > 0) {
                    cnt12--;
                    Dairy.mp.put(R.id.CH2,cnt12);
                    Toast.makeText(getApplicationContext(),
                            "One piece removed from your car", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}