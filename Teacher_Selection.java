package com.example.s_selection;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter arrayAdapter= new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.names));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(arrayAdapter);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity2Query();
            }
        });

    }

    private void openMainActivity2Query() {
        Intent intent = new Intent(this , MainActivity2Query.class);
        startActivity(intent);
    }

}
