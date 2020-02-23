package e.yunus.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> wordss = new ArrayList<Word>();
        wordss.add(new Word("coba1", "coba1", R.raw.cdoldwet));
        wordss.add(new Word("coba2", "coba2", R.raw.donttalk));
        wordss.add(new Word("coba3", "coba3", R.raw.cdoldwet));

        WordAdapter adapter = new WordAdapter(this, wordss, R.color.category_phrases);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);





    }

    }

