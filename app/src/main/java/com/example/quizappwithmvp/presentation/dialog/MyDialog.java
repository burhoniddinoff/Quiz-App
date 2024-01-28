package com.example.quizappwithmvp.presentation.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.quizappwithmvp.R;

public class MyDialog extends DialogFragment {
    SelectListener listener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_dialog, container);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.yes).setOnClickListener(v -> {
            listener.yes();
            dismiss();
        });

        view.findViewById(R.id.no).setOnClickListener(v -> {
            listener.no();
            dismiss();
        });
    }

    public void setSelectListener(SelectListener listener) {
        this.listener = listener;
    }

}
