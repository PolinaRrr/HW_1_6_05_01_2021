package com.example.hw_1_6_05_01_2021;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ListOfNotesFragment.OnSelectedButtonListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_open);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.setDrawerIndicatorEnabled(true);
        drawerToggle.syncState();
    }

    @Override
    public void onButtonSelected(int buttonIndex) {

        FragmentManager fragmentManager = getSupportFragmentManager();

        DescriptionOfNoteFragment descriptionOfNoteFragment =
                (DescriptionOfNoteFragment) fragmentManager.findFragmentById(R.id.fragment4);
        if (descriptionOfNoteFragment == null || !descriptionOfNoteFragment.isVisible()) {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("buttonIndex", buttonIndex);
            startActivity(intent);
        } else {
            descriptionOfNoteFragment.setDescription(buttonIndex);
        }
    }
}