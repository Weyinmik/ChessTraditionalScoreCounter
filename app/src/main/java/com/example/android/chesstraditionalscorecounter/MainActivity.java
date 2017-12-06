package com.example.android.chesstraditionalscorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double scoreWhite = 0;
    double scoreBlack = 0;
    int gameRound = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * WHITE
     */

    /**
     * This increases the point by 1 when the +1WIN Button in White is clicked
     */
    public void submitWinWhite(View view){
        scoreWhite = scoreWhite + 1;
        displayForWhite (scoreWhite);

    }

    /**
     * This increases the points by 0.5 when the 1/2Draw Button in White is clicked
     */
    public void submitDrawWhite (View view){
        scoreWhite = scoreWhite + 0.5;
        displayForWhite(scoreWhite);
    }

    /**
     * This increases the point by 0 when the +0LOSS Button in White is clicked
     */
    public void submitLossWhite (View view){
        scoreWhite = scoreWhite + 0;
        displayForWhite(scoreWhite);
    }

    /**
     * BLACK
     */

    /**
     * This increases the point by 1 when the +1WIN Button in Black is clicked
     */
    public void submitWinBlack (View view){
        scoreBlack = scoreBlack + 1;
        displayForBlack(scoreBlack);
    }

    /**
     * This increases the point by 0.5 when the +1WIN Button in Black is clicked
     */
    public void submitDrawBlack (View view){
        scoreBlack = scoreBlack + 0.5;
        displayForBlack(scoreBlack);
    }

    /**
     * This increases the point by 0 when the +0LOSS Button in Black is clicked
     */
    public void submitLossBlack (View view){
        scoreBlack = scoreBlack + 0;
        displayForBlack(scoreBlack);
    }

    /**
     * RESET SCORE
     */
    public void resetScore (View view){
        scoreWhite = 0;
        scoreBlack = 0;
        displayForWhite(scoreWhite);
        displayForBlack(scoreBlack);
    }


    /**
     * Displays the given score for White.
     */
    public void displayForWhite(double score) {
        TextView scoreView = (TextView) findViewById(R.id.white_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Black.
     */
    public void displayForBlack(double score) {
        TextView scoreView = (TextView) findViewById(R.id.black_score);
        scoreView.setText(String.valueOf(score));
    }
}


