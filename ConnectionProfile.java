MainActivity.java
package com.example.connectionprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
EditText t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void process(View view){
    t1=(EditText)findViewById(R.id.t1);

FirebaseDatabase db =FirebaseDatabase.getInstance();
DatabaseReference root =db.getReference();

root.setValue (t1.getText().toString());
t1.setText("");
       Toast.makeText(getApplicationContext(),resid:"inserted",Toast.LENGTH_LONG).show();
}
}

activity_main.xml

# ConnectionProfile
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <EditText
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:text="@+id/t1!"
        android:layout_marginTop="100dp"
        android:hint="Enter your name"
        android:textSize="25sp"
        android:textColor="#000"
        />
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Add to database"
        android:layout_marginTop="10dp"
        android:onClick="process"
        android:textSize="25sp" />

</androidx.constraintlayout.widget.ConstraintLayout>
