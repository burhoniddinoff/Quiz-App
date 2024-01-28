package com.example.quizappwithmvp.presentation.category;

import com.example.quizappwithmvp.data.model.CategoryEnum;
import com.example.quizappwithmvp.domain.AppController;

public class CategoryModel implements CategoryContract.Model {
    private AppController controller = AppController.getInstance();

    @Override
    public void setSelectCategory(CategoryEnum category) {
        controller.setSelectCategory(category);
    }
}
