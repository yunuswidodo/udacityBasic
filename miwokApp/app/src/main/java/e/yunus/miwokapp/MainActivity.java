package e.yunus.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumberList(View view) {
        Intent i = new Intent(this, NumbersActivity.class);
        Toast.makeText(getApplicationContext(), "cobaba",Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
}
