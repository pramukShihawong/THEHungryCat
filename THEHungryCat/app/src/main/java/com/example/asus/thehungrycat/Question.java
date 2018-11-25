package com.example.asus.thehungrycat;

public class Question {
    public String mQuestion[] = {
            "5+4",
            "16+2",
            "12+6",
            "5-3",
            "4+1",
            "16/2",
            "15*2",
            "12+15",
            "16+10",
            "24-12"
    };

    private String mChoice[][] ={
            {"12","9","14","30"},
            {"13","17","18","14"},
            {"14","31","12","18"},
            {"2","14","10","16"},
            {"10","12","5","13"},
            {"7","8","5","12"},
            {"17","16","30","13"},
            {"14","18","24","27"},
            {"26","21","13","17"},
            {"15","12","16","19"}
    };

    private String mCorrectAnswer[] = {"9","18","18","2","5","8","30","27","26","12"};

    public String getQuestion(int a) {
        String question = mQuestion[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoice[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoice[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoice[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoice[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }


}
