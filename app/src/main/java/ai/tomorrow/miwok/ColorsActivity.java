package ai.tomorrow.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("red", "weṭeṭṭi"));
        colors.add(new Word("green", "chokokki"));
        colors.add(new Word("brown", "ṭakaakki"));
        colors.add(new Word("gray", "ṭopoppi"));
        colors.add(new Word("black", "kululli"));
        colors.add(new Word("white", "kelelli"));
        colors.add(new Word("dusty yellow", "ṭopiisə"));
        colors.add(new Word("mustard yellow", "chiwiiṭə"));

        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
