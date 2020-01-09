package com.khibar.simkesline.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.khibar.simkesline.R;

public class TipsSehatAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] tipsSehat;
    private final String[] detailTips;


    public TipsSehatAdapter(Activity context, String[] tipsSehat, String[] detailTips) {
        super(context, R.layout.item_tips_sehat, tipsSehat);
        this.context = context;
        this.tipsSehat = tipsSehat;
        this.detailTips = detailTips;

    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item_tips_sehat, null, true);

        TextView tv_nama = rowView.findViewById(R.id.tv_item_tips);
        TextView tv_detail_tips = rowView.findViewById(R.id.tv_item_detail_tips);


        tv_nama.setText(tipsSehat[position]);
        tv_detail_tips.setText(detailTips[position]);

        return rowView;
    }
}
