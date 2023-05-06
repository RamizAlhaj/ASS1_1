package com.example.ass1;

public class LearnData {
    private int id;
    private String Data;
    private String option1;
    private String option2;
    private String option3;
    private int Correct;

    public LearnData(int id, String data, String option1, String option2, String option3, int correct) {
        this.id = id;
        this.Data = data;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.Correct = correct;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }


    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public int getCorrect() {
        return Correct;
    }

    public void setCorrect(int correct) {
        Correct = correct;
    }


}
