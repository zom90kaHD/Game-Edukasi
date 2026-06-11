package com.example.kelompok6_aplikasigameedukasi_4psi1;

import java.io.Serializable;

public class Question implements Serializable {
    private String question;
    private String[] options;
    private int answerIndex;
    private String explanation;

    public Question(String question, String[] options, int answerIndex, String explanation) {
        this.question = question;
        this.options = options;
        this.answerIndex = answerIndex;
        this.explanation = explanation;
    }

    public String getQuestion() { return question; }
    public String[] getOptions() { return options; }
    public int getAnswerIndex() { return answerIndex; }
    public String getExplanation() { return explanation; }
}