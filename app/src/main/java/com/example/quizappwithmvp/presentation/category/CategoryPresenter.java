package com.example.quizappwithmvp.presentation.category;

import com.example.quizappwithmvp.data.model.CategoryEnum;

public class CategoryPresenter implements CategoryContract.Presenter {
    private final CategoryContract.Model model;
    private final CategoryContract.View view;

    public CategoryPresenter(CategoryContract.View view) {
        this.model = new CategoryModel();
        this.view = view;
    }

    @Override
    public void setSelectCategory(CategoryEnum category) {
        model.setSelectCategory(category);
        view.openQuestionActivity();
    }
}
