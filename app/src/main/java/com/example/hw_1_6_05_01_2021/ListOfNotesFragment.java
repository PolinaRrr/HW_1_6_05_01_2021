package com.example.hw_1_6_05_01_2021;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListOfNotesFragment extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_of_notes_fragment, container, false);
        Button button1 = rootView.findViewById(R.id.button_2);
        Button button2 = rootView.findViewById(R.id.button_1);
        Button button3 = rootView.findViewById(R.id.button_3);
        Button button4 = rootView.findViewById(R.id.button_4);
        Button button5 = rootView.findViewById(R.id.button_5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

        return rootView;
    }
    int translateIdToIndex(int id) {
        int index = -1;
        switch (id) {

            case R.id.button_1:
                index = 1;
                break;
            case R.id.button_2:
                index = 2;
                break;
            case R.id.button_3:
                index = 3;
                break;
            case R.id.button_4:
                index = 4;
                break;
            case R.id.button_5:
                index = 5;
                break;
        }
        return index;
    }

    @Override
    public void onClick(View v) {
        int buttonIndex = translateIdToIndex(v.getId());
        OnSelectedButtonListener listener = (OnSelectedButtonListener) getActivity();
        listener.onButtonSelected(buttonIndex);

        buttonIndex = translateIdToIndex(v.getId());

        Toast.makeText(getActivity(), "Note № " + String.valueOf(buttonIndex) +" is open ",
                Toast.LENGTH_SHORT).show();
    }

    public interface OnSelectedButtonListener {
        void onButtonSelected(int buttonIndex);
    }
}
