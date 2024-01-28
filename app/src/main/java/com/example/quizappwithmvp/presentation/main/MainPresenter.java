package com.example.quizappwithmvp.presentation.main;

import com.example.quizappwithmvp.data.model.QuestionData;

import java.util.List;

public class MainPresenter implements MainContract.Present {
    private MainContract.View view;
    private MainContract.Model model;
    private List<QuestionData> questionDataList;
    private int currentPos = 0;
    private int correctCount = 0;
    private int wrongCount = 0;
    private int selectIndex = -1;

    MainPresenter(MainContract.View view) {
        this.view = view;
        this.model = new MainModel();

        loadQuestionData();
        loadQuestionByPos();
    }

    private void loadQuestionData() {
        this.questionDataList = model.getQuestionByCategory();
    }

    private void loadQuestionByPos() {
        view.descriptionQuestion(questionDataList.get(currentPos));
    }

    @Override
    public void selectAnswer(int pos) {
        if (pos == this.selectIndex) return;
        if (selectIndex > -1) view.clearOldStates(selectIndex);
        selectIndex = pos;

        view.nextButtonStates(true);
        view.showSelectIndex(pos);
    }

    @Override
    public void clickNextButton() {
        QuestionData currentQuestion = questionDataList.get(currentPos);
        if (currentQuestion.getAnswer().equals(currentQuestion.getVariants()[selectIndex])) {
            this.correctCount++;
        } else this.wrongCount++;

        view.clearOldStates(selectIndex);
        view.nextButtonStates(false);
        currentPos++;
        view.showCount(currentPos + 1);
        if (currentPos == questionDataList.size()) view.showResult(correctCount, wrongCount);
        else view.descriptionQuestion(questionDataList.get(currentPos));
        selectIndex = -1;
    }

    @Override
    public void clickFinishButton() {
        view.showResult(correctCount, wrongCount);
    }
}