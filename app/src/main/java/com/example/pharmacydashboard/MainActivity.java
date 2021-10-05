package com.example.pharmacydashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //ImageButton btn = (ImageButton) findViewById(R.id.med);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        ImageButton btn = (ImageButton) findViewById(R.id.med);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Imtent intent = new Intent(this, MedicineActivity.class);
//                startActivity(intent);
//            }
//        });

    }
}