package com.example.quizappwithmvp.presentation.main;

import com.example.quizappwithmvp.data.model.QuestionData;
import com.example.quizappwithmvp.domain.AppController;

import java.util.List;

public class MainModel implements MainContract.Model {
    AppController controller = AppController.getInstance();

    @Override
    public List<QuestionData> getQuestionByCategory() {
        return controller.getQuestionByCategory();
    }
}
