package com.khibar.simkesline.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.khibar.simkesline.R;

public class OrganListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] namaOrgan;
    private final String[] pengertianOrgan;
    private final int[] gambarOrgan;

    public OrganListAdapter(Activity context, String[] namaOrgan, int[] gambarOrgan, String[] pengertianOrgan) {
        super(context, R.layout.item_organ, namaOrgan);
        this.context = context;
        this.namaOrgan = namaOrgan;
        this.gambarOrgan = gambarOrgan;
        this.pengertianOrgan = pengertianOrgan;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item_organ, null, true);

        TextView tv_nama = (TextView)rowView.findViewById(R.id.tv_item_nama_organ);
        TextView tv_pengertian = (TextView)rowView.findViewById(R.id.tv_item_pengertian_organ);
        ImageView iv_gambar = (ImageView)rowView.findViewById(R.id.iv_item_gambar_organ);

        tv_nama.setText(namaOrgan[position]);
        tv_pengertian.setText(pengertianOrgan[position]);
        iv_gambar.setImageResource(gambarOrgan[position]);

        return rowView;
    }
}
