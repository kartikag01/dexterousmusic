package music.dexterous.com.dexterousmusic.musicutils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import music.dexterous.com.dexterousmusic.database.Music;

/**
 * Created by naren on 23/8/16.
 */
public class SongsDuration {

    //TODO call this on background thread
    public static String getSongsDuration(List<Music> musics) {
        long time = 0;
        for (int i = 0; i < musics.size(); i++) {
            time += Long.parseLong(musics.get(i).getSONG_DURATION());
        }
        return songDurationToDisplay(time);
    }

    //TODO call this on background thread
    public static String getSongsDuration(Music music) {
        return songDurationToDisplay(Long.parseLong(music.getSONG_DURATION()));
    }

    //TODO setup also to hours and days
    private static String songDurationToDisplay(long time) {
        long min = TimeUnit.MILLISECONDS.toMinutes(time);
        long sec = TimeUnit.MILLISECONDS.toSeconds(time) - TimeUnit.MINUTES.toSeconds(min);
        return String.format("%d.%02d", min
                , sec);
    }
}