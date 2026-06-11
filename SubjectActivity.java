package com.example.kelompok6_aplikasigameedukasi_4psi1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SubjectActivity extends AppCompatActivity {

    private String level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        level = getIntent().getStringExtra("LEVEL");
        TextView tvTitle = findViewById(R.id.tvTitle);
        tvTitle.setText("Pilih Pelajaran - " + level);

        findViewById(R.id.btnIPA).setOnClickListener(v -> startQuiz("IPA"));
        findViewById(R.id.btnIPS).setOnClickListener(v -> startQuiz("IPS"));
        findViewById(R.id.btnIndo).setOnClickListener(v -> startQuiz("Bahasa Indonesia"));
        findViewById(R.id.btnTIK).setOnClickListener(v -> startQuiz("TIK"));
        findViewById(R.id.btnInggris).setOnClickListener(v -> startQuiz("Bahasa Inggris"));
    }

    private void startQuiz(String subject) {
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtra("LEVEL", level);
        intent.putExtra("SUBJECT", subject);
        startActivity(intent);
    }
}