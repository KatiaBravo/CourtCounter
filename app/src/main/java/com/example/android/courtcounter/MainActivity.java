package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/**
 * This displays for Team A.
 */

    /**
     * Displays the given score when +3 points is clicked.
     */
    public void addThreeForTeamA (View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score when +2 points is clicked.
     */
    public void addTwoForTeamA (View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score when Free Throw is clicked.
     */
    public void addOneForTeamA (View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

/**
 * This displays for Team B.
 */
    /**
     * Displays the given score when +3 points is clicked.
     */
    public void addThreeForTeamB (View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score when +2 points is clicked.
     */
    public void addTwoForTeamB (View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score when Free Throw is clicked.
     */
    public void addOneForTeamB (View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore (View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
