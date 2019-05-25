package com.example.parkingapp;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.PriorityQueue;

public class Booking extends AppCompatActivity implements AdapterView.OnItemSelectedListener, DatePickerDialog.OnDateSetListener {


    Spinner spinner;

    TextView textView, textStartTime, textEndTime;
    Calendar c;
    int hour, min;
    private TimePickerDialog timePickerDialog;
    String a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        spinner = (Spinner) findViewById(R.id.spinner);
        textView = (TextView) findViewById(R.id.textCalender);

        textStartTime = (TextView) findViewById(R.id.textStartTime);
        textEndTime = (TextView) findViewById(R.id.textEndTime);


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(),"date picker");
            }
        });

        textStartTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = Calendar.getInstance ();
                hour = c.get (Calendar.HOUR_OF_DAY);
                min = c.get (Calendar.MINUTE);

                timePickerDialog = new TimePickerDialog (Booking.this, new TimePickerDialog.OnTimeSetListener ( ) {
                    @Override
                    public void onTimeSet(android.widget.TimePicker timePicker, int i, int i1) {
                        a =  i+":"+i1;
                        textStartTime.setText (a);
                    }

                },hour,min,false);

                timePickerDialog.show ();

            }
        });

        textEndTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = Calendar.getInstance ( );
                hour = c.get (Calendar.HOUR_OF_DAY);
                min = c.get (Calendar.MINUTE);

                timePickerDialog = new TimePickerDialog (Booking.this, new TimePickerDialog.OnTimeSetListener ( ) {
                    @Override
                    public void onTimeSet(android.widget.TimePicker timePicker, int i, int i1) {
                        b=i+":"+i1;
                        textEndTime.setText (b);
                    }

                }, hour, min, false);

                timePickerDialog.show ();
            }
        });

        ArrayAdapter<CharSequence> adapter =  ArrayAdapter.createFromResource(this,R.array.vehicles_type,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String test = parent.getItemAtPosition(position).toString();
        Toast.makeText(getApplicationContext(),test,Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);

        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        textView.setText(currentDateString);



    }


}
