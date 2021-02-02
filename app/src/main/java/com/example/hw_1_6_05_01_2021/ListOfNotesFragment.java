package com.example.hw_1_6_05_01_2021;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListOfNotesFragment extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View rootView =
                inflater.inflate(R.layout.list_of_notes_fragment, container, false);
        Button button1 = (Button) rootView.findViewById(R.id.button);
        Button button2 = (Button) rootView.findViewById(R.id.button2);
        Button button3 = (Button) rootView.findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        return rootView;
    }
    int translateIdToIndex(int id) {
        int index = -1;
        switch (id) {
            case R.id.button:
                index = 1;
                break;
            case R.id.button2:
                index = 2;
                break;
            case R.id.button3:
                index = 3;
                break;
        }
        return index;
    }

    @Override
    public void onClick(View v) {

        int buttonIndex = translateIdToIndex(v.getId());

        Toast.makeText(getActivity(), "Note № " + String.valueOf(buttonIndex) +" is open ",
                Toast.LENGTH_SHORT).show();
    }

}
