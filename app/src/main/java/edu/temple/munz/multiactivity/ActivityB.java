package edu.temple.munz.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    Button buttonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        buttonB = findViewById(R.id.buttonB);

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start Activity A
                Intent startActivityIntent = new Intent(ActivityB.this, ActivityA.class);
                startActivity(startActivityIntent);

            }
        });


    }

}
