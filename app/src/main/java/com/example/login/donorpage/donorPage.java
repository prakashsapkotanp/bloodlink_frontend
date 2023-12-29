package com.example.login.donorpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.login.R;



import java.util.ArrayList;

public class donorPage extends AppCompatActivity {
ArrayList<DonorModel> arrDonor=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_page);

        RecyclerView recyclerView=findViewById(R.id.recyclerdonor);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrDonor.add(new DonorModel(R.drawable.baseline_person_24,"Suman Shah","23","B+","1","Dhangadhi"));
        arrDonor.add(new DonorModel(R.drawable.baseline_lock_24,"Ram","22","AB","1","Attarya"));
        arrDonor.add(new DonorModel(R.drawable.baseline_lock_24,"Ram","22","AB-","1","Attarya"));
        arrDonor.add(new DonorModel(R.drawable.baseline_lock_24,"Ram","22","AB+","1","Attarya"));
        arrDonor.add(new DonorModel(R.drawable.baseline_lock_24,"Ram","22","AB","1","Attarya"));
        arrDonor.add(new DonorModel(R.drawable.baseline_lock_24,"Ram","22","O+","1","Attarya"));
        arrDonor.add(new DonorModel(R.drawable.baseline_lock_24,"Ram","22","AB","1","Attarya"));
        RecyclerDonorAdapter adapter=new RecyclerDonorAdapter(this,arrDonor);
        recyclerView.setAdapter(adapter);
    }
}