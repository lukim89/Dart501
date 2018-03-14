package com.example.android.dart501;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scorePlayerA = 501;
    int scorePlayerB = 501;
    int fieldPlayerA = 0;
    int fieldPlayerB = 0;
    int lastScorePlayerA = 0;
    int lastScorePlayerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        if (scorePlayerA > 0) {
            lastScorePlayerA = scorePlayerA;
            TextView scoreView = findViewById(R.id.player_a_score);
            scoreView.setText(String.valueOf(score));
        } else {
            if (scorePlayerA < 0) {
                scorePlayerA = lastScorePlayerA;
                Toast.makeText(this, "You've got too much.", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "You won !!! Congratulations!", Toast.LENGTH_SHORT).show();
                TextView scoreView = findViewById(R.id.player_a_score);
                scoreView.setText(String.valueOf(score));
                resetScore(null);
            }
        }
    }

    /**
     * This method is called when plus button is clicked in Team A.
     */
    public void incrementPlayerAField(View view) {
        fieldPlayerA = fieldPlayerA + 1;
        if (fieldPlayerA > 20) {
            Toast.makeText(this, "You cannot choose more then 20.", Toast.LENGTH_SHORT).show();
            fieldPlayerA = 20;
        }
        displayPlayerAField(fieldPlayerA);
    }

    /**
     * This method is called when minus button is clicked in Team A.
     */
    public void decrementPlayerAField(View view) {
        fieldPlayerA = fieldPlayerA - 1;
        if (fieldPlayerA < 0) {
            Toast.makeText(this, "You cannot choose less than 0.", Toast.LENGTH_SHORT).show();
            fieldPlayerA = 0;
        }
        displayPlayerAField(fieldPlayerA);
    }

    /**
     * This method displays the given field value for Player A.
     */
    private void displayPlayerAField(int numer) {
        TextView quantityTextView = findViewById(R.id.player_a_field);
        quantityTextView.setText("" + numer);
    }

    /**
     * This method is called when x1 button is clicked in Player A.
     */
    public void singlePlayerA(View view) {
        scorePlayerA = scorePlayerA - fieldPlayerA;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * This method is called when x2 button is clicked in Player A.
     */
    public void doublePlayerA(View view) {
        scorePlayerA = scorePlayerA - 2 * fieldPlayerA;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * This method is called when x3 button is clicked in Player A.
     */
    public void triplePlayerA(View view) {
        scorePlayerA = scorePlayerA - 3 * fieldPlayerA;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * This method is called when Outer button is clicked in Player A.
     */
    public void outerPlayerA(View view) {
        scorePlayerA = scorePlayerA - 25;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * This method is called when Bull Eye button is clicked in Player A.
     */
    public void bullPlayerA(View view) {
        scorePlayerA = scorePlayerA - 50;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Displays the given score for Player B.
     */
    public void displayForPlayerB(int score) {
        if (scorePlayerB > 0) {
            lastScorePlayerB = scorePlayerB;
            TextView scoreView = findViewById(R.id.player_b_score);
            scoreView.setText(String.valueOf(score));
        } else {
            if (scorePlayerB < 0) {
                scorePlayerB = lastScorePlayerB;
                Toast.makeText(this, "You've got too much.", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "You won !!! Congratulations!", Toast.LENGTH_SHORT).show();
                TextView scoreView = findViewById(R.id.player_b_score);
                scoreView.setText(String.valueOf(score));
                resetScore(null);
            }
        }
    }

    /**
     * This method is called when plus button is clicked in Team B.
     */
    public void incrementPlayerBField(View view) {

        fieldPlayerB = fieldPlayerB + 1;
        if (fieldPlayerB > 20) {
            Toast.makeText(this, "You cannot choose more then 20.", Toast.LENGTH_SHORT).show();
            fieldPlayerB = 20;
        }
        displayPlayerBField(fieldPlayerB);
    }

    /**
     * This method is called when minus button is clicked in Team A.
     */
    public void decrementPlayerBField(View view) {
        fieldPlayerB = fieldPlayerB - 1;
        if (fieldPlayerB < 0) {
            Toast.makeText(this, "You cannot choose less than 0.", Toast.LENGTH_SHORT).show();
            fieldPlayerB = 0;
        }
        displayPlayerBField(fieldPlayerB);
    }

    /**
     * This method displays the given field value for Player B.
     */
    private void displayPlayerBField(int numer) {
        TextView quantityTextView = findViewById(R.id.player_b_field);
        quantityTextView.setText("" + numer);
    }

    /**
     * This method is called when x1 button is clicked in Player B.
     */
    public void singlePlayerB(View view) {
        scorePlayerB = scorePlayerB - fieldPlayerB;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * This method is called when x2 button is clicked in Player A.
     */
    public void doublePlayerB(View view) {
        scorePlayerB = scorePlayerB - 2 * fieldPlayerB;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * This method is called when x3 button is clicked in Player B.
     */
    public void triplePlayerB(View view) {
        scorePlayerB = scorePlayerB - 3 * fieldPlayerB;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * This method is called when Outer button is clicked in Player B.
     */
    public void outerPlayerB(View view) {
        scorePlayerB = scorePlayerB - 25;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * This method is called when Bull Eye button is clicked in Player B.
     */
    public void bullPlayerB(View view) {
        scorePlayerB = scorePlayerB - 50;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * This method is called when Reset button is clicked
     */
    public void resetScore(View view) {
        scorePlayerA = 501;
        scorePlayerB = 501;
        displayForPlayerB(scorePlayerB);
        displayForPlayerA(scorePlayerA);
    }
}
