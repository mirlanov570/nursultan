package com.example.meny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText sName,names,patronymic,ages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        sName = findViewById(R.id.surname);
        names = findViewById(R.id.name);
        patronymic = findViewById(R.id.patr);
        ages = findViewById(R.id.age);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String surname = sName.getText().toString();
                String name = names.getText().toString();
                String patr = patronymic.getText().toString();
                String age = ages.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("s",surname);
                intent.putExtra("n", name);
                intent.putExtra("p",patr);
                intent.putExtra("a",age);
                startActivity(intent);
            }
        });


    }
}