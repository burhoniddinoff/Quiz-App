package com.example.quizappwithmvp.presentation.category;

import com.example.quizappwithmvp.data.model.CategoryEnum;

public interface CategoryContract {
    interface Model {
        void setSelectCategory(CategoryEnum category);
    }

    interface View {
        void openQuestionActivity();
    }

    interface Presenter {
        void setSelectCategory(CategoryEnum category);
    }
}
