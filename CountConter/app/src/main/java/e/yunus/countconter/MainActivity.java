package e.yunus.countconter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeam(8);
    }

    public void displayForTeam(int score){
        TextView scoreView = findViewById(R.id.team_a_score);
        //value of mengembalikan object integer yang memegang nilai primitif tertentu
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View view) {
        displayForTeam(3);
    }

    public void addTwoForTeamA(View view) {
        displayForTeam(3);
    }

    public void addOneForTeamA(View view) {
        displayForTeam(3);
    }
}
