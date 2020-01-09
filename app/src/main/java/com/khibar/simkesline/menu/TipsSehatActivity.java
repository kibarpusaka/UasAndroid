package com.khibar.simkesline.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.khibar.simkesline.R;
import com.khibar.simkesline.adapter.TipsSehatAdapter;

public class TipsSehatActivity extends AppCompatActivity {
    ListView list_tips;
    String [] tipssehat = {
            "1. Makan Sayuran Hijau",
            "2. Konsumsi Vitamin D",
            "3. Olahraga Rutin",
            "4. Minum Teh Hijau",
            "5. Istirahat Yang Cukup",
            "6. Kelola Stres ",
            "7. Bersosialisasi Dengan Baik",
            "8. Menjaga Kebersihan",
            "9. Hindari Alkohol"
    };

    String[] detialtips = {
            "Sayuran hijau dan berdaun kaya akan vitamin yang membantu Anda menjaga diet seimbang dan mendukung sistem kekebalan tubuh yang sehat.Menurut sebuah peercobaan yang dilakukan pada tikus, makan sayuran criciferous, seperti brokoli, kembang kol, dan kol, dapat membantu mengirimkan sinyal kimia ke tubuh yang meningkatkan protein pada permukaan sel yang diperlukan untuk membuat kerja sistem kekebalan tubuh lebih optimal.",
            "Kekurangan vitamin D dapat menyebabkan gejala seperti pertumbuhan tulang yang buruk, masalah jantung, dan sistem kekebalan tubuh yang lemah. Makanan yang mengandung sumber vitamin D terbaik antara lain kuning telur, jamur, ikan salmon, ikan tuna, dan hati sapi. Anda juga bisa membeli suplemen vitamin D dan pilih yang mengandung D3 (cholecalciferol), karena ini baik dalam meningkatkan kadar vitamin D dalam darah Anda",
            "Selain itu, sebuah penelitian membuktikan bahwa olahraga teratur dapat mencegah peradangan dan penyakit kronis, mengurangi stres, serta mempercepat peredaran sel darah putih dalam melawan penyakit.",
            "Teh hijau telah dikaitkan dengan kesehatan yang baik. Manfaat kesehatan teh hijau mungkin karena tingginya tingkat antioksidan, yang disebut flavonoid. Sehingga dapat menurunkan tekanan darah dan mengurangi risiko penyakit kardiovaskular",
            "Tidur yang cukup merupakan salah satu kunci dari kekebalan tubuh yang kuat. Sebuah penelitian menunjukan bahwa orang yang tidur minimal delapan jam setiap malam selama dua minggu menunjukkan bahwa tubuh lebih kebal dari serangan virus dan kuman bakteri. Sementara, orang yang kurang dari 6 jam setiap malam akan 4 kali lebih mudah mengalami flu karena virus dibandingkan orang yang tidur 7 jam atau lebih",
            "Hal ini dapat mengakibatkan tubuh mengalami peradangan dan rentan terhadap penyakit. Jadi salah satu cara menjaga kesehatan tubuh yang tepat adalah dengan mengendalikan stres. Anda bisa coba lakukan latihan yoga atau meditasi untuk mengendalikan atau menghilangkan stres.",
            "Penelitian yang diterbitkan dalam American Psychological Association menunjukkan bahwa isolasi sosial dapat meningkatkan stres, yang memperlambat respon kekebalan tubuh dan kemampuan untuk menyembuhkan dengan cepat.",
            "Dengan menjaga kebersihan diri maupun lingkukan sekitar. Dengan begitu, Anda terhindar dari serangan berbagai penyakit",
            "Penelitian menunjukan bahwa minum alkohol dapat merusak sel dendritik, yaitu komponen penting dari sistem kekebalan tubuh. Seiring berjalannya waktu, sering minum alkohol dapat meningkatkan seseorang terhadap infeksi bakteri dan virus."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_sehat);

        TipsSehatAdapter adapter = new TipsSehatAdapter(this, tipssehat, detialtips);
        list_tips = findViewById(R.id.list_tips);
        list_tips.setAdapter(adapter);
        list_tips.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
