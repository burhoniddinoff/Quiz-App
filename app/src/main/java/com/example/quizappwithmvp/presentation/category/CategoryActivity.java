package com.example.quizappwithmvp.presentation.category;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizappwithmvp.R;
import com.example.quizappwithmvp.data.model.CategoryEnum;
import com.example.quizappwithmvp.presentation.main.MainActivity;

public class CategoryActivity extends AppCompatActivity implements CategoryContract.View {
    protected CategoryContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        presenter = new CategoryPresenter(this);
        attachViews();
    }

    private void attachViews() {
//        findViewById(R.id.subject).setOnClickListener(v -> presenter.setSelectCategory(CategoryEnum.SUBJECT));
//        findViewById(R.id.countries).setOnClickListener(v -> presenter.setSelectCategory(CategoryEnum.COUNTRIES));
//        findViewById(R.id.planet).setOnClickListener(v -> presenter.setSelectCategory(CategoryEnum.PLANET));
        findViewById(R.id.php).setOnClickListener(v -> presenter.setSelectCategory(CategoryEnum.PHP));
        findViewById(R.id.java).setOnClickListener(v -> presenter.setSelectCategory(CategoryEnum.JAVA));
        findViewById(R.id.kotlin).setOnClickListener(v -> presenter.setSelectCategory(CategoryEnum.KOTLIN));
        findViewById(R.id._c_).setOnClickListener(v -> presenter.setSelectCategory(CategoryEnum.C__));
    }

    @Override
    public void openQuestionActivity() {
        startActivity(new Intent(CategoryActivity.this, MainActivity.class));
    }
}