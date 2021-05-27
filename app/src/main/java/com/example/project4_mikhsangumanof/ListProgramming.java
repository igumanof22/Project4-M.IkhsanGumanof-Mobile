package com.example.project4_mikhsangumanof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ListProgramming extends AppCompatActivity {
    String[] language = {"Java","C","Python","PHP","C++","Perl","Ruby"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_programming);
    }
}
