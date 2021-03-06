package e.yunus.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.UserDictionary;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    //use musik on listitemlistener
    private MediaPlayer mMediaPlayer;

    //media player
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            relaseMediaPlayer();
        }
    };
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
//        ArrayList<String> word = new ArrayList<String>();
//        word.add("one");
//        word.add("two");
//        word.add("three");
//        word.add("four");

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

        //use listview  -> change the xml layout from linearlayout to listviewlayout
//        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, word);
//        ListView listView = (ListView)findViewById(R.id.list);
//        listView.setAdapter(itemAdapter);

        //use gridview -> change the xml layout from list view to grid view add atribut android:numColoumns
//         ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, word);
//         GridView gridView = (GridView) findViewById(R.id.list);
//         gridView.setAdapter(itemAdapter);

        //use musik on listitemlistener


        //use adapter
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutfi", R.drawable.img1, R.raw.cdoldwet));
        words.add(new Word("two", "otiiko", R.drawable.img2, R.raw.donttalk));
        words.add(new Word("three", "tolooluso", R.drawable.img3, R.raw.cdoldwet));
        words.add(new Word("four", "oyyisa", R.drawable.img4, R.raw.donttalk));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_number);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(NumbersActivity.this,"toast listener", Toast.LENGTH_SHORT).show();
//                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.donttalk);
//                mMediaPlayer.start();

                //play oudio per item
                Word word= words.get(position);

                //relase the media player if it currently exists because we are about to play a different sound file
                relaseMediaPlayer();

                //play aodio per item
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();

                //media player
                //set up a listener on the media player, so that we can stop and relase the media player once the sounds has finished playing
                mMediaPlayer.setOnCompletionListener(mCompletionListener);

            }
        });
    }
    private void relaseMediaPlayer(){
        if (mMediaPlayer != null){
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}
