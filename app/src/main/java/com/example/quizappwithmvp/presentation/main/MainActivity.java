package com.example.quizappwithmvp.presentation.main;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.quizappwithmvp.R;
import com.example.quizappwithmvp.data.model.QuestionData;
import com.example.quizappwithmvp.presentation.win.WinActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private MainContract.Present present;
    private TextView textQuestion;
    private Button btnNext;
    private List<ImageView> images;
    private List<TextView> texts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadViews();
        present = new MainPresenter(this);
    }

    @SuppressLint("SetTextI18n")
    private void loadViews() {
        textQuestion = findViewById(R.id.text_question);
        btnNext = findViewById(R.id.btn_next);
        Button btnFinish = findViewById(R.id.btn_finish);

        images = new ArrayList<>();
        images.add(findViewById(R.id.image_variant_1));
        images.add(findViewById(R.id.image_variant_2));
        images.add(findViewById(R.id.image_variant_3));
        images.add(findViewById(R.id.image_variant_4));

        texts = new ArrayList<>();
        texts.add(findViewById(R.id.text_variant_1));
        texts.add(findViewById(R.id.text_variant_2));
        texts.add(findViewById(R.id.text_variant_3));
        texts.add(findViewById(R.id.text_variant_4));

        List<ViewGroup> groupsVariant = new ArrayList<>();
        groupsVariant.add(findViewById(R.id.variant1));
        groupsVariant.add(findViewById(R.id.variant2));
        groupsVariant.add(findViewById(R.id.variant3));
        groupsVariant.add(findViewById(R.id.variant4));

        for (int i = 0; i < groupsVariant.size(); i++) {
            int index = i;
            groupsVariant.get(i).setOnClickListener(v -> present.selectAnswer(index));
        }

        findViewById(R.id.buttonBack).setOnClickListener(v -> new AlertDialog.Builder(MainActivity.this, R.style.CustomAlertDialog)
                .setTitle("Exit")
                .setMessage("Do you want to exit ?")
                .setPositiveButton("Yes", (dialog, which) -> finish())
                .setNegativeButton("No", (dialog, which) -> {
                })
                .create()
                .show());


        btnNext.setOnClickListener(v -> present.clickNextButton());
        btnFinish.setOnClickListener(v -> new AlertDialog.Builder(MainActivity.this, R.style.CustomAlertDialog)
                .setTitle("Finish")
                .setMessage("Do you want to finish ?")
                .setPositiveButton("Yes", (dialog, which) -> present.clickFinishButton())
                .setNegativeButton("No", (dialog, which) -> {
                })
                .create()
                .show());
    }


    @Override
    public void clearOldStates(int pos) {
        images.get(pos).setImageResource(R.drawable.ic_uncheck);
        findViewById(R.id.btn_next).setBackgroundResource(R.drawable.bg_radius_2);
    }

    @Override
    public void nextButtonStates(boolean bool) {
        btnNext.setEnabled(bool);
    }

    @Override
    public void descriptionQuestion(QuestionData data) {
        textQuestion.setText(data.getQuestion());
        for (int i = 0; i < texts.size(); i++) {
            texts.get(i).setText(data.getVariants()[i]);
        }
    }

    @Override
    public void showSelectIndex(int index) {
        images.get(index).setImageResource(R.drawable.ic_check);
        findViewById(R.id.btn_next).setBackgroundResource(R.drawable.bg_radius);
    }

    @Override
    public void showResult(int correctCount, int wrongCount) {
        Intent intent = new Intent(MainActivity.this, WinActivity.class);
        intent.putExtra("correct", correctCount);
        intent.putExtra("wrong", wrongCount);
        startActivity(intent);
        finish();
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void showCount(int count) {
        if (count == 11) return;
        TextView textView = findViewById(R.id.countTest);
        textView.setText(count + "/10");
    }

}