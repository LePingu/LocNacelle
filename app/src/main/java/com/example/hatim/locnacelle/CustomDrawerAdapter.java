package com.example.hatim.locnacelle;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.KeyRep;
import java.util.Collections;
import java.util.List;


public class CustomDrawerAdapter extends RecyclerView.Adapter<CustomDrawerAdapter.MyViewHolder> {
    List<DrawerItem> data = Collections.emptyList();
    private LayoutInflater inflater;
    private Context context;
    AssetManager assetMan;
    Typeface type;

    public CustomDrawerAdapter(Context context, List<DrawerItem> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
        assetMan = context.getAssets();
    }

    public void delete(int position) {
        data.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.items_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DrawerItem current = data.get(position);
        holder.title.setText(current.getItemName());
        holder.imageView.setImageResource(current.getImgResID());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            type = Typeface.createFromAsset(assetMan,"bebasneue.ttf");
            title = (TextView) itemView.findViewById(R.id.drawer_itemName);
            title.setTypeface(type);
            title.setTextColor(context.getResources().getColor(R.color.white));
            title.setPadding(0,25,0,0);
            imageView = (ImageView) itemView.findViewById(R.id.drawer_icon);
        }

    }
}