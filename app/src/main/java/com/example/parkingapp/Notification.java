package com.example.parkingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Notification extends AppCompatActivity {


    TextView textSchedule,textNormal,textBooking,textTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        int booking = 20;

        textSchedule = (TextView) findViewById(R.id.textSlotView);
        textNormal = (TextView) findViewById(R.id.textNormalCharges);
        textBooking = (TextView) findViewById(R.id.textBooking);
        textTotal = (TextView) findViewById(R.id.textTotal);



        textSchedule.setText("2 Rs");
        textNormal.setText("20 Rs");
        textBooking.setText("20 Rs");
        textTotal.setText("40 Rs");





    }
}
