package e.yunus.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //create an array of word
//        String[] words = new String[3];
//        words[0] = "one";
//        words[1] = "two";
//        words[2] = "three";
//
//        Log.v("coba", words[1]);

        //Create an ArrayList
        ArrayList<String> word = new ArrayList<String>();
        word.add("one");
        word.add("two");
        word.add("three");
        word.add("four");

        //Log.v("number", "coba arraylisr " + word.get(0));

        //display to xml
        //LinearLayout linearLayout = findViewById(R.id.rootView);

        // TextView wordView = new TextView(this);
//        int index = 0;
//        wordView.setText(word.get(index)); //jk ingin langsung memnggil ganti indek dg array misalnya 0 atau 1
//        linearLayout.addView(wordView);
//
//        index = index + 1;
//        TextView wordView2 = new TextView(this);
//        wordView2.setText(word.get(index));
//        linearLayout.addView(wordView2);

        //use while loop
//         int coba = 0;
//         while (coba < 4){
//             TextView wordview2 = new TextView(this);
//             wordview2.setText(word.get(coba));
//             linearLayout.addView(wordview2);
//
//             coba++;
//         }

        //use for lop
//        for (int coba = 0; coba <word.size(); coba++){
//            TextView wordview = new TextView(this);
//            wordview.setText(word.get(coba));
//            linearLayout.addView(wordview);
//        }

        //use listview
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, word);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

    }
}
