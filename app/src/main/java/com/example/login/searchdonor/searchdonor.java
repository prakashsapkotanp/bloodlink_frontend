package com.example.login.searchdonor;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.login.R;
import com.example.login.databinding.ActivitySearchdonorBinding;
import com.example.login.dlist;
import com.example.login.requestedpage.requestlistpage;

public class searchdonor extends AppCompatActivity {
    Button searchbtn;
    String requestingDeviceId;
    double requestingDeviceLatitude;
    double requestingDeviceLongitude;
    String mydevID;
    String myfcm;
    double mydevIDLocationKm;

    ActivitySearchdonorBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySearchdonorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        searchbtn=findViewById(R.id.button);

        Intent i = getIntent();
        if (i != null) {
            mydevID = i.getStringExtra("devId");
            myfcm = i.getStringExtra("fcm");
        }

        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(searchdonor.this,dlist.class);
                startActivity(i);
            }
        });
    /*   binding.button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(binding.checkBox.isChecked())
                {
                    String s=binding.address.getText().toString();
                }
                else{
                    String address=binding.address.getText().toString();
                }

                if(binding.checkBox.isChecked())
                {
                    String address=binding.address.getText().toString();
                }
                else{
                    String address=binding.address.getText().toString();
                }
                Intent i=new Intent(searchdonor.this, requestlistpage.class);
                String patient=binding.patientName.getText().toString();
                String bloodgroup=binding.bloodgroup.getText().toString();
                String pints=binding.pints.getText().toString();
                String s=binding.address.getText().toString();
                i.putExtra("bg",bloodgroup);
                i.putExtra("p",pints);
                i.putExtra("l",s);
                startActivity(i);
            }

        });*/
    }
}