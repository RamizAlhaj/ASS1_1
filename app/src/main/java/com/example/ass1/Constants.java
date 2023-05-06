package com.example.ass1;

import java.util.ArrayList;

public class Constants {

    static String user_name = "user_name";
    static String total_question = "total_question";
    static String correct_answers = "correct_answer";

    public static ArrayList<LearnData> getLearnData() {
        ArrayList<LearnData> questionValues = new ArrayList<LearnData>();

        LearnData question1 = new LearnData(1, "What is the result of 5 + 7?", "The Result equal 10",
                "The Result equal 13", "The Result equal 12", 3);
        questionValues.add(question1);

        LearnData question2 = new LearnData(1, "What is 3 x 4?", "The Result equal 10",
                "The Result equal 12", "The Result equal 7", 2);
        questionValues.add(question2);

        LearnData question3 = new LearnData(1, "What is 8 - 3?", "The Result equal 5",
                "The Result equal 13", "The Result equal 11", 1);
        questionValues.add(question3);

        LearnData question4 = new LearnData(1, "What is 5 + 7?", "The Result equal 10",
                "The Result equal 13", "The Result equal 12", 3);
        questionValues.add(question4);

        LearnData question5 = new LearnData(1, "What is the value of pi?", "The Result equal 2.14",
                "The Result equal 4.14", "The Result equal 3.14", 3);
        questionValues.add(question5);

        LearnData question6 = new LearnData(1, "What is the square root of 16?", "The Result equal 8",
                "The Result equal 4", "The Result equal 16", 2);
        questionValues.add(question6);

        LearnData question7 = new LearnData(1, "What is 10 divided by 2?", "The Result equal 5",
                "The Result equal 8", "The Result equal 20", 1);
        questionValues.add(question7);

        LearnData question8 = new LearnData(1, "What is the next number in the sequence: 1, 3, 5, 7,___?", "The Result equal 8",
                "The Result equal 9", "The Result equal 10", 2);
        questionValues.add(question8);


        // add more questions here as needed
        return questionValues;
    }

}



