package com.example.homepagecatchit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class admin_insert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_insert);
    }
    public void onClickSubmit(View view) {
        EditText name = (EditText) findViewById(R.id.userNameEdit);
        EditText price = (EditText) findViewById(R.id.priceEdit);
        EditText type = (EditText) findViewById(R.id.typeEdit);
        EditText imageId = (EditText) findViewById(R.id.imageIdEdit);

        DataBase_Helper db = new DataBase_Helper(this);
        db.insertProduct(name.getText().toString(),Integer.parseInt(price.getText().toString()),
                type.getText().toString(), Integer.parseInt(imageId.getText().toString()));
        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();

    }

    public void onClickDelete(View view) {
        Intent outerIntent = new Intent(this, admin_delete.class);
        startActivity(outerIntent);


    }
}