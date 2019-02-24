package com.amoorasolutions.speedmechanic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.amoorasolutions.speedmechanic.R;

import java.util.ArrayList;

//package com.amoorasolutions.speedmechanic;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.GridLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.widget.ImageView;
//
//import java.util.ArrayList;
//
public class ServiceDetails extends AppCompatActivity {

    ArrayList<ServiceDetailsModel> serviceDetailsModelArrayList;
    private RecyclerView recyclerView;
    ServiceDetailsAdapter ServiceDetailsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_details);
        recyclerView = findViewById(R.id.rvlistServiceDetails);


        serviceDetailsModelArrayList = new ArrayList<>();
        String heads[] = {"A/C Service","Transmission Fluid Service","Tyre Replacement","Spark PLug Replacement","Clutch Services","Engine Fan","Oil leak Inspection"};
        String costs[] = {"N10,000","N4000","N5000","N5000","N1500","N4000", "N4500"};
        String subs[] = {"Regas A/C System, Test operation", "Replace Fluid and filter", "Remove and replace worn or Damaged tyres","Replace Spak Plugs and Cleanse","Remove GearBox replace clutch asesembly, reassemble components(Additional cost for flywheel replacement)","hghjghj","Check and Service on Oil Leak"};
        int images[] = {R.drawable.ccompressor, R.drawable.airfilter,R.drawable.alternator,R.drawable.converter,R.drawable.clutch,R.drawable.enginekfan, R.drawable.engineoils};

        for(int count = 0 ; count < heads.length ; count++){
            ServiceDetailsModel serviceDetailsModel = new ServiceDetailsModel();
            serviceDetailsModel.setHead(heads[count]);
            serviceDetailsModel.setCost(costs[count]);
            serviceDetailsModel.setSub(subs[count]);
            serviceDetailsModel.setImage(images[count]);
            serviceDetailsModelArrayList.add(serviceDetailsModel);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ServiceDetailsAdapter = new ServiceDetailsAdapter(serviceDetailsModelArrayList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(ServiceDetailsAdapter);
    }
}
