package com.amoorasolutions.speedmechanic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;

public class SpareParts extends AppCompatActivity{

    ArrayList<SparePartsModel> sparePartsModelArrayList ;
    private RecyclerView recyclerView;
    SparePartsAdapter SparePartsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spare_parts);
        recyclerView = findViewById(R.id.rvlistSpareParts);


        sparePartsModelArrayList = new ArrayList<>();
        String heads[] = {"ACCompressor","Airfilter","alternator","Converter","Clutch","Engine Fan","Engine Oil","Muffler","Pressure-Guage","Radiator","Shock absorber","Spark-Plugs"};
        String subs[] = {"this is good", "this is better", "this ok","this good","hjgjhgjh","hghjghj","hello","hell","hh","gg","ss","aa" };
        int images[] = {R.drawable.ccompressor, R.drawable.airfilter,R.drawable.alternator,R.drawable.converter,R.drawable.clutch,R.drawable.enginekfan, R.drawable.engineoils,R.drawable.muffler,R.drawable.pressureguage,R.drawable.radiatorcar,R.drawable.shockabsorber,R.drawable.sparkplug};

        for(int count = 0 ; count < heads.length ; count++){
            SparePartsModel sparePartsModel = new SparePartsModel();
            sparePartsModel.setHead(heads[count]);
            sparePartsModel.setSub(subs[count]);
            sparePartsModel.setImage(images[count]);
            sparePartsModelArrayList.add(sparePartsModel);
        }
        recyclerView.setLayoutManager(new GridLayoutManager(SpareParts.this, 2));
        SparePartsAdapter = new SparePartsAdapter(sparePartsModelArrayList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(SparePartsAdapter);
    }
}
