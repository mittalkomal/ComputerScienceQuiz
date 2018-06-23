package com.example.komal.computersciencequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreq1 = 0, scoreq2 = 0, scoreq3 = 0, scoreq4 = 0, scoreq5 = 0, scoreq6 = 0, totalcorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickq3(View view) {
        RadioButton editq3 = findViewById(R.id.q3_opt2);
        if (editq3.isChecked())
            scoreq3 = 1;
        else
            scoreq3 = 0;
    }


    public void onclickq4(View view) {
        RadioButton editq4 = findViewById(R.id.q4_opt4);
        if (editq4.isChecked())
            scoreq4 = 1;
        else
            scoreq4 = 0;
    }

    public void onclickq5(View view) {
        CheckBox q5opt1 =  findViewById(R.id.q5_opt1);
        CheckBox q5opt2 =  findViewById(R.id.q5_opt2);
        CheckBox q5opt3 =  findViewById(R.id.q5_opt3);
        CheckBox q5opt4 = findViewById(R.id.q5_opt4);
        if (q5opt1.isChecked() && q5opt2.isChecked() && (!q5opt3.isChecked()) && (q5opt4.isChecked())) {
            scoreq5 = 1;
        } else {
            scoreq5 = 0;
        }
    }

    public void onclickq6(View view) {
        CheckBox q6opt1 =  findViewById(R.id.q6_opt1);
        CheckBox q6opt2 =  findViewById(R.id.q6_opt2);
        CheckBox q6opt3 =  findViewById(R.id.q6_opt3);
        CheckBox q6opt4 =  findViewById(R.id.q6_opt4);
        if (q6opt1.isChecked() && q6opt2.isChecked() && (q6opt3.isChecked()) && (!q6opt4.isChecked())) {
            scoreq6 = 1;
        } else {
            scoreq6 = 0;
        }
    }

    public void submitTest1(View view) {
        EditText editq1 =  findViewById(R.id.q1);
        String q1 = editq1.getText().toString();
        if (q1.equalsIgnoreCase("google"))
            scoreq1 = 1;
        else
            scoreq1 = 0;
        EditText editq2 =  findViewById(R.id.q2);
        String q2 = editq2.getText().toString();
        if (q2.equalsIgnoreCase("ibm"))
            scoreq2 = 1;
        else
            scoreq2 = 0;
        totalcorrect = scoreq1 + scoreq2 + scoreq3 + scoreq4 + scoreq5 + scoreq6;
        Toast toast = Toast.makeText(getApplicationContext(), "No. of correct answers " + totalcorrect, Toast.LENGTH_SHORT);
        toast.show();
    }

    private void display(int score) {
        TextView display =  findViewById(R.id.display);
        display.setText("Your total score : " + score);
    }

    public void submitTest2(View view) {
        display(totalcorrect * 5);
    }
}


