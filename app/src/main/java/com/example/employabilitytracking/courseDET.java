package com.example.employabilitytracking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class courseDET extends AppCompatActivity {
private LinearLayout l;
private Button b,b23;
private EditText t,b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_d_e_t);
        l=(LinearLayout)findViewById(R.id.ap1);
        t=(EditText)findViewById(R.id.editText8);
        b=(Button)findViewById(R.id.button7);
        b23=(Button)findViewById(R.id.ip5);
         b1=findViewById(R.id.editText3);
        b2 = findViewById(R.id.editText41);
        b3 = findViewById(R.id.editText42);
        b4 = findViewById(R.id.editText43);
     b.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             if(t.getText().toString().length()>0) {
                 try {
                     l.removeAllViews();
                 } catch (Throwable e)
                 {
                     e.printStackTrace();
                 }
                 int len= Integer.parseInt(t.getText().toString());
                 for(int i=0;i<len;i++)
                 {
                     EditText t = new EditText(courseDET.this);
                     t.setId(i+1);
                     t.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                      t.setHint("Course NAME");
                      l.addView(t);
                 }

             }

         }
     });
     b23.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             if (t.length() == 0) {
                 t.setError("field cannot be empty");
             } else if (b2.length() == 0) {
                 b2.setError("field cannot be empty");
             } else if (b3.length() == 0) {
                 b3.setError("field cannot be empty");
             } else if (b4.length() == 0) {
                 b4.setError("field cannot be empty");
             } else {
                 Decider.courseno1=t.getText().toString();
                 Decider.coursename1=b1.getText().toString();
                 Decider.centername1=b2.getText().toString();
                 Decider.centeradd1=b3.getText().toString();
                 Decider.centerid1=b4.getText().toString();
                 Intent i = new Intent(courseDET.this, place.class);
                 startActivity(i);
             }
         }
     });
    }
}
