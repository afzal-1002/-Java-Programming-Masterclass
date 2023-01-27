import javax.sound.midi.Soundbank;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CH_Data_Source_DB {
    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_URL = "jdbc:sqlite:E:\\Data Base\\" + DB_NAME;
    public static final String TABLE_ALBUMS = "ALBUMS";
    public static final String COLUMN_ALBUM_ID= "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTISTS_ID= "_id";
    public static final String COLUMN_ARTISTS_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONGS_Id= "_Id";
    public static final String COLUMN_SONGS_TRACK= "track";
    public static final String COLUMN_SONGS_TITLE = "title";
    public static final String COLUMN_SONGS_ALBUM = "album";

    private Connection connection;
    private Statement statement = null;
    ResultSet resultSet = null;
    public boolean open(){
        try{
            connection = DriverManager.getConnection(CONNECTION_URL);
            return true;
        }catch (SQLException e){
            System.out.println("Could not connect  " + e.getMessage());
            return false;
        }
    }

    public void close(){
        try{
            if(connection != null){
                connection.close();
            }
        }catch (SQLException e){
            System.out.println("Connection already closed  " + e.getMessage());
        }
    }

    public List<CH_Artist> queryArtistList(){
         try (Statement statement = connection.createStatement();
              ResultSet resultSet  = statement.executeQuery("SELECT  * From "+ TABLE_ARTISTS)){
             List<CH_Artist> artists = new ArrayList<>();
             while (resultSet.next()){
                 CH_Artist artist = new CH_Artist();
                 artist.setId(resultSet.getInt(COLUMN_ARTISTS_ID));
                 artist.setName(resultSet.getString(COLUMN_ARTISTS_NAME));
                 artists.add(artist);
             }
            return artists;
         }catch (SQLException e){
             System.out.println(" Exception " + e.getMessage());
             return null;
         }
    }

    public List<CH_Song> querySong(){
        try (Statement statement = connection.createStatement();
             ResultSet resultSet  = statement.executeQuery("SELECT  * From " + TABLE_SONGS)){
            List<CH_Song> songs = new ArrayList<>();
            while (resultSet.next()){
                CH_Song song = new CH_Song();
                song.setId(resultSet.getInt(COLUMN_SONGS_Id));
                song.setTrack(resultSet.getInt(COLUMN_SONGS_TRACK));
                song.setName(resultSet.getString(COLUMN_SONGS_TITLE));
                song.setAlbumId(resultSet.getInt(COLUMN_SONGS_ALBUM));
                songs.add(song);
            }
            return songs;
        }catch (SQLException e){
            System.out.println(" Exception " + e.getMessage());
            return null;
        }
    }

}


class MainTest{
    public static void main(String[] args) {
        CH_Data_Source_DB datasource = new CH_Data_Source_DB();
        if(!datasource.open() ){
            System.out.println("Can not open Data Course ");
            return;
        }

        List<CH_Artist> artistList = datasource.queryArtistList();
        if(artistList == null){
            System.out.println("No Artists.");
            return;
        }else {
            for (CH_Artist artist: artistList){
                System.out.println("Id = " + artist.getId() + ", " +
                                    "Name = "+ artist.getName());
            }
        }


        List<CH_Song> songList = datasource.querySong();
        if(songList == null){
            System.out.println("No Artists.");
            return;
        }else {
            for (CH_Song song: songList){
                System.out.println("Id = " + song.getId() +
                        ", Name = "+ song.getName() +
                        ", Title " + song.getAlbumId() +
                        ", Track " + song.getTrack() +
                        ", Album " + song.getAlbumId()
                );
            }
        }


    }
}