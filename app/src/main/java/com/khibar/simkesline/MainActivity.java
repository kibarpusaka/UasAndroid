package com.khibar.simkesline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.khibar.simkesline.menu.JenisPenyakitActivity;
import com.khibar.simkesline.menu.TipsSehatActivity;

public class MainActivity extends AppCompatActivity {
    TextView tvResultNama;
    String resultNama;
    ImageButton ibpenyakit, ibtentang, ibexit, ibtips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibpenyakit = findViewById(R.id.ib_jenis);
        ibtentang = findViewById(R.id.ib_tentang);
        ibexit = findViewById(R.id.ib_exit);
        ibtips = findViewById(R.id.ib_tips);

        ibpenyakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent organ  = new Intent(MainActivity.this, JenisPenyakitActivity.class);
                startActivity(organ);
            }
        });

        ibtentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ibtips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tips = new Intent(MainActivity.this, TipsSehatActivity.class);
                startActivity(tips);

            }
        });

        ibexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exit = new Intent(MainActivity.this, SplashActivity.class);
                startActivity(exit);
            }
        });

        initComponents();

        // untuk mendapatkan data dari activity sebelumnya, yaitu  activity login.
        Bundle extras = getIntent().getExtras();
        if (extras != null)
            resultNama = extras.getString("result_nama");
        tvResultNama.setText(resultNama);
    }

    private void initComponents() {
        tvResultNama = findViewById(R.id.tvResultNama);
    }
}
