package ai.tomorrow.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("father", "əpə"));
        family.add(new Word("mother", "əṭa"));
        family.add(new Word("son", "angsi"));
        family.add(new Word("daughter", "tune"));
        family.add(new Word("older brother", "taachi"));
        family.add(new Word("younger brother", "chalitti"));
        family.add(new Word("older sister", "teṭe"));
        family.add(new Word("younger sister", "kolliti"));
        family.add(new Word("grandmother", "ama"));
        family.add(new Word("grandfather", "paapa"));

        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
