package com.khibar.simkesline.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.khibar.simkesline.R;

public class PenyakitKepalaAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] namapenyakitKepala;
    private final String[] pengertianPenyakitkepala;


    public PenyakitKepalaAdapter(Activity context, String[] namapenyakitKepala, String[] pengertianPenyakitkepala) {
        super(context, R.layout.item_penyakit_kepala, namapenyakitKepala);
        this.context = context;
        this.namapenyakitKepala = namapenyakitKepala;
        this.pengertianPenyakitkepala = pengertianPenyakitkepala;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item_penyakit_kepala, null, true);

        TextView tv_nama = rowView.findViewById(R.id.tv_item_nama_penyakit_kepala);
        TextView tv_pengertian = rowView.findViewById(R.id.tv_item_detail_penyakit_kepala);

        tv_nama.setText(namapenyakitKepala[position]);
        tv_pengertian.setText(pengertianPenyakitkepala[position]);

        return rowView;
    }

}
