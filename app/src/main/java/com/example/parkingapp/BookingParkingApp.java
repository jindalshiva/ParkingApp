package com.example.parkingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BookingParkingApp extends AppCompatActivity {

    TextView text;
    Animation top;
    RelativeLayout rel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_parking_app);

        text = (TextView) findViewById(R.id.textBooking);
        top = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        text.startAnimation(top);

        rel = (RelativeLayout) findViewById(R.id.relLayout);
        rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookingParkingApp.this, Choice.class);
                startActivity(intent);
            }
        });


    }
}
