package com.example.passingobjectbnactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ObjectCollectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_collector);

        Studentdetails objectscollection = (Studentdetails) getIntent().getSerializableExtra("Studentdetails");
        EditText RESULT = findViewById(R.id.RES);
        RESULT.setText(objectscollection.Id + "\n" + objectscollection.Name + "\n" + objectscollection.Contact + "\n" + objectscollection.Email);
    }
}