//package com.example.ass1;
//
//import java.util.ArrayList;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.content.ContextCompat;
//
//import android.graphics.Color;
//import android.graphics.Typeface;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ProgressBar;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//public class LearnActivity extends AppCompatActivity implements View.OnClickListener {
//
//    private int R_currentPosition = 1;
//    private ArrayList<LearnData> R_QuestionList = null;
//    private int R_SelectedPosition = 0;
//
//    Button btnSubmitOnClickQuestions = findViewById(R.id.btn_Submit_Questions);
//
//    private TextView Tv_Choice1Q1;
//    private TextView Tv_Choice2Q1;
//    private TextView Tv_Choice3Q1;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_learn);
//
//        R_QuestionList = Constants.getLearnData();
//        setLearnData();
//
//        TextView Tv_Choice1Q1 = findViewById(R.id.Tv_Choice1Q1);
//        TextView Tv_Choice2Q1 = findViewById(R.id.Tv_Choice2Q1);
//        TextView Tv_Choice3Q1 = findViewById(R.id.Tv_Choice3Q1);
//
//       Tv_Choice1Q1.setOnClickListener(this);
//       Tv_Choice2Q1.setOnClickListener(this);
//       Tv_Choice3Q1.setOnClickListener(this);
//
//
//
//        btnSubmitOnClickQuestions.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(v.getId() == R.id.btn_Submit_Questions) {
//                    if(R_SelectedPosition == 0){}
//                        R_currentPosition ++;
//                }
//            }
//        });
//
//        public void btnSubmitOnClickQuestions(View view) {
//            if(v.getId() == R.id.btn_Submit_Questions) {
//                if(R_SelectedPosition == 0){}
//                R_currentPosition ++;
//            }
//        }
//
//        private void answerView(int answer, int drawableView) {
//            switch(answer) {
//                case 1:
//                    Tv_Choice1Q1.setBackground(ContextCompat.getDrawable(this, drawableView));
//                    break;
//                case 2:
//                    Tv_Choice2Q1.setBackground(ContextCompat.getDrawable(this, drawableView));
//                    break;
//                case 3:
//                    Tv_Choice3Q1.setBackground(ContextCompat.getDrawable(this, drawableView));
//                    break;
//            }
//        }
//
//    }
//
//    private void setLearnData() {
//
//        R_currentPosition = 1;
//
//        LearnData question = R_QuestionList.get(R_currentPosition - 1);
//        defultOptionVeiw();
//
//        ProgressBar progressBar = findViewById(R.id.progressBar);
//        LinearLayout ll_progress = findViewById(R.id.Tv_progress);
//
//        progressBar.setProgress(R_currentPosition);
//
//        TextView tv_progress = ll_progress.findViewById(R.id.Tv_progressBarScore);
//        tv_progress.setText(R_currentPosition + "/" + progressBar.getMax());
//        question.getData();
//        question.getOption1();
//        question.getOption2();
//        question.getOption3();
//
//    }
//
//    private void defultOptionVeiw() {
//        ArrayList<TextView> options = new ArrayList<>();
//        options.add(0, Tv_Choice1Q1);
//        options.add(1, Tv_Choice2Q1);
//        options.add(2, Tv_Choice3Q1);
//
//   //    for (TextView option : options) {
//     //       option.setTextColor(Color.parseColor("#7A8089"));
//        //    option.setTypeface(Typeface.DEFAULT);
//        //    option.setBackground(ContextCompat.getDrawable(this, R.drawable.optionborder));
//     //  }
//    }
//
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.Tv_Choice1Q1:
//                selectedOptionView(Tv_Choice1Q1, 1);
//                break;
//            case R.id.Tv_Choice2Q1:
//                selectedOptionView(Tv_Choice2Q1, 2);
//                break;
//            case R.id.Tv_Choice3Q1:
//                selectedOptionView(Tv_Choice3Q1, 3);
//                break;
//            case R.id.btn_Submit_Questions:
//                if(R_SelectedPosition == 0){
//                    R_currentPosition ++;}
//                break;
//
//        }
//
//    }
//
//    private void selectedOptionView(TextView tv, int selectedOptionNum) {
//        defultOptionVeiw();
//        R_SelectedPosition = selectedOptionNum;
//
//        tv.setTextColor(Color.parseColor("#363A43"));
//        tv.setTypeface(tv.getTypeface(), Typeface.BOLD);
//        tv.setBackground(ContextCompat.getDrawable(this, R.drawable.selectedoptionborder));
//    }
//
//}

package com.example.ass1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LearnActivity extends AppCompatActivity implements View.OnClickListener {

    private int R_currentPosition = 1;
    private ArrayList<LearnData> R_QuestionList = null;
    private int R_SelectedPosition = 0;

    private Button btnSubmitOnClickQuestions;
    private TextView Tv_Choice1Q1;
    private TextView Tv_Choice2Q1;
    private TextView Tv_Choice3Q1;
    private TextView Tv_progressBarScore;
    private int CorrectAnswer = 0 ;
    private String user_name ;

    private String total_question ;
    private String correct_answers ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_learn);
//
//        R_QuestionList = Constants.getLearnData();
//        setLearnData();
//
//        Tv_Choice1Q1 = findViewById(R.id.Tv_Choice1Q1);
//        Tv_Choice2Q1 = findViewById(R.id.Tv_Choice2Q1);
//        Tv_Choice3Q1 = findViewById(R.id.Tv_Choice3Q1);
//
//        Tv_Choice1Q1.setOnClickListener(this);
//        Tv_Choice2Q1.setOnClickListener(this);
//        Tv_Choice3Q1.setOnClickListener(this);
//
//        btnSubmitOnClickQuestions = findViewById(R.id.btn_Submit_Questions);
//        btnSubmitOnClickQuestions.setOnClickListener(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        user_name = getIntent().getStringExtra(Constants.user_name);
        R_QuestionList = new ArrayList<>();

        Tv_Choice1Q1 = findViewById(R.id.Tv_Choice1Q1);
        Tv_Choice2Q1 = findViewById(R.id.Tv_Choice2Q1);
        Tv_Choice3Q1 = findViewById(R.id.Tv_Choice3Q1);

        ProgressBar progressBar  = findViewById(R.id.progressBar);
        Tv_progressBarScore = findViewById(R.id.Tv_progressBarScore);

        Tv_Choice1Q1.setOnClickListener(this);
        Tv_Choice2Q1.setOnClickListener(this);
        Tv_Choice3Q1.setOnClickListener(this);

        Button btnSubmitOnClickQuestions = findViewById(R.id.btn_Submit_Questions);
        btnSubmitOnClickQuestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code here for when the submit button is clicked
            }
        });

    }

    private void setLearnData() {

        R_currentPosition = 1;
        LearnData question = R_QuestionList.get(R_currentPosition - 1);


        defultOptionVeiw();

        if (R_currentPosition == R_QuestionList.size()) {
            btnSubmitOnClickQuestions.setText("Finish");
        } else {
            btnSubmitOnClickQuestions.setText("Submit");
        }

         question = R_QuestionList.get(R_currentPosition - 1);

        ProgressBar progressBar = findViewById(R.id.progressBar);
        LinearLayout ll_progress = findViewById(R.id.Tv_progress);

        progressBar.setProgress(R_currentPosition);

        TextView tv_progress = ll_progress.findViewById(R.id.Tv_progressBarScore);
        tv_progress.setText(R_currentPosition + "/" + progressBar.getMax());
        question.getData();

        Tv_Choice1Q1.setText(question.getOption1());
        Tv_Choice2Q1.setText(question.getOption2());
        Tv_Choice3Q1.setText(question.getOption3());
    }

    private void defultOptionVeiw() {
        ArrayList<TextView> options = new ArrayList<>();
        options.add(0, Tv_Choice1Q1);
        options.add(1, Tv_Choice2Q1);
        options.add(2, Tv_Choice3Q1);

//        for (TextView option : options) {
//            option.setTextColor(Color.parseColor("#7A8089"));
//            option.setTypeface(Typeface.DEFAULT);
//            option.setBackground(ContextCompat.getDrawable(this, R.drawable.optionborder));
//        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Tv_Choice1Q1:
                selectedOptionView(Tv_Choice1Q1, 1);
                break;
            case R.id.Tv_Choice2Q1:
                selectedOptionView(Tv_Choice2Q1, 2);
                break;
            case R.id.Tv_Choice3Q1:
                selectedOptionView(Tv_Choice3Q1, 3);
                break;
        }
    }

    private void selectedOptionView(TextView tv, int selectedOptionNum) {
        defultOptionVeiw();
       R_SelectedPosition = selectedOptionNum;

        tv.setTextColor(Color.parseColor("#363A43"));
       tv.setTypeface(tv.getTypeface(), Typeface.BOLD);
       tv.setBackground(ContextCompat.getDrawable(this, R.drawable.selectedoptionborder));
    }


    public void btnSubmitOnClickQuestions(View v) {

        if (v.getId() == R.id.btn_Submit_Questions) {
            if (R_SelectedPosition == 0) {
                R_currentPosition++;

                if (R_currentPosition <= R_QuestionList.size()) {
                    setLearnData();
                } else {
                    Intent intent = new Intent(this, ResultActivity.class);
                    intent.putExtra(Constants.user_name,user_name);
                    intent.putExtra(Constants.correct_answers,correct_answers);
                    intent.putExtra(Constants.total_question, R_QuestionList.size());
                    startActivity(intent);
                }

            }
            else{
                LearnData question = R_QuestionList.get(R_currentPosition - 1);
                if (question.getCorrect() != R_SelectedPosition) {
                    answerView(R_SelectedPosition, R.drawable.wrongoptionborder);
                }
                else{
                    CorrectAnswer++;
                }
                answerView(question.getCorrect(), R.drawable.correctoptionborder);

                if(R_currentPosition == R_QuestionList.size()){
                    btnSubmitOnClickQuestions.setText("Finish");
                }else{
                    btnSubmitOnClickQuestions.setText("Go to next Question");
                }
                R_SelectedPosition = 0;

            }
        }

    }

    private void answerView(int answer, int drawableView) {
        switch (answer) {
            case 1:
                Tv_Choice1Q1.setBackground(ContextCompat.getDrawable(this, drawableView));
                break;
            case 2:
                Tv_Choice2Q1.setBackground(ContextCompat.getDrawable(this, drawableView));
                break;
            case 3:
                Tv_Choice3Q1.setBackground(ContextCompat.getDrawable(this, drawableView));
                break;
        }
    }



}