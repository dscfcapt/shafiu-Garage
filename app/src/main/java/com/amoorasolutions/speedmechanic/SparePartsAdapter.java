package com.amoorasolutions.speedmechanic;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SparePartsAdapter extends RecyclerView.Adapter<SparePartsAdapter.ViewHolder>{
    ArrayList<SparePartsModel> sparePartsModelArrayList;

    public SparePartsAdapter(ArrayList<SparePartsModel> sparePartsModelArrayList) {
        this.sparePartsModelArrayList = sparePartsModelArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_spare_parts, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String ret_head = sparePartsModelArrayList.get(position).getHead();
        holder.setHeader(ret_head);

        String ret_sub = sparePartsModelArrayList.get(position).getSub();
        holder.set_sub(ret_sub);

        int ret_image = sparePartsModelArrayList.get(position).getImage();
        holder.set_image(ret_image);
    }

    @Override
    public int getItemCount()
    {
        return sparePartsModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView header, sub_header;
        ImageView images;
        View myView;

        public ViewHolder(View itemView) {
            super(itemView);
            myView = itemView;
        }

        public void setHeader(String h) {
            header = myView.findViewById(R.id.txtSparePart);
            header.setText(h);
        }
        public void set_sub(String s) {
            sub_header = myView.findViewById(R.id.txtSparePart1);
            sub_header.setText(s);
        }
        public void set_image(int i) {
            images = myView.findViewById(R.id.imageSparePart);
            images.setImageResource(i);
        }
    }
}
