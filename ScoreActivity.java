package com.example.kelompok6_aplikasigameedukasi_4psi1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        int score = getIntent().getIntExtra("SCORE", 0);
        TextView tvScore = findViewById(R.id.tvScore);
        tvScore.setText(String.valueOf(score));

        ImageView ivStar1 = findViewById(R.id.ivStar1);
        ImageView ivStar2 = findViewById(R.id.ivStar2);
        ImageView ivStar3 = findViewById(R.id.ivStar3);
        ImageView ivStar4 = findViewById(R.id.ivStar4);
        ImageView ivStar5 = findViewById(R.id.ivStar5);
        TextView tvApresiasi = findViewById(R.id.tvApresiasi);

        int yellow = ContextCompat.getColor(this, R.color.starYellow);

        // Logic for 5 Stars and Appreciation Text
        if (score >= 20) {
            ivStar1.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar1.setColorFilter(yellow);
        }
        if (score >= 40) {
            ivStar2.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar2.setColorFilter(yellow);
        }
        if (score >= 60) {
            ivStar3.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar3.setColorFilter(yellow);
        }
        if (score >= 80) {
            ivStar4.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar4.setColorFilter(yellow);
        }
        if (score >= 100) {
            ivStar5.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar5.setColorFilter(yellow);
            tvApresiasi.setText("Sempurna!");
        } else if (score >= 80) {
            tvApresiasi.setText("Luar Biasa!");
        } else if (score >= 60) {
            tvApresiasi.setText("Bagus Sekali!");
        } else if (score >= 40) {
            tvApresiasi.setText("Cukup Baik!");
        } else {
            tvApresiasi.setText("Ayo Belajar Lagi!");
        }

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(ScoreActivity.this, Dashboard.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}