package ai.tomorrow.miwok;

import android.widget.ScrollView;

public class Word {
    private String mDefault_translation;
    private String mMiwok_translation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    public static final int NO_IMAGE_PROVIDED = -1;

    public Word(String default_translation, String miwok_translation) {
        mDefault_translation = default_translation;
        mMiwok_translation = miwok_translation;
    }

    public Word(String default_translation, String miwok_translation, int imageResourceId) {
        mDefault_translation = default_translation;
        mMiwok_translation = miwok_translation;
        mImageResourceId = imageResourceId;
    }

    public String getDefault_translation() {
        return mDefault_translation;
    }

    public String getMiwok_translation() {
        return mMiwok_translation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasIcon(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
