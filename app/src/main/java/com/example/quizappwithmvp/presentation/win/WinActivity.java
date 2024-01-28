package com.example.quizappwithmvp.presentation.win;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.quizappwithmvp.R;

public class WinActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        int correctAnswer = getIntent().getIntExtra("correct", 0);
        TextView textCorrect = findViewById(R.id.correct);
        textCorrect.setText("Correct answers: " + correctAnswer);

        int wrongAnswer = getIntent().getIntExtra("wrong", 0);

        TextView textWrong = findViewById(R.id.wrong);
        textWrong.setText("Wrong answers: " + wrongAnswer);

        TextView textPercentage = findViewById(R.id.percentage);
        textPercentage.setText("Percentage: " + (correctAnswer * 10) + "%");

        findViewById(R.id.back).setOnClickListener(v -> finish());
    }
}