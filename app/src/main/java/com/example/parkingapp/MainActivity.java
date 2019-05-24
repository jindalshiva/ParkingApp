package com.example.parkingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    Animation fromLeft, rotate;
    RelativeLayout rel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.imageCar);
        rel = (RelativeLayout) findViewById(R.id.relLayout);

        fromLeft = AnimationUtils.loadAnimation(this, R.anim.lefttorigth);
//        rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        image.setAnimation(fromLeft);
//        image.setAnimation(rotate);

//        AnimationSet s = new AnimationSet(false);
//        s.addAnimation(fromLeft);
//        s.addAnimation(rotate);
//        image.startAnimation(s);s

        rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this, BookingParkingApp.class);
                startActivity(intent);

            }
        });

    }
}
