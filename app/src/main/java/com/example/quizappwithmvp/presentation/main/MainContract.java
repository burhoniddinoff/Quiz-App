package com.example.quizappwithmvp.presentation.main;

import com.example.quizappwithmvp.data.model.QuestionData;

import java.util.List;

public interface MainContract {
    interface Model {
        List<QuestionData> getQuestionByCategory();
    }

    interface View {
        void clearOldStates(int pos);

        void nextButtonStates(boolean bool);

        void descriptionQuestion(QuestionData data);

        void showSelectIndex(int index);

        void showResult(int correctCount, int wrongCount);

        void showCount(int count);


    }

    interface Present {
        void selectAnswer(int pos);

        void clickNextButton();

        void clickFinishButton();
    }


}
