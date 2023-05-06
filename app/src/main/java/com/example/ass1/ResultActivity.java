package com.example.ass1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView resultName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String userName = getIntent().getStringExtra(Constants.user_name);

        resultName = findViewById(R.id.ResultName);
        resultName.setText(userName);
        String totalQuestions = getIntent().getStringExtra(Constants.total_question);
        String correctAnswer = getIntent().getStringExtra(Constants.correct_answers);

        String Score = "your Score is " + correctAnswer + " out of " + totalQuestions;
    }
}
