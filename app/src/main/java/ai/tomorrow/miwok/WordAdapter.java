package ai.tomorrow.miwok;

import android.content.Context;
import android.support.v7.view.menu.ListMenuItemView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import ai.tomorrow.miwok.Word;

import java.io.File;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {

    public WordAdapter(Context context, int resource, ArrayList<Word> objects){
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWordItem = (Word) getItem(position);

        TextView miwok_text_view = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwok_text_view.setText(currentWordItem.getMiwok_translation());

        TextView default_text_view = (TextView) listItemView.findViewById(R.id.default_text_view);
        default_text_view.setText(currentWordItem.getDefault_translation());

        return listItemView;
    }
}
