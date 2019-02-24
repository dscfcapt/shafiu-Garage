package com.amoorasolutions.speedmechanic;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ServiceDetailsAdapter extends RecyclerView.Adapter<ServiceDetailsAdapter.ViewHolder> {
    ArrayList<ServiceDetailsModel> serviceDetailsModelArrayList;

    public ServiceDetailsAdapter(ArrayList<ServiceDetailsModel> serviceDetailsModelArrayList) {
        this.serviceDetailsModelArrayList = serviceDetailsModelArrayList;
    }

    @Override
    public ServiceDetailsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_regular_services, parent, false);
        return new ServiceDetailsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ServiceDetailsAdapter.ViewHolder holder, int position) {
            String ret_cost = serviceDetailsModelArrayList.get(position).getCost();
            holder.set_cost(ret_cost);

            String ret_head = serviceDetailsModelArrayList.get(position).getHead();
            holder.setHeader(ret_head);

            String ret_sub = serviceDetailsModelArrayList.get(position).getSub();
            holder.set_sub(ret_sub);

            int ret_image = serviceDetailsModelArrayList.get(position).getImage();
            holder.set_image(ret_image);

    }

    @Override
    public int getItemCount() {
        return serviceDetailsModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView header, sub_header, cost;
        ImageView images;
        View myView;

        public ViewHolder(View itemView) {
            super(itemView);
            myView = itemView;
        }

        public void setHeader(String h) {
            header = myView.findViewById(R.id.titleService);
            header.setText(h);
        }
        public void set_cost(String c) {
            header = myView.findViewById(R.id.costService);
            header.setText(c);
        }

        public void set_sub(String s) {
            sub_header = myView.findViewById(R.id.descriptionService);
            sub_header.setText(s);
        }
        public void set_image(int i) {
            images = myView.findViewById(R.id.imageService);
            images.setImageResource(i);
        }
    }
}


