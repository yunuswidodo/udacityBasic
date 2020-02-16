package e.yunus.callingobjectmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("wooo");
        textView.setTextSize(50);
        textView.setTextColor(Color.GREEN);
        setContentView(textView);
    }
}
