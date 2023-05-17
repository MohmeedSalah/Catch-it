package com.example.homepagecatchit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class admin_delete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_delete);
    }
    public void onClickSubmit(View view) {
        EditText tableName = findViewById(R.id.tableNameEdit);
        EditText id = findViewById(R.id.idEdit);


        DataBase_Helper db = new DataBase_Helper(this);
        db.deleteData(tableName.getText().toString(), Integer.valueOf(id.getText().toString()));

    }

    public void onClickInsert(View view) {


        Intent outerIntent  = new Intent(this, admin_insert.class);
        startActivity(outerIntent);



    }
}