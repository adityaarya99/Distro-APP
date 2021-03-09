package com.example.distro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.zip.Inflater;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {
    private String[] data;
    List<Integer> imageList;
    TechData techData;

    public ProgrammingAdapter(TechData techData, String[] data, List<Integer> imageList) {
        this.techData=techData;
        this.data = data;
        this.imageList=imageList;
    }

    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent, false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
        String title = data[position];
        holder.texttitle.setText(title);
        Picasso.with(techData).load(imageList.get(position)).into(holder.imgicon);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        ImageView imgicon;
        TextView texttitle;

        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            imgicon = (ImageView) itemView.findViewById(R.id.imgicon);
            texttitle =  (TextView) itemView.findViewById(R.id.texttitle);
        }
    }




}
