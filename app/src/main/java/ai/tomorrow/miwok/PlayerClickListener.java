package ai.tomorrow.miwok;

import android.media.MediaPlayer;
import android.view.View;

public class PlayerClickListener implements View.OnClickListener {
//    private Context mContext;
    private int mAudioResourceId;
    private MediaPlayer mPlayer = null;

    public PlayerClickListener(int audioResourceId){
//        mContext = context;
        mAudioResourceId = audioResourceId;
    }

    @Override
    public void onClick(View v){
        mPlayer = MediaPlayer.create(v.getContext(), mAudioResourceId);
        mPlayer.start();
//        Toast.makeText(v.getContext(),
//                "playering audio: " + mAudioResourceId, Toast.LENGTH_SHORT).show();
    }
}


