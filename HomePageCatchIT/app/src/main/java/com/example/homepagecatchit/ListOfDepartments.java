package com.example.homepagecatchit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListOfDepartments extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_departments);

        listView=(ListView)findViewById(R.id.listOfDepartments);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Bakery");
        arrayList.add("Beverages");
        arrayList.add("Cleaning & HouseHold");
        arrayList.add("Fish & SeaFood");
        arrayList.add("Fruit");
        arrayList.add("Meat");
        arrayList.add("Milk & Dairy Foods");
        arrayList.add("Packaged");
        arrayList.add("Vegetables");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Intent intent=new Intent(MainActivity.this,)
                final String text =  ((TextView)view).getText().toString();
                System.out.println(text);
                if(text=="Bakery")
                {
                    Intent i1=new Intent(ListOfDepartments.this,breads.class);
                    startActivity(i1);
                }
                else if(text=="Beverages")
                {
                    Intent i2=new Intent(ListOfDepartments.this,Bevarages.class);
                    startActivity(i2);
                }
                else if(text=="Cleaning & HouseHold")
                {
                    Intent i3=new Intent(ListOfDepartments.this,Cleaning.class);
                    startActivity(i3);
                }
                else if(text=="Fish & SeaFood")
                {
                    Intent i4=new Intent(ListOfDepartments.this,Fish.class);
                    startActivity(i4);
                }
                else if(text=="Fruit")
                {
                    Intent i5=new Intent(ListOfDepartments.this,Friut.class);
                    startActivity(i5);
                }


                else if(text=="Meat")
                {
                    Intent i6=new Intent(ListOfDepartments.this,Meat.class);
                    startActivity(i6);
                }
                else if(text=="Milk & Dairy Foods")
                {
                    Intent i7=new Intent(ListOfDepartments.this,Dairy.class);
                    startActivity(i7);
                    //System.out.println("slawen");
                }
                else if(text=="Packaged")
                {
                    Intent i8=new Intent(ListOfDepartments.this,Strach.class);
                    startActivity(i8);
                }
                else if(text=="Vegetables")
                {
                    Intent i9=new Intent(ListOfDepartments.this,Vegetables.class);
                    startActivity(i9);
                }


            }
        });
    }
}