package com.khibar.simkesline.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.khibar.simkesline.R;
import com.khibar.simkesline.adapter.OrganListAdapter;
import com.khibar.simkesline.penyakit.KepalaActivity;
import com.khibar.simkesline.penyakit.MataActivity;

public class JenisPenyakitActivity extends AppCompatActivity {
    ListView list;


    String[] namaorgan = {
            "Kepala ",
            "Mata",
            "Telinga",
            "Hidung",
            "Gigi",
            "Hati",
            "Jantung ",
            "Ginjal ",
            "Kulit",
            "Tulang",
            "Usus"
    };

    String[] pengertianorgan = {
            "Kepala manusia adalah sebuah unit anatomis yang terdiri dari tengkorak, tulang hyoid, dan tulang leher. Kepala manusia menerima suplai darah memalui pembuluh nadi kepala eksternal dan internal.",
            "Mata adalah organ penglihatan. Mata mendeteksi cahaya dan mengubahnya menjadi impuls elektrokimia pada sel saraf.",
            "Telinga merupakan sebuah organ yang mampu mendeteksi/mengenal suara & juga banyak berperan dalam keseimbangan dan posisi tubuh.",
            "Hidung adalah penonjolan pada vertebrata yang mengandung nostril, yang menyaring udara untuk pernapasan.",
            "Gigi adalah salah satu struktur berkalsifikasi dan keras yang terdapat di dalam mulut manusia dan hewan vertebrata. Strukturnya yang bervariasi memungkinkan gigi melakukan banyak fungsi.",
            "Hati (bahasa Yunani: ἡπαρ, hēpar) merupakan kelenjar terbesar di dalam tubuh, terletak dalam rongga perut sebelah kanan, tepatnya di bawah diafragma. Berdasarkan fungsinya, hati juga termasuk sebagai alat ekskresi.",
            "Jantung (bahasa Latin: cor) adalah sebuah rongga, rongga organ berotot yang memompa darah lewat pembuluh darah oleh kontraksi berirama yang berulang.",
            "Ginjal adalah organ ekskresi dalam vertebrata yang berbentuk mirip kacang. Dalam manusia dewasa, ukuran ginjal sekitar 11 sentimeter panjangnya.",
            "Kulit adalah lapisan luar yang menutupi tubuh sebuah vertebrata. Kulit terdiri atas epidermis, dermis, dan hipodermis.",
            "Tulang atau kerangka adalah penopang tubuh Vertebrata. Tanpa tulang, pasti tubuh kita tidak bisa tegak berdiri. ",
            "Usus adalah bagian dari sistem pencernaan yang bermula dari lambung hingga anus . Pada usus terdiri dari dua bagian: usus kecil dan usus besar (kolon)."

    };

    int[] gambarorgan = {
            R.drawable.kepala,
            R.drawable.mata,
            R.drawable.telinga,
            R.drawable.hidung,
            R.drawable.gigi,
            R.drawable.hati,
            R.drawable.jantung,
            R.drawable.ginjal,
            R.drawable.kulit,
            R.drawable.tulang,
            R.drawable.usus,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_penyakit);


        OrganListAdapter adapter = new OrganListAdapter(this, namaorgan, gambarorgan, pengertianorgan);
        list = findViewById(R.id.list_view_organ);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent pindah = null;
                switch(position) {
                    case 0:
                        pindah = new Intent(getApplicationContext(), KepalaActivity.class);
                        startActivity(pindah);
                        break;
                    case 1:
                        pindah = new Intent(getApplicationContext(), MataActivity.class);
                        startActivity(pindah);
                        break;
                    default:
                }
            }
        });
    }
}
