package e.yunus.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the view that show the numbers categori
        TextView numbers = findViewById(R.id.numbers);
        //set a clicklistener on that view
        numbers.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "coba", Toast.LENGTH_SHORT).show();
                Intent numberIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numberIntent);
            }
        });

        //find the view that show the family categori
        TextView family = findViewById(R.id.family);
        //set a clicklistener on that view
        family.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "coba", Toast.LENGTH_SHORT).show();
                Intent FamilyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(FamilyIntent);
            }
        });


        TextView color = findViewById(R.id.colors);
        color.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "coba", Toast.LENGTH_SHORT).show();
                Intent ColorIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(ColorIntent);
            }
        });

        TextView phrases =  findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "coba", Toast.LENGTH_SHORT).show();
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }

}

