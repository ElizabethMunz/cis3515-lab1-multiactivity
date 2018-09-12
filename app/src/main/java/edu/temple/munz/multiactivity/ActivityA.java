package edu.temple.munz.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    Button buttonA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonA = findViewById(R.id.buttonA);

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start activityB
                Intent startActivityIntent = new Intent(ActivityA.this, ActivityB.class);
                startActivity(startActivityIntent);
            }
        });

    }
}
