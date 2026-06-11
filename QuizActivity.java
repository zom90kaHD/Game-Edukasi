package com.example.kelompok6_aplikasigameedukasi_4psi1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private TextView tvQuestionCount, tvQuestion, tvExplanation, tvStatus;
    private RadioGroup rgOptions;
    private RadioButton[] rbOptions = new RadioButton[4];
    private Button btnSubmit, btnNext;
    private MaterialCardView cvExplanation;
    private ProgressBar progressBar;
    private NestedScrollView nestedScrollView;

    private List<Question> questionList;
    private int currentQuestionIndex = 0;
    private int score = 0;
    private String level, subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        level = getIntent().getStringExtra("LEVEL");
        subject = getIntent().getStringExtra("SUBJECT");

        tvQuestionCount = findViewById(R.id.tvQuestionCount);
        tvQuestion = findViewById(R.id.tvQuestion);
        tvExplanation = findViewById(R.id.tvExplanation);
        tvStatus = findViewById(R.id.tvStatus);
        cvExplanation = findViewById(R.id.cvExplanation);
        progressBar = findViewById(R.id.progressBar);
        nestedScrollView = findViewById(android.R.id.content).findViewWithTag("scroll_view"); 
        // Note: I will add a tag to NestedScrollView in XML to make it easier to find or just use ID
        nestedScrollView = findViewById(R.id.nestedScrollView);

        rgOptions = findViewById(R.id.rgOptions);
        rbOptions[0] = findViewById(R.id.rbOption1);
        rbOptions[1] = findViewById(R.id.rbOption2);
        rbOptions[2] = findViewById(R.id.rbOption3);
        rbOptions[3] = findViewById(R.id.rbOption4);
        
        btnSubmit = findViewById(R.id.btnSubmit);
        btnNext = findViewById(R.id.btnNext);

        loadQuestions();
        displayQuestion();

        btnSubmit.setOnClickListener(v -> checkAnswer());
        btnNext.setOnClickListener(v -> nextQuestion());
    }

    private void loadQuestions() {
        List<Question> allQuestions = QuestionRepository.getQuestions(level, subject);
        Collections.shuffle(allQuestions);
        questionList = new ArrayList<>(allQuestions.subList(0, Math.min(10, allQuestions.size())));
        progressBar.setMax(questionList.size());
    }

    private void displayQuestion() {
        Question current = questionList.get(currentQuestionIndex);
        tvQuestionCount.setText("Soal " + (currentQuestionIndex + 1) + "/" + questionList.size());
        tvQuestion.setText(current.getQuestion());
        progressBar.setProgress(currentQuestionIndex + 1);
        
        String[] options = current.getOptions();
        for (int i = 0; i < 4; i++) {
            rbOptions[i].setText(options[i]);
            rbOptions[i].setEnabled(true);
            rbOptions[i].setBackgroundResource(R.drawable.option_selector);
            rbOptions[i].setTextColor(ContextCompat.getColor(this, R.color.textPrimary));
        }
        
        rgOptions.clearCheck();
        cvExplanation.setVisibility(View.GONE);
        btnSubmit.setVisibility(View.VISIBLE);
        btnNext.setVisibility(View.GONE);
        
        // Scroll back to top for new question
        if (nestedScrollView != null) {
            nestedScrollView.scrollTo(0, 0);
        }
    }

    private void checkAnswer() {
        int selectedId = rgOptions.getCheckedRadioButtonId();
        if (selectedId == -1) {
            Toast.makeText(this, "Pilih salah satu jawaban!", Toast.LENGTH_SHORT).show();
            return;
        }

        RadioButton selectedRb = findViewById(selectedId);
        int selectedIndex = rgOptions.indexOfChild(selectedRb);
        Question current = questionList.get(currentQuestionIndex);

        boolean isCorrect = (selectedIndex == current.getAnswerIndex());
        
        for (int i = 0; i < 4; i++) {
            rbOptions[i].setEnabled(false);
            if (i == current.getAnswerIndex()) {
                rbOptions[i].setBackgroundResource(R.drawable.option_correct);
                rbOptions[i].setTextColor(Color.WHITE);
            } else if (i == selectedIndex && !isCorrect) {
                rbOptions[i].setBackgroundResource(R.drawable.option_wrong);
                rbOptions[i].setTextColor(Color.WHITE);
            }
        }

        if (isCorrect) {
            score += 10;
            tvStatus.setText("JAWABAN BENAR!");
            tvStatus.setTextColor(ContextCompat.getColor(this, R.color.correctGreen));
        } else {
            tvStatus.setText("JAWABAN SALAH");
            tvStatus.setTextColor(ContextCompat.getColor(this, R.color.wrongRed));
        }

        tvExplanation.setText(current.getExplanation());
        cvExplanation.setVisibility(View.VISIBLE);
        btnSubmit.setVisibility(View.GONE);
        btnNext.setVisibility(View.VISIBLE);

        if (currentQuestionIndex == questionList.size() - 1) {
            btnNext.setText("Lihat Skor Akhir");
        }

        // Scroll to the explanation so user can see it
        nestedScrollView.post(() -> nestedScrollView.fullScroll(View.FOCUS_DOWN));
    }

    private void nextQuestion() {
        if (currentQuestionIndex < questionList.size() - 1) {
            currentQuestionIndex++;
            displayQuestion();
        } else {
            showScore();
        }
    }

    private void showScore() {
        Intent intent = new Intent(this, ScoreActivity.class);
        intent.putExtra("SCORE", score);
        startActivity(intent);
        finish();
    }
}