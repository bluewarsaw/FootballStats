package pl.sebastianczarnecki.footballstats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int goalA;
    int goalB;
    int asA;
    int asB;
    int ofA;
    int ofB;
    int cardA;
    int cardB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**Display Goal for Home Team*/

    public void displayforHome(int score){
        TextView scoreView = (TextView) findViewById(R.id.HomeGoal);
        scoreView.setText(String.valueOf(score));
    }

    public void addGoalHome (View v){
        goalA=goalA+1;
        displayforHome(goalA);
    }

    /**Display Attempts for Home*/

    public void displayforHomeAtt(int attempts){
        TextView attemptsView = (TextView) findViewById(R.id.HomeAtt);
        attemptsView.setText(String.valueOf(attempts));
    }

    public void addHomeAtt (View v){
        asA=asA+1;
        displayforHomeAtt(asA);
    }

    /**Display Offsides for Home */

    public void displayforHomeOff(int offsides){
        TextView offsidesView = (TextView) findViewById(R.id.HomeOff);
        offsidesView.setText(String.valueOf(offsides));
    }

    public void addHomeOff (View v){
        ofB=ofB+1;
        displayforHomeOff(ofB);
    }


    /**Display Goal for Away Team*/

    public void displayforAway(int score){
        TextView scoreView = (TextView) findViewById(R.id.AwayGoal);
        scoreView.setText(String.valueOf(score));
    }

    public void addAwayGoal (View v){
        goalB=goalB+1;
        displayforAway(goalB);
    }

    /**Display Attempts for Away Team */

    public void displayforAwayAtt(int attemps){
        TextView attempsView = (TextView) findViewById(R.id.AwayAtt);
        attempsView.setText(String.valueOf(attemps));
    }

    public void addAwayAtt (View v){
        asB=asB+1;
        displayforAwayAtt(asB);
    }

    /**Display Offsides for Away Team */

    public void displayforAwatOff(int offsides){
        TextView offsidesView = (TextView) findViewById(R.id.AwayOff);
        offsidesView.setText(String.valueOf(offsides));
    }

    public void addAwayOff (View v){
        ofA=ofA+1;
        displayforAwatOff(ofA);
    }




    /**Reset Home */
    public void resetHome (View v){
        goalA=0;
        asA=0;
        ofA=0;
        displayforHome(goalA);
        displayforHomeAtt(asA);
        displayforHomeOff(ofA);
    }


    /**Reset Away */
    public void resetAway (View v){
        goalB=0;
        asB=0;
        ofB=0;
        displayforAway(goalB);
        displayforAwayAtt(asB);
        displayforAwatOff(ofB);
    }

    /**
     * Reset all
     */

    public void reset (View v) {
        goalA=0;
        goalB=0;
        asA=0;
        asB=0;
        ofA=0;
        ofB=0;
        cardA=0;
        cardB=0;
        displayforHome(goalA);
        displayforHomeAtt(asA);
        displayforHomeOff(ofA);
        displayforAway(goalB);
        displayforAwayAtt(asB);
        displayforAwatOff(ofB);
    }

}
