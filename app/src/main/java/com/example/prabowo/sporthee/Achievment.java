package com.example.prabowo.sporthee;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Achievment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer2);

        if (fragment == null) {
            fragment = new CardFragment2();
            ;
            fm.beginTransaction()
                    .add(R.id.fragmentContainer2, fragment)
                    .commit();


        }
    }
}
