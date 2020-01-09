package com.khibar.simkesline.penyakit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.khibar.simkesline.R;
import com.khibar.simkesline.adapter.OrganListAdapter;
import com.khibar.simkesline.adapter.PenyakitKepalaAdapter;

public class KepalaActivity extends AppCompatActivity {
    ListView listpenyakitkepala;

    String[] namapenyakitkepala = {
            "SAKIT KEPALA MIGRAIN",
            "SAKIT TENSION",
            "SAKIT KEPALA CLUSTER",
            "SAKIT KEPALA CERVIGOVENIC",
            "SAKIT KEPALA TMJ"
    };

    String[] pengertianpenyakit = {
            "Migrain adalah sakit kepala sebelah yang biasanya muncul karena stres, kurang tidur, kebanyakan makan obat-obatan yang gak perlu, serta kurang nutrisi.",
            "Stres dan kurang tidur bisa memicu sakit kepala tension. Biasa terjadi dalam kurun waktu 30 menit sampai 1 minggu.",
            "Sakit kepala yang nyerinya di bagian atas kepala sampai ke leher. Biasanya karena terlalu banyak aktivitas hingga merasa kelelahan.",
            "Sakit kepala di pinggir mata yang biasa terjadi karena kelamaan menonton dan melihat hape.",
            "Sakit kepala di sekitar pelipis yang bisa terjadi dikarenakan rahang mengunyah atau berbicara terlalu cepat."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kepala);

        listpenyakitkepala = findViewById(R.id.list_penyakit_kepala);
        PenyakitKepalaAdapter adapterkepala = new PenyakitKepalaAdapter(this, namapenyakitkepala, pengertianpenyakit);
        listpenyakitkepala.setAdapter(adapterkepala);
        listpenyakitkepala.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
}
