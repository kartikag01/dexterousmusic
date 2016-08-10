package music.dexterous.com.dexterousmusic.databaseutils;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import de.greenrobot.dao.query.QueryBuilder;
import music.dexterous.com.dexterousmusic.GlobalApplication;
import music.dexterous.com.dexterousmusic.database.Music;
import music.dexterous.com.dexterousmusic.database.MusicDao;
import music.dexterous.com.dexterousmusic.utils.logger.PrettyLogger;

/**
 * Created by Honey on 7/31/2016.
 */
public class MyMusicLibraryTableDao {

    public static void saveAllMusic(Context context, List<Music> musicList) {
        ((GlobalApplication) context).getSession().getMusicDao().insertOrReplaceInTx(musicList);
    }

    public static List<Music> getAllMusic(Context context) {
        return ((GlobalApplication) context).getSession().getMusicDao().loadAll();
    }

    public static List<Music> getAllMusic(Context context, String searchQuery) {
        return ((GlobalApplication) context)
                .getSession()
                .getMusicDao()
                .queryBuilder()
                .where(MusicDao.Properties.SONG_TITLE.eq("%" + searchQuery + "%"))
                .list();
    }

    public static Music getMusic(Context context, String index) {
        return ((GlobalApplication) context)
                .getSession()
                .getMusicDao().load(index);
    }


//    public static ArrayList<Music> getAllAlbum(Context context) {
//
//        ArrayList<String> result = new ArrayList<String>();
//
//        final String SQL_DISTINCT_ENAME = "SELECT DISTINCT " +
//                MusicDao.Properties.SONG_ALBUM.columnName +
//                " FROM " +
//                MusicDao.TABLENAME;
//        Cursor c = ((GlobalApplication) context).getSession().getDatabase().rawQuery(SQL_DISTINCT_ENAME, null);
//        try {
//            if (c.moveToFirst()) {
//                do {
//                    result.add(c.getString(0));
//                } while (c.moveToNext());
//            }
//        } finally {
//            c.close();
//        }
//        return result;
//    }

}
