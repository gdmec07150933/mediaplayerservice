package com.example.mediaplayerservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.UnsupportedSchemeException;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by 罗嘉豪 on 2017/1/1.
 */
public class PlayService extends Service{
    MediaPlayer mediaPlayer;
    public PlayService(){
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}
