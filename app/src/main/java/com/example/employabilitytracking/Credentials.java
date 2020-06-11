package com.example.employabilitytracking;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Credentials extends AppCompatActivity {
 private Button next;

EditText  b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credentials);
        next = (Button)findViewById(R.id.button);
        b1=findViewById(R.id.editText27);
        b2=findViewById(R.id.nameid);
        b3=findViewById(R.id.addressid);
        b4=findViewById(R.id.cityid);
        b5=findViewById(R.id.districtid);
        b6=findViewById(R.id.editText);

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
                }
                else if(b6.length()==0)
                {
                    b6.setError("field cannot be empty");
                }
                else {

                    Decider.name1=b1.getText().toString();
                    Decider.village1=b2.getText().toString() ;
                    Decider.block1=b3.getText().toString();
                    Decider.mandal1=b4.getText().toString();
                    Decider.resadd1=b5.getText().toString();
                    Decider.phone1=b6.getText().toString();
                    Intent i = new Intent(Credentials.this, courseDET.class);
                    startActivity(i);
                }
            }
        });
    }
}
