package com.example.retrofitrecylcer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Ninesol on 4/14/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context context;
    List<TableDatum> listdata;
    View itemView;

    List<TableDatum> data = new ArrayList<TableDatum>();
    //SmallBang mSmallBang;

    public RecyclerViewAdapter(Context context, List<TableDatum> listdata) {
        this.context = context;
        this.listdata = listdata;
        //mSmallBang   = SmallBang.attach2Window(MainActivity.mainActivity);


    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

         itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.customview, parent, false);

        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        TableDatum obj = listdata.get(position);

        //mSmallBang.bang(itemView);

        String photopath = obj.getPicture();


        String realPath = photopath.replace("..\\/uploads\\/fooditems\\/","http://lolaspizza.qiriapp.com/uploads/fooditems/");
        Log.e("PIC_PATH",realPath.replace("../",""));
        realPath = "http://lolaspizza.qiriapp.com/"+realPath;
        Log.e("NEW_PIC_PATH",realPath.replace("../",""));


        // String realPath    = "http://services.hanselandpetal.com/photos/"+photopath;

        holder.Description.setText(obj.getDescription());

        holder.price.setText(obj.getPrice()+" ");

        Picasso.with(context)
                .load(realPath)
                .placeholder(R.drawable.progress_animation)
                .into((holder.image));

      /*ImageLoader imageLoader = ImageLoader.getInstance();
        ImageView imageview = (ImageView) v.findViewById(R.id.imageview);
        imageLoader.displayImage(realPath, imageview);*/



    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name,Description,price;

        public MyViewHolder(View itemView) {
            super(itemView);
          
            image = (ImageView) itemView.findViewById(R.id.image);
            name = (TextView) itemView.findViewById(R.id.name);
            Description = (TextView) itemView.findViewById(R.id.description);
            price = (TextView) itemView.findViewById(R.id.price);

        }
    }
}
