package com.mandy.satyam.homeFragment.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.mandy.satyam.R;
import com.mandy.satyam.productDetails.ProductDetailsActivity;
import com.mandy.satyam.productList.GetProductList;
import com.mandy.satyam.utils.Config;
import com.wang.avi.AVLoadingIndicatorView;

import java.util.ArrayList;

public class DiscountedAdapter extends RecyclerView.Adapter<DiscountedAdapter.ViewHolder> {
    Context context;

    public DiscountedAdapter(Context context) {
        this.context = context;

    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layout_discount, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        AVLoadingIndicatorView avLoadingIndicatorView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.dashText);
            imageView = itemView.findViewById(R.id.dashImage);
            avLoadingIndicatorView = itemView.findViewById(R.id.avi);
        }
    }
}
