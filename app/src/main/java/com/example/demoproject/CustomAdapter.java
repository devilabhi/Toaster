package com.example.demoproject;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedTransformationBuilder;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import java.util.ArrayList;

class CustomAdapter  extends RecyclerView.Adapter<CustomAdapter.vh> {

    Activity activity;
    ArrayList fname,usclass,uimgs;

    @NonNull
    @Override
    public vh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(activity).inflate(R.layout.row,null);

        return new vh(v);
    }

    @Override
    public void onBindViewHolder(@NonNull vh holder, int position) {

        holder.txt1.setText(fname.get(position).toString());
        holder.txt2.setText(usclass.get(position).toString());

        Transformation transformation = new RoundedTransformationBuilder()
                .cornerRadiusDp(40)
                .oval(false)
                .build();

        Picasso.with(activity).load(uimgs.toString()).transform(transformation);

    }

    @Override
    public int getItemCount() {
        return fname.size();
    }


    public class vh extends RecyclerView.ViewHolder{

        ImageView img2;
        TextView txt1,txt2;

        public vh(@NonNull View itemView) {
            super(itemView);

            img2=itemView.findViewById(R.id.imageView2);
            txt1=itemView.findViewById(R.id.txtView1);
            txt2=itemView.findViewById(R.id.txtView2);



        }
    }

    public CustomAdapter(MainActivity mainActivity, ArrayList<String> name, ArrayList<String> sclass,ArrayList<String> imgs) {

    activity=mainActivity;
    fname=name;
    usclass=sclass;
    uimgs=imgs;

    }
}
