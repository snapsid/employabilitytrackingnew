package com.example.employabilitytracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button next;

    public static String name,address,city, district, pincode,phone,email;

EditText b1,b2,b3,b4,b5,b6;
EditText b7;

    FirebaseDatabase rootnode;
    DatabaseReference ref;

    DatabaseReference mDatabaseReference;
    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mDatabaseReference= FirebaseDatabase.getInstance().getReference();

        next=(Button) findViewById(R.id.button14);

        b1 = findViewById(R.id.nameid);
        b2 = findViewById(R.id.addressid);
        b3 = findViewById(R.id.cityid);
        b4 = findViewById(R.id.districtid);
        b5 = findViewById(R.id.pincodeid);
        b6=findViewById(R.id.phoneid);
        b7=findViewById(R.id.emailid);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.length() == 0) {
                    b1.setError("field cannot be empty");
                } else if (b2.length() == 0) {
                    b2.setError("field cannot be empty");
                } else if (b3.length() == 0) {
                    b3.setError("field cannot be empty");
                } else if (b4.length() == 0) {
                    b4.setError("field cannot be empty");
                } else if (b5.length() == 0) {
                    b5.setError("field cannot be empty");
                } else {

                     name=b1.getText().toString();
                     address=b2.getText().toString();
                     city= b3.getText().toString();
                     district=b4.getText().toString();
                     pincode=b5.getText().toString();

                     phone=b6.getText().toString();

                     email=b7.getText().toString();


                    Intent intent = new Intent(MainActivity.this, VerifyPhone.class);
                    intent.putExtra("phone",phone);
                    startActivity(intent);
                }
            }
        });
    }
}
