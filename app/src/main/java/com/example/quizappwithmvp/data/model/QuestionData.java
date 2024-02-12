package com.example.quizappwithmvp.data.model;

public class QuestionData {
    private final int question;
    private final Integer[] variants;
    private final Integer answer;

    public QuestionData(int question,
                        int variant1,
                        int variant2,
                        int variant3,
                        int variant4,
                        int answer) {
        this.question = question;
        this.variants = new Integer[]{variant1, variant2, variant3, variant4};
        this.answer = answer;
    }

    public int getQuestion() {
        return question;
    }

    public Integer[] getVariants() {
        return variants;
    }

    public Integer getAnswer() {
        return answer;
    }
}
