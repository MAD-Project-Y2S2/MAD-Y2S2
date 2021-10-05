package com.example.products;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class AddActivity extends AppCompatActivity {

    EditText purl,name,type,description,price;
    Button btnAdd,btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        purl = (EditText)findViewById(R.id.txtImageUrl);
        name = (EditText)findViewById(R.id.txtName);
        type = (EditText)findViewById(R.id.txtType);
        description = (EditText)findViewById(R.id.txtDescription);
        price = (EditText)findViewById(R.id.txtPrice);

        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnBack = (Button)findViewById(R.id.btnBack);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertData();
                clearAll();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void insertData(){
        Map<String,Object> map = new HashMap<>();
        map.put("purl",purl.getText().toString());
        map.put("name",name.getText().toString());
        map.put("type",type.getText().toString());
        map.put("description",description.getText().toString());
        map.put("price", price.getText().toString());

        FirebaseDatabase.getInstance().getReference().child("products").push()
                .setValue(map)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Toast.makeText(AddActivity.this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(AddActivity.this, "Error Occured during insertion!", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void clearAll(){
        purl.setText("");
        name.setText("");
        type.setText("");
        description.setText("");
        price.setText("");
    }
}