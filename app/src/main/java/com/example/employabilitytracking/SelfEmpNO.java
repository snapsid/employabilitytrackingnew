package com.example.employabilitytracking;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SelfEmpNO extends AppCompatActivity {
EditText b1,b2;

Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_emp_n_o);
        b1=findViewById(R.id.editText21);
        b2=findViewById(R.id.editText22);

        ok=findViewById(R.id.okid);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.length()==0)
                {
                    b1.setError("field cannot be empty");
                }

                else if(b2.length()==0)
                {
                    b2.setError("field cannot be empty");
                }
                else {
                    Decider.selfxp1=b1.getText().toString();
                    Decider.nworkself1=b2.getText().toString();

                    Intent intent=new Intent(getApplicationContext(), Final.class);
                    startActivity(intent);
                }
            }
        });



    }
}
