package com.example.passingobjectbnactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {
   Button SUBMIT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SUBMIT = (Button) findViewById(R.id.SBT);

        SUBMIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Moving to Second Activity with Collected Objects - Exiting the MainActivity - Thank you", Toast.LENGTH_LONG);
                toast.show();

                Intent i = new Intent(getApplicationContext(), ObjectCollectorActivity.class);
                Studentdetails objectscollection = new Studentdetails("987654321", "PONNUSAMY", "9999999999", "kumar@abc.com" );
                i.putExtra("Studentdetails", objectscollection);
                startActivity(i);

            }
        });

    }
}