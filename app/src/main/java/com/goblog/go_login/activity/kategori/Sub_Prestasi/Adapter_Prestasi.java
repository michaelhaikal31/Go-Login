package com.goblog.go_login.activity.kategori.Sub_Prestasi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.goblog.go_login.R;

import java.util.List;

/**
 * Created by haikal on 5/10/2016.
 */
public class Adapter_Prestasi extends RecyclerView.Adapter<Adapter_Prestasi.AdapterViewHolder>{
private List<Item> items;
private Context context;

public Adapter_Prestasi(List<Item> items, Context context) {
        this.items = items;
        this.context  = context;
        }

public class AdapterViewHolder extends RecyclerView.ViewHolder{
    private TextView name;
    private ImageView imageView;
    public AdapterViewHolder(View itemView) {
        super(itemView);
        name = (TextView)itemView.findViewById(R.id.member_name);
        imageView = (ImageView)itemView.findViewById(R.id.profile_pic);
    }
}
    @Override
    public AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardview_of_fragment_prestasi, parent, false);
        AdapterViewHolder adapterViewHolder  = new AdapterViewHolder(view);
        return (adapterViewHolder);
    }

    @Override
    public void onBindViewHolder(AdapterViewHolder holder, int position) {
        holder.name.setText(items.get(position).getNama());
        holder.imageView.setImageResource(items.get(position).getImages());
        if (items.get(position).getImages() == items.get(0).getImages()) {
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Prestasi_1.class));
                }
            });
        }
        if (items.get(position).getImages() == items.get(1).getImages()) {
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context context = view.getContext();
                        context.startActivity(new Intent(context, Prestasi_2.class));
                    }
                });
        }
        if (items.get(position).getImages() == items.get(2).getImages()) {
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Prestasi_3.class));
                }
            });
        }



        if (items.get(position).getImages() == items.get(3).getImages()) {
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Prestasi_4.class));
                }
            });
        }
        if (items.get(position).getImages() == items.get(4).getImages()) {
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Prestasi_5.class));
                }
            });
        }
        if (items.get(position).getImages() == items.get(5).getImages()) {
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Prestasi_6.class));
                }
            });
        }
        if (items.get(position).getImages() == items.get(6).getImages()) {
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Prestasi_7.class));
                }
            });
        }
        if (items.get(position).getImages() == items.get(7).getImages()) {
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Prestasi_8.class));
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
