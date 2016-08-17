package music.dexterous.com.dexterousmusic.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import music.dexterous.com.dexterousmusic.database.Music;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MUSIC".
*/
public class MusicDao extends AbstractDao<Music, String> {

    public static final String TABLENAME = "MUSIC";

    /**
     * Properties of entity Music.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property SONG_ID = new Property(0, String.class, "SONG_ID", true, "SONG__ID");
        public final static Property SONG_TITLE = new Property(1, String.class, "SONG_TITLE", false, "SONG__TITLE");
        public final static Property SONG_ARTIST = new Property(2, String.class, "SONG_ARTIST", false, "SONG__ARTIST");
        public final static Property SONG_ALBUM = new Property(3, String.class, "SONG_ALBUM", false, "SONG__ALBUM");
        public final static Property SONG_ALBUM_ARTIST = new Property(4, String.class, "SONG_ALBUM_ARTIST", false, "SONG__ALBUM__ARTIST");
        public final static Property SONG_DURATION = new Property(5, String.class, "SONG_DURATION", false, "SONG__DURATION");
        public final static Property SONG_FILE_PATH = new Property(6, String.class, "SONG_FILE_PATH", false, "SONG__FILE__PATH");
        public final static Property SONG_IS_PLAYING = new Property(7, Boolean.class, "SONG_IS_PLAYING", false, "SONG__IS__PLAYING");
        public final static Property SONG_TRACK_NUMBER = new Property(8, String.class, "SONG_TRACK_NUMBER", false, "SONG__TRACK__NUMBER");
        public final static Property SONG_GENRE = new Property(9, String.class, "SONG_GENRE", false, "SONG__GENRE");
        public final static Property SONG_PLAY_COUNT = new Property(10, String.class, "SONG_PLAY_COUNT", false, "SONG__PLAY__COUNT");
        public final static Property SONG_YEAR = new Property(11, String.class, "SONG_YEAR", false, "SONG__YEAR");
        public final static Property ALBUMS_COUNT = new Property(12, String.class, "ALBUMS_COUNT", false, "ALBUMS__COUNT");
        public final static Property SONGS_COUNT = new Property(13, String.class, "SONGS_COUNT", false, "SONGS__COUNT");
        public final static Property GENRES_SONG_COUNT = new Property(14, String.class, "GENRES_SONG_COUNT", false, "GENRES__SONG__COUNT");
        public final static Property SONG_LAST_MODIFIED = new Property(15, String.class, "SONG_LAST_MODIFIED", false, "SONG__LAST__MODIFIED");
        public final static Property SONG_SCANNED = new Property(16, String.class, "SONG_SCANNED", false, "SONG__SCANNED");
        public final static Property BLACKLIST_STATUS = new Property(17, String.class, "BLACKLIST_STATUS", false, "BLACKLIST__STATUS");
        public final static Property ADDED_TIMESTAMP = new Property(18, String.class, "ADDED_TIMESTAMP", false, "ADDED__TIMESTAMP");
        public final static Property RATING = new Property(19, String.class, "RATING", false, "RATING");
        public final static Property LAST_PLAYED_TIMESTAMP = new Property(20, String.class, "LAST_PLAYED_TIMESTAMP", false, "LAST__PLAYED__TIMESTAMP");
        public final static Property SONG_SOURCE = new Property(21, String.class, "SONG_SOURCE", false, "SONG__SOURCE");
        public final static Property SONG_ALBUM_ART_PATH = new Property(22, String.class, "SONG_ALBUM_ART_PATH", false, "SONG__ALBUM__ART__PATH");
        public final static Property SONG_DELETED = new Property(23, String.class, "SONG_DELETED", false, "SONG__DELETED");
        public final static Property ARTIST_ART_LOCATION = new Property(24, String.class, "ARTIST_ART_LOCATION", false, "ARTIST__ART__LOCATION");
        public final static Property ALBUM_ID = new Property(25, String.class, "ALBUM_ID", false, "ALBUM__ID");
        public final static Property ARTIST_ID = new Property(26, String.class, "ARTIST_ID", false, "ARTIST__ID");
        public final static Property GENRE_ID = new Property(27, String.class, "GENRE_ID", false, "GENRE__ID");
        public final static Property GENRE_SONG_COUNT = new Property(28, String.class, "GENRE_SONG_COUNT", false, "GENRE__SONG__COUNT");
        public final static Property LOCAL_COPY_PATH = new Property(29, String.class, "LOCAL_COPY_PATH", false, "LOCAL__COPY__PATH");
        public final static Property LIBRARIES = new Property(30, String.class, "LIBRARIES", false, "LIBRARIES");
        public final static Property SAVED_POSITION = new Property(31, String.class, "SAVED_POSITION", false, "SAVED__POSITION");
    };


    public MusicDao(DaoConfig config) {
        super(config);
    }
    
    public MusicDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MUSIC\" (" + //
                "\"SONG__ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: SONG_ID
                "\"SONG__TITLE\" TEXT," + // 1: SONG_TITLE
                "\"SONG__ARTIST\" TEXT," + // 2: SONG_ARTIST
                "\"SONG__ALBUM\" TEXT," + // 3: SONG_ALBUM
                "\"SONG__ALBUM__ARTIST\" TEXT," + // 4: SONG_ALBUM_ARTIST
                "\"SONG__DURATION\" TEXT," + // 5: SONG_DURATION
                "\"SONG__FILE__PATH\" TEXT," + // 6: SONG_FILE_PATH
                "\"SONG__IS__PLAYING\" INTEGER," + // 7: SONG_IS_PLAYING
                "\"SONG__TRACK__NUMBER\" TEXT," + // 8: SONG_TRACK_NUMBER
                "\"SONG__GENRE\" TEXT," + // 9: SONG_GENRE
                "\"SONG__PLAY__COUNT\" TEXT," + // 10: SONG_PLAY_COUNT
                "\"SONG__YEAR\" TEXT," + // 11: SONG_YEAR
                "\"ALBUMS__COUNT\" TEXT," + // 12: ALBUMS_COUNT
                "\"SONGS__COUNT\" TEXT," + // 13: SONGS_COUNT
                "\"GENRES__SONG__COUNT\" TEXT," + // 14: GENRES_SONG_COUNT
                "\"SONG__LAST__MODIFIED\" TEXT," + // 15: SONG_LAST_MODIFIED
                "\"SONG__SCANNED\" TEXT," + // 16: SONG_SCANNED
                "\"BLACKLIST__STATUS\" TEXT," + // 17: BLACKLIST_STATUS
                "\"ADDED__TIMESTAMP\" TEXT," + // 18: ADDED_TIMESTAMP
                "\"RATING\" TEXT," + // 19: RATING
                "\"LAST__PLAYED__TIMESTAMP\" TEXT," + // 20: LAST_PLAYED_TIMESTAMP
                "\"SONG__SOURCE\" TEXT," + // 21: SONG_SOURCE
                "\"SONG__ALBUM__ART__PATH\" TEXT," + // 22: SONG_ALBUM_ART_PATH
                "\"SONG__DELETED\" TEXT," + // 23: SONG_DELETED
                "\"ARTIST__ART__LOCATION\" TEXT," + // 24: ARTIST_ART_LOCATION
                "\"ALBUM__ID\" TEXT," + // 25: ALBUM_ID
                "\"ARTIST__ID\" TEXT," + // 26: ARTIST_ID
                "\"GENRE__ID\" TEXT," + // 27: GENRE_ID
                "\"GENRE__SONG__COUNT\" TEXT," + // 28: GENRE_SONG_COUNT
                "\"LOCAL__COPY__PATH\" TEXT," + // 29: LOCAL_COPY_PATH
                "\"LIBRARIES\" TEXT," + // 30: LIBRARIES
                "\"SAVED__POSITION\" TEXT);"); // 31: SAVED_POSITION
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MUSIC\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Music entity) {
        stmt.clearBindings();
 
        String SONG_ID = entity.getSONG_ID();
        if (SONG_ID != null) {
            stmt.bindString(1, SONG_ID);
        }
 
        String SONG_TITLE = entity.getSONG_TITLE();
        if (SONG_TITLE != null) {
            stmt.bindString(2, SONG_TITLE);
        }
 
        String SONG_ARTIST = entity.getSONG_ARTIST();
        if (SONG_ARTIST != null) {
            stmt.bindString(3, SONG_ARTIST);
        }
 
        String SONG_ALBUM = entity.getSONG_ALBUM();
        if (SONG_ALBUM != null) {
            stmt.bindString(4, SONG_ALBUM);
        }
 
        String SONG_ALBUM_ARTIST = entity.getSONG_ALBUM_ARTIST();
        if (SONG_ALBUM_ARTIST != null) {
            stmt.bindString(5, SONG_ALBUM_ARTIST);
        }
 
        String SONG_DURATION = entity.getSONG_DURATION();
        if (SONG_DURATION != null) {
            stmt.bindString(6, SONG_DURATION);
        }
 
        String SONG_FILE_PATH = entity.getSONG_FILE_PATH();
        if (SONG_FILE_PATH != null) {
            stmt.bindString(7, SONG_FILE_PATH);
        }
 
        Boolean SONG_IS_PLAYING = entity.getSONG_IS_PLAYING();
        if (SONG_IS_PLAYING != null) {
            stmt.bindLong(8, SONG_IS_PLAYING ? 1L: 0L);
        }
 
        String SONG_TRACK_NUMBER = entity.getSONG_TRACK_NUMBER();
        if (SONG_TRACK_NUMBER != null) {
            stmt.bindString(9, SONG_TRACK_NUMBER);
        }
 
        String SONG_GENRE = entity.getSONG_GENRE();
        if (SONG_GENRE != null) {
            stmt.bindString(10, SONG_GENRE);
        }
 
        String SONG_PLAY_COUNT = entity.getSONG_PLAY_COUNT();
        if (SONG_PLAY_COUNT != null) {
            stmt.bindString(11, SONG_PLAY_COUNT);
        }
 
        String SONG_YEAR = entity.getSONG_YEAR();
        if (SONG_YEAR != null) {
            stmt.bindString(12, SONG_YEAR);
        }
 
        String ALBUMS_COUNT = entity.getALBUMS_COUNT();
        if (ALBUMS_COUNT != null) {
            stmt.bindString(13, ALBUMS_COUNT);
        }
 
        String SONGS_COUNT = entity.getSONGS_COUNT();
        if (SONGS_COUNT != null) {
            stmt.bindString(14, SONGS_COUNT);
        }
 
        String GENRES_SONG_COUNT = entity.getGENRES_SONG_COUNT();
        if (GENRES_SONG_COUNT != null) {
            stmt.bindString(15, GENRES_SONG_COUNT);
        }
 
        String SONG_LAST_MODIFIED = entity.getSONG_LAST_MODIFIED();
        if (SONG_LAST_MODIFIED != null) {
            stmt.bindString(16, SONG_LAST_MODIFIED);
        }
 
        String SONG_SCANNED = entity.getSONG_SCANNED();
        if (SONG_SCANNED != null) {
            stmt.bindString(17, SONG_SCANNED);
        }
 
        String BLACKLIST_STATUS = entity.getBLACKLIST_STATUS();
        if (BLACKLIST_STATUS != null) {
            stmt.bindString(18, BLACKLIST_STATUS);
        }
 
        String ADDED_TIMESTAMP = entity.getADDED_TIMESTAMP();
        if (ADDED_TIMESTAMP != null) {
            stmt.bindString(19, ADDED_TIMESTAMP);
        }
 
        String RATING = entity.getRATING();
        if (RATING != null) {
            stmt.bindString(20, RATING);
        }
 
        String LAST_PLAYED_TIMESTAMP = entity.getLAST_PLAYED_TIMESTAMP();
        if (LAST_PLAYED_TIMESTAMP != null) {
            stmt.bindString(21, LAST_PLAYED_TIMESTAMP);
        }
 
        String SONG_SOURCE = entity.getSONG_SOURCE();
        if (SONG_SOURCE != null) {
            stmt.bindString(22, SONG_SOURCE);
        }
 
        String SONG_ALBUM_ART_PATH = entity.getSONG_ALBUM_ART_PATH();
        if (SONG_ALBUM_ART_PATH != null) {
            stmt.bindString(23, SONG_ALBUM_ART_PATH);
        }
 
        String SONG_DELETED = entity.getSONG_DELETED();
        if (SONG_DELETED != null) {
            stmt.bindString(24, SONG_DELETED);
        }
 
        String ARTIST_ART_LOCATION = entity.getARTIST_ART_LOCATION();
        if (ARTIST_ART_LOCATION != null) {
            stmt.bindString(25, ARTIST_ART_LOCATION);
        }
 
        String ALBUM_ID = entity.getALBUM_ID();
        if (ALBUM_ID != null) {
            stmt.bindString(26, ALBUM_ID);
        }
 
        String ARTIST_ID = entity.getARTIST_ID();
        if (ARTIST_ID != null) {
            stmt.bindString(27, ARTIST_ID);
        }
 
        String GENRE_ID = entity.getGENRE_ID();
        if (GENRE_ID != null) {
            stmt.bindString(28, GENRE_ID);
        }
 
        String GENRE_SONG_COUNT = entity.getGENRE_SONG_COUNT();
        if (GENRE_SONG_COUNT != null) {
            stmt.bindString(29, GENRE_SONG_COUNT);
        }
 
        String LOCAL_COPY_PATH = entity.getLOCAL_COPY_PATH();
        if (LOCAL_COPY_PATH != null) {
            stmt.bindString(30, LOCAL_COPY_PATH);
        }
 
        String LIBRARIES = entity.getLIBRARIES();
        if (LIBRARIES != null) {
            stmt.bindString(31, LIBRARIES);
        }
 
        String SAVED_POSITION = entity.getSAVED_POSITION();
        if (SAVED_POSITION != null) {
            stmt.bindString(32, SAVED_POSITION);
        }
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Music readEntity(Cursor cursor, int offset) {
        Music entity = new Music( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // SONG_ID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // SONG_TITLE
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // SONG_ARTIST
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // SONG_ALBUM
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // SONG_ALBUM_ARTIST
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // SONG_DURATION
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // SONG_FILE_PATH
            cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0, // SONG_IS_PLAYING
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // SONG_TRACK_NUMBER
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // SONG_GENRE
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // SONG_PLAY_COUNT
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // SONG_YEAR
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // ALBUMS_COUNT
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // SONGS_COUNT
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // GENRES_SONG_COUNT
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // SONG_LAST_MODIFIED
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // SONG_SCANNED
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // BLACKLIST_STATUS
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // ADDED_TIMESTAMP
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // RATING
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // LAST_PLAYED_TIMESTAMP
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // SONG_SOURCE
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // SONG_ALBUM_ART_PATH
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // SONG_DELETED
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // ARTIST_ART_LOCATION
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // ALBUM_ID
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // ARTIST_ID
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // GENRE_ID
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // GENRE_SONG_COUNT
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // LOCAL_COPY_PATH
            cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30), // LIBRARIES
            cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31) // SAVED_POSITION
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Music entity, int offset) {
        entity.setSONG_ID(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setSONG_TITLE(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSONG_ARTIST(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSONG_ALBUM(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSONG_ALBUM_ARTIST(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSONG_DURATION(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSONG_FILE_PATH(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSONG_IS_PLAYING(cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0);
        entity.setSONG_TRACK_NUMBER(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setSONG_GENRE(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setSONG_PLAY_COUNT(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setSONG_YEAR(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setALBUMS_COUNT(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setSONGS_COUNT(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setGENRES_SONG_COUNT(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setSONG_LAST_MODIFIED(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setSONG_SCANNED(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setBLACKLIST_STATUS(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setADDED_TIMESTAMP(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setRATING(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setLAST_PLAYED_TIMESTAMP(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setSONG_SOURCE(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setSONG_ALBUM_ART_PATH(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setSONG_DELETED(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setARTIST_ART_LOCATION(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setALBUM_ID(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setARTIST_ID(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setGENRE_ID(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setGENRE_SONG_COUNT(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setLOCAL_COPY_PATH(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setLIBRARIES(cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30));
        entity.setSAVED_POSITION(cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(Music entity, long rowId) {
        return entity.getSONG_ID();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(Music entity) {
        if(entity != null) {
            return entity.getSONG_ID();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
