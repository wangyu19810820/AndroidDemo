package com.example.viewpageandfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder> {

    private List<String> titles = new ArrayList<>();
    private List<Integer> colors = new ArrayList<>();

    public ViewPagerAdapter() {
        titles.add("hello1");
        titles.add("hello2");
        titles.add("hello3");
        titles.add("hello4");
        titles.add("hello5");
        titles.add("hello6");
        titles.add("hello7");
        titles.add("hello8");
        titles.add("hello9");
        titles.add("hello10");

        colors.add(R.color.purple_200);
        colors.add(R.color.purple_500);
        colors.add(R.color.purple_700);
        colors.add(R.color.teal_200);
        colors.add(R.color.teal_700);
        colors.add(R.color.black);
        colors.add(R.color.white);
        colors.add(R.color.red);
        colors.add(R.color.blue);
        colors.add(R.color.green);
    }

    @NonNull
    @Override
    public ViewPagerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewPagerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pager, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewPagerViewHolder holder, int position) {
        holder.mTv.setText(titles.get(position));
        holder.mContainer.setBackgroundResource(colors.get(position));
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ViewPagerViewHolder extends RecyclerView.ViewHolder {

        TextView mTv;
        RelativeLayout mContainer;

        public ViewPagerViewHolder(@NonNull View itemView) {
            super(itemView);
            mContainer = itemView.findViewById(R.id.container);
            mTv = itemView.findViewById(R.id.tvTitle);
        }
    }
}
