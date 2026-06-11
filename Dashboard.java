package com.example.kelompok6_aplikasigameedukasi_4psi1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        findViewById(R.id.btnSD).setOnClickListener(v -> startSubjectActivity("SD"));
        findViewById(R.id.btnSMP).setOnClickListener(v -> startSubjectActivity("SMP"));
        findViewById(R.id.btnSMA).setOnClickListener(v -> startSubjectActivity("SMA"));
    }

    private void startSubjectActivity(String level) {
        Intent intent = new Intent(this, SubjectActivity.class);
        intent.putExtra("LEVEL", level);
        startActivity(intent);
    }
}