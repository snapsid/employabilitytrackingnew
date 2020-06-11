package com.example.employabilitytracking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class FinalEmployer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_employer);

       DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("employer").child(Decider.phone2);


        Map review=new HashMap<>();

        if(Decider.stillemp.equals("yes"))
        {
            review.put("feedback",  Decider.empfedyes2);
            review.put("reason for selecting", Decider.reasforsel2);
        }

        if(Decider.stillemp.equals("no"))
        {
            review.put("feedback",  Decider.empfedno2);
            review.put("reason for firing", Decider.reasforfir2);
        }


        Map employerData=new HashMap<>();

        employerData.put("name", Decider.name2);
        employerData.put("address", Decider.address2);
        employerData.put("aadhar num", Decider.aadhar2);
        employerData.put("res address", Decider.resadd2);
        employerData.put("phone", Decider.phone2);

        employerData.put("reason1", Decider.reason21);
        employerData.put("reason2", Decider.reason22);
        employerData.put("reason3", Decider.reason21);
        employerData.put("quality", Decider.qual2);
        employerData.put("num of employed candidate", Decider.empcand2);
        employerData.put("candidate still employed", Decider.stillemp);
        employerData.put("review", review);


        reference.updateChildren(employerData);

    }
}
