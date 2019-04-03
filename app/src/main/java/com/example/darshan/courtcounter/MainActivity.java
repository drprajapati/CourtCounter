package com.example.darshan.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displaying score for team A
     */
    public void displayForTeamA(int scoreA){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }
    /**
     * Displaying score for +3
     */
    public void threePointsTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    public void twoPointsTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    public void freeThrowTeamA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displaying score for team B
     */
    public void displayForTeamB(int scoreB){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
    /**
     * Displaying score for +3
     */
    public void threePointsTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    public void twoPointsTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    public void freeThrowTeamB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * For Resetting score
     */
    public void resetScore(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
