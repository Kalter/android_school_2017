package com.gdgkazan.summer_school_2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.gdgkazan.summer_school_2017.lesson_3.activities.BeersActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);

        initViews();
    }

    private void initViews() {
        findViewById(R.id.btnNetwork).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BeersActivity.class));
            }
        });
    }
}