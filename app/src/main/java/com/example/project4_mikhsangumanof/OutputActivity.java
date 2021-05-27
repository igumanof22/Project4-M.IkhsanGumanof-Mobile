package com.example.project4_mikhsangumanof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {
    TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        txtOutput = findViewById(R.id.txtDetail);

        Intent intent = getIntent();
        String dataTransfer = intent.getSerializableExtra("output").toString();

        txtOutput.setText(dataTransfer);
    }
}
