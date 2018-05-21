package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int VALUE_OF_THREE_POINT = 3;
    private int VALUE_OF_TWO_POINTS = 2;
    private int VALUE_OF_FREE_THROW = 1;
    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
    }

    public void displayForTeamA(int score){
        TextView scoreview = (TextView) findViewById(R.id.team_A_score);
        scoreview.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreview = (TextView) findViewById(R.id.team_B_score);
        scoreview.setText(String.valueOf(score));
    }

    public void addThreeA(View view){
        scoreA += VALUE_OF_THREE_POINT;
        displayForTeamA(scoreA);
    }

    public void addTwoA(View view){
        scoreA += VALUE_OF_TWO_POINTS;
        displayForTeamA(scoreA);
    }

    public void addOneA(View view){
        scoreA += VALUE_OF_FREE_THROW;
        displayForTeamA(scoreA);
    }

    public void addThreeB(View view){
        scoreB += VALUE_OF_THREE_POINT;
        displayForTeamB(scoreB);
    }

    public void addTwoB(View view){
        scoreB += VALUE_OF_TWO_POINTS;
        displayForTeamB(scoreB);
    }

    public void addOneB(View view){
        scoreB += VALUE_OF_FREE_THROW;
        displayForTeamB(scoreB);
    }

    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
