package com.example.employabilitytracking;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class SelfEmpYES extends AppCompatActivity {
EditText b1;
Button b;
    private RadioGroup r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_emp_y_e_s);
        b1=findViewById(R.id.editText12);
        b=findViewById(R.id.okid);

        r=findViewById(R.id.rgid);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                RadioButton rr1 = findViewById(R.id.ip23);
                RadioButton rr2= findViewById(R.id.ip24);

                if(b1.length()==0)
                {
                    b1.setError("field should not be empty");
                }
                else
                {
                    Decider.selfyesfed1=b1.getText().toString();

                    if (rr1.isChecked()) {
                        Decider.statusRad="currently working";

                    }
                    else{
                        Decider.statusRad="Not Working";
                    }

                    Intent intent=new Intent(getApplicationContext(), Final.class);
                    startActivity(intent);

                }
            }
        });
    }
}
