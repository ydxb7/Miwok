package ai.tomorrow.miwok;

import android.widget.ScrollView;

public class Word {
    private String mDefault_translation;
    private String mMiwok_translation;

    public Word(String default_translation, String miwok_translation)
    {
        mDefault_translation = default_translation;
        mMiwok_translation = miwok_translation;
    }

    public String getDefault_translation() {
        return mDefault_translation;
    }

    public String getMiwok_translation(){
        return mMiwok_translation;
    }
}
