package com.example.employabilitytracking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.Transition;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

import static com.example.employabilitytracking.MainActivity.email;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);


        Log.d("final11", Decider.courseno1);

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("candidate").child(Decider.phone1);



        Map placeyes=new HashMap();

        if(Decider.placement.equals("yes"))
        {
            placeyes.put("employer name",Decider.nameemp1 );
            placeyes.put("trade",Decider.trade1 );
            placeyes.put("salary", Decider.sal1);
            placeyes.put("contract",Decider.poc1 );
            placeyes.put("probation offeres",Decider.prob1 );
        }

        if(Decider.placement.equals("no"))
        {
            placeyes.put("reason", Decider.reasnojob1);
            placeyes.put("skill lacking", Decider.skills1);
            placeyes.put("desired skill", Decider.dskills1);

        }

        Map selfyes=new HashMap();


        if(Decider.self.equals("yes")) {
            selfyes.put("feedback", Decider.selfyesfed1);
            selfyes.put("current status", Decider.statusRad);
        }


        if(Decider.self.equals("no"))
        {
            selfyes.put("experience", Decider.selfxp1);
            selfyes.put("reason", Decider.nworkself1);
        }










        Map userData=new HashMap<>();

        userData.put("name", Decider.name1);
        userData.put("city", Decider.village1);
        userData.put("block", Decider.block1);
        userData.put("mandal", Decider.mandal1);
        userData.put("address", Decider.resadd1);
        userData.put("coursenum", Decider.courseno1);
        userData.put("course name", Decider.coursename1);
        userData.put("centre", Decider.centername1);
        userData.put("centre address", Decider.centeradd1);
        userData.put("centre id", Decider.centerid1);

        userData.put("placement info", placeyes);
        userData.put("selfemployment info", selfyes);

        userData.put("placement", Decider.placement);
        userData.put("self employed", Decider.self);
        reference.updateChildren(userData);



    }
}
