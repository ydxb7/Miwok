package ai.tomorrow.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> phrases = new ArrayList<Word>();
        phrases.add(new Word("Where are you going?", "minto wuksus", -1, R.raw.phrase_where_are_you_going));
        phrases.add(new Word("What is your name?", "tinnə oyaase'nə", -1, R.raw.phrase_what_is_your_name));
        phrases.add(new Word("My name is...", "oyaaset...", -1, R.raw.phrase_my_name_is));
        phrases.add(new Word("How are you feeling?", "michəksəs?", -1, R.raw.phrase_how_are_you_feeling));
        phrases.add(new Word("I’m feeling good.", "kuchi achit", -1, R.raw.phrase_im_feeling_good));
        phrases.add(new Word("Are you coming?", "əənəs'aa?", -1, R.raw.phrase_are_you_coming));
        phrases.add(new Word("Yes, I’m coming.", "həə’ əənəm", -1, R.raw.phrase_yes_im_coming));
        phrases.add(new Word("I’m coming.", "əənəm", -1, R.raw.phrase_im_coming));
        phrases.add(new Word("Let’s go.", "yoowutis", -1, R.raw.phrase_lets_go));
        phrases.add(new Word("Come here.", "ənni'nem", -1, R.raw.phrase_come_here));

        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, phrases, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                releaseMediaPlayer();
                mPlayer = MediaPlayer.create(PhrasesActivity.this, phrases.get(position).getAudioResourceId());
                mPlayer.start();
                mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        releaseMediaPlayer();
                    }
                });
            }
        });
    }

    private void releaseMediaPlayer(){
        if(mPlayer != null){
            mPlayer.release();
            mPlayer = null;
        }
    }
}
