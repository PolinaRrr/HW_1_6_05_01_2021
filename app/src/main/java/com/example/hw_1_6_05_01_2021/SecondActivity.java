package com.example.hw_1_6_05_01_2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }

        Intent intent = getIntent();
        int buttonIndex = intent.getIntExtra("buttonIndex", -1);
        if (buttonIndex != -1) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            DescriptionOfNoteFragment descriptionOfNoteFragment = (DescriptionOfNoteFragment) fragmentManager
                    .findFragmentById(R.id.fragment4);
            if (descriptionOfNoteFragment != null) {
                descriptionOfNoteFragment.setDescription(buttonIndex);
            }
        }
    }
}