package com.example.parkingapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.parkingapp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextName, editTextEmail, editTextPassword, editTextPhone;
    private ProgressBar progressBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        findViewById(R.id.textViewLogin).setOnClickListener(this);
        editTextName = findViewById(R.id.nameEditText);
        editTextEmail = findViewById(R.id.editEmail);
        editTextPassword = findViewById(R.id.editPassword);
        editTextPhone = findViewById(R.id.editMobile);
        progressBar = findViewById(R.id.progressbar);
        progressBar.setVisibility(View.GONE);

        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.buttonSignUp).setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (mAuth.getCurrentUser() != null) {
            //handle the already login user
        }
    }

    private void registerUser() {
        final String name = editTextName.getText().toString().trim();
        final String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        final String phone = editTextPhone.getText().toString().trim();

        if (name.isEmpty()) {
            editTextName.setError("Name is required");
            editTextName.requestFocus();
            return;
        }

        if (email.isEmpty()) {
            editTextEmail.setError("Email is required");
            editTextEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            editTextEmail.setError("Enter valid email address");
            editTextEmail.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            editTextPassword.setError("Password is required");
            editTextPassword.requestFocus();
            return;
        }

        if (password.length() < 6) {
            editTextPassword.setError("Enter valid password");
            editTextPassword.requestFocus();
            return;
        }

        if (phone.isEmpty()) {
            editTextPhone.setError("Phone number is required");
            editTextPhone.requestFocus();
            return;
        }

        if (phone.length() != 10) {
            editTextPhone.setError("Enter valid phone number");
            editTextPhone.requestFocus();
            return;
        }


        progressBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {

                            mAuth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {

                                    if(task.isSuccessful()){
                                        Users user = new Users(
                                                name,
                                                email,
                                                phone
                                        );

                                        FirebaseDatabase.getInstance().getReference("Users")
                                                .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                                .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                progressBar.setVisibility(View.GONE);
                                                if (task.isSuccessful()) {
                                                    Toast.makeText(SignUp.this, "registration_success: and check your email address", Toast.LENGTH_LONG).show();
                                                } else {
                                                    //display a failure message
                                                }
                                            }
                                        });
                                        Intent intent = new Intent(SignUp.this,Booking.class);

                                    }
                                    else
                                    {
                                        Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_LONG).show();
                                    }

                                }
                            });




                        } else {
                            Toast.makeText(SignUp.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonSignUp:
                registerUser();
                break;

            case R.id.textViewLogin:

                startActivity (new Intent(this, Choice.class));

                break;
        }
    }
}




//<Button
//        android:layout_width="100dp"
//                android:layout_height="wrap_content"
//                android:background="@drawable/slot_round"
//                android:text="slot 1"
//                android:textColor="#000000"
//                android:textStyle="bold"
//                android:layout_marginTop="40dp"
//                android:layout_marginRight="40dp"
//                android:layout_marginLeft="40dp"
//                android:id="@+id/buttonSlot1"
//                />
//<Button
//        android:layout_width="100dp"
//                android:layout_height="wrap_content"
//                android:background="@drawable/slot_round"
//                android:text="slot 2"
//                android:layout_toRightOf="@id/buttonSlot1"
//
//                android:textColor="#000000"
//                android:textStyle="bold"
//                android:layout_marginTop="40dp"
//                android:layout_marginRight="40dp"
//                android:layout_marginLeft="40dp"
//                android:id="@+id/buttonSlot2"
//                />
//<Button
//        android:layout_width="100dp"
//                android:layout_height="wrap_content"
//                android:background="@drawable/slot_round"
//                android:text="slot 3"
//                android:layout_below="@id/buttonSlot1"
//                android:textColor="#000000"
//                android:textStyle="bold"
//                android:layout_marginTop="40dp"
//                android:layout_marginRight="40dp"
//                android:layout_marginLeft="40dp"
//                android:id="@+id/buttonSlot3"
//                />
//<Button
//        android:layout_width="100dp"
//                android:layout_height="wrap_content"
//                android:background="@drawable/slot_round"
//                android:text="slot 4"
//                android:textColor="#000000"
//                android:textStyle="bold"
//                android:id="@+id/buttonSlot4"
//                android:layout_marginTop="40dp"
//                android:layout_marginRight="40dp"
//                android:layout_marginLeft="40dp"
//                android:layout_toRightOf="@id/buttonSlot3"
//                android:layout_below="@id/buttonSlot2"
//                />
//<Button
//        android:layout_width="100dp"
//                android:layout_height="wrap_content"
//                android:background="@drawable/slot_round"
//                android:text="slot 5"
//                android:textColor="#000000"
//                android:textStyle="bold"
//                android:layout_marginTop="40dp"
//                android:layout_marginRight="40dp"
//                android:layout_marginLeft="40dp"
//                android:layout_below="@id/buttonSlot3"
//                android:id="@+id/buttonSlot5"
//                />
//<Button
//        android:layout_width="100dp"
//                android:layout_height="wrap_content"
//                android:background="@drawable/slot_round"
//                android:text="slot 6"
//                android:textColor="#000000"
//                android:textStyle="bold"
//                android:id="@+id/buttonSlot6"
//                android:layout_marginTop="40dp"
//                android:layout_marginRight="40dp"
//                android:layout_marginLeft="40dp"
//                android:layout_below="@id/buttonSlot4"
//                android:layout_toRightOf="@id/buttonSlot5"
//                />
//<Button
//        android:layout_width="100dp"
//                android:layout_height="wrap_content"
//                android:background="@drawable/slot_round"
//                android:text="slot 7"
//                android:textColor="#000000"
//                android:textStyle="bold"
//                android:layout_marginTop="40dp"
//                android:layout_marginRight="40dp"
//                android:layout_marginLeft="40dp"
//                android:id="@+id/buttonSlot7"
//                android:layout_below="@id/buttonSlot5"
//                />
//<Button
//        android:layout_width="100dp"
//                android:layout_height="wrap_content"
//                android:background="@drawable/slot_round"
//                android:text="slot 8"
//                android:textColor="#000000"
//                android:textStyle="bold"
//                android:id="@+id/buttonSlot8"
//                android:layout_marginTop="40dp"
//                android:layout_marginRight="40dp"
//                android:layout_marginLeft="40dp"
//                android:layout_below="@id/buttonSlot6"
//                android:layout_toRightOf="@id/buttonSlot7"
//                />
//<Button
//        android:layout_width="100dp"
//                android:layout_height="wrap_content"
//                android:background="@drawable/slot_round"
//                android:text="slot 9"
//                android:textColor="#000000"
//                android:textStyle="bold"
//                android:id="@+id/buttonSlot9"
//                android:layout_marginTop="40dp"
//                android:layout_marginRight="40dp"
//                android:layout_marginLeft="40dp"
//                android:layout_below="@id/buttonSlot7"
//                />
//<Button
//        android:layout_width="100dp"
//                android:layout_height="wrap_content"
//                android:background="@drawable/slot_round"
//                android:text="slot 10"
//                android:textColor="#000000"
//                android:textStyle="bold"
//                android:layout_margin="40dp"
//                android:id="@+id/buttonSlot10"
//                android:layout_marginTop="40dp"
//                android:layout_marginRight="40dp"
//                android:layout_marginLeft="40dp"
//                android:layout_below="@id/buttonSlot8"
//                android:layout_toRightOf="@id/buttonSlot9"/>