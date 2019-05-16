package ai.tomorrow.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int myResource;
    private int mcolorCategory;

    public WordAdapter(Context context, int resource, ArrayList<Word> objects, int colorCategory){
        super(context, resource, objects);
        myResource = resource;
        mcolorCategory = colorCategory;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(myResource, parent, false);
        }

        Word currentWordItem = (Word) getItem(position);

        TextView miwok_text_view = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwok_text_view.setText(currentWordItem.getMiwok_translation());

        TextView default_text_view = (TextView) listItemView.findViewById(R.id.default_text_view);
        default_text_view.setText(currentWordItem.getDefault_translation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        if (currentWordItem.hasIcon()){
            iconView.setImageResource(currentWordItem.getImageResourceId());
            // Make sure the view is visible, because of reuse
            iconView.setVisibility(View.VISIBLE);
        }
        else{
            iconView.setVisibility(View.GONE);
        }
//        if(currentWordItem.hasAudio()){
//            listItemView.setOnClickListener(new PlayerClickListener(currentWordItem.getAudioResourceId()));
//        }

        LinearLayout textContainer = (LinearLayout) listItemView.findViewById(R.id.text_container);
        textContainer.setBackgroundResource(mcolorCategory);
        return listItemView;
    }
}
