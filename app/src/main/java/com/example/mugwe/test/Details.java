package com.example.mugwe.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView name, id, score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        name = (TextView) findViewById(R.id.student_name);
        id = (TextView) findViewById(R.id.student_id);
        score = (TextView) findViewById(R.id.student_score);

        Bundle extras = getIntent().getExtras();

        name.setText("Name: " + extras.getString("student_name"));
        id.setText("Id: " + extras.getString("student_name"));
        score.setText("Score: " + extras.getString("student_name"));
    }
    public void exit_app(View v){
        this.finish();
        System.exit(0);
    }
}
