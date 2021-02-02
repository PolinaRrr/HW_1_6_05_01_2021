package com.example.hw_1_6_05_01_2021;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DescriptionOfNoteFragment extends Fragment {

    private TextView noteDescriptionTextView;
    private String[] noteDescriptionArray;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View rootView =
                inflater.inflate(R.layout.description_of_note_fragment, container, false);
        noteDescriptionTextView = rootView.findViewById(R.id.editTextTextMultiLine);
        noteDescriptionArray = getResources().getStringArray(R.array.notes);

        return rootView;
    }
    public void setDescription(int buttonIndex) {
        String catDescription = noteDescriptionArray[buttonIndex];
        noteDescriptionTextView.setText(catDescription);

    }
}
