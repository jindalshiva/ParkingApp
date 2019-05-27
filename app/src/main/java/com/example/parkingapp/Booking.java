package com.example.parkingapp;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.PriorityQueue;

public class Booking extends AppCompatActivity implements AdapterView.OnItemSelectedListener, DatePickerDialog.OnDateSetListener, Bottom_Sheet.BottomSheetListner {


    Spinner spinner;

    TextView textView, textStartTime, textEndTime;
    Calendar c;
    int hour, min;
    private TimePickerDialog timePickerDialog;
    String a,b;
    private FirebaseDatabase mFirebaseDatabase;
    private FirebaseAuth.AuthStateListener mAuthListener;
    Button buttonSubmit;
    DatabaseReference databaseReference;
    private String uid;
    private FirebaseAuth mAuth;
    EditText editvehicleNo;
    String slote;
    AlertDialog.Builder builder;
    int hrStart, hrEnd;
    int schedule;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        builder = new AlertDialog.Builder(this);

        spinner = (Spinner) findViewById(R.id.spinner);
        editvehicleNo = (EditText) findViewById(R.id.editVehicleNo);

        textView = (TextView) findViewById(R.id.textCalender);

        textStartTime = (TextView) findViewById(R.id.textStartTime);
        textEndTime = (TextView) findViewById(R.id.textEndTime);

        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);


        mAuth = FirebaseAuth.getInstance();
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        uid = mAuth.getCurrentUser().getUid();
        Toast.makeText (getApplicationContext (),"id: " + uid,Toast.LENGTH_SHORT).show ();

        databaseReference = FirebaseDatabase.getInstance ().getReference (uid);


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
                        hrStart = i + i1/60;
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
                        hrEnd = i + i1/60;
                        textEndTime.setText (b);
                    }

                }, hour, min, false);

                timePickerDialog.show ();
            }
        });

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bottom_Sheet bottom_sheet = new Bottom_Sheet();
                bottom_sheet.show(getSupportFragmentManager(),"Bottom Sheet");
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


    @Override
    public void onButtonClicked(final String text) {
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();
        slote = text;



        builder.setMessage("Are you sure ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        Toast.makeText(getApplicationContext(),"you choose yes action for alertbox",
                                Toast.LENGTH_SHORT).show();
                        BookingInformation();
                        //Intent intent = new Intent(Booking.this,MapsActivity.class);
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                Uri.parse("geo:0,0?q=28.614687,77.279221 "));
                        startActivity(intent);

                        //startActivity(intent);

//                        if(text.equals("Slot 1")) {
//                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Taronga+Zoo,+Sydney+Australia");
//                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//                            mapIntent.setPackage("com.google.android.apps.maps");
//                            startActivity(mapIntent);
//                        }

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //  Action for 'NO' Button
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(),"you choose no action for alertbox",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        //Creating dialog box
        AlertDialog alert = builder.create();
        //Setting the title manually
        alert.setTitle("AlertDialogExample");
        alert.show();
    }


    public void sendNotification() {


        String slot = slote.toString();
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this);

        //Create the intent that’ll fire when the user taps the notification//

        Intent intent = new Intent(this,Notification.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        mBuilder.setContentIntent(pendingIntent);
        mBuilder.setColor(Color.BLUE);
        Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        mBuilder.setSound(alarmSound);

        mBuilder.setPriority(NotificationManager.IMPORTANCE_HIGH);
        mBuilder.setContentTitle("Car Parking");
        mBuilder.setSmallIcon(R.drawable.noti);
        mBuilder.setContentText(slot);

        schedule =hrEnd - hrStart;
        int bookingSchedule = 20;

       // mBuilder.setContentText(slot + " "+schedule);

        mBuilder.setContentText(slot + " " + a +" - "+ b + " Schedule: " + schedule + " Normal Charges: "
                + schedule*10 + " Booking Charges: " + bookingSchedule +
                " Total Charges: " + (schedule*10)+bookingSchedule );

        NotificationManager mNotificationManager =

                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.notify(100, mBuilder.build());
    }

    public void BookingInformation() {


        String vehicleType = spinner.getSelectedItem().toString().trim();
        String vehicleNo = editvehicleNo.getText().toString().trim();
        String id = databaseReference.push ().getKey ();
        String date = textView.toString();
        String startTym = textStartTime.toString();
        String endTym = textEndTime.toString();
        String slot = slote.toString();
        schedule =hrEnd - hrStart;
        Booking_Information booking_information = new Booking_Information(vehicleType,vehicleNo,slot,id,date,a,b,schedule);

        databaseReference.child(id).setValue (booking_information);

        Toast.makeText (this, "Booking Information added",Toast.LENGTH_LONG).show ();

        sendNotification();


        





    }
}
