
import java.sql.*;

public class CH_Test_DB {

    public static void main(String[] args) {

//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:/Volumes/Production/Courses/Programs/JavaPrograms/TestDB/testjava.db");
//            Statement statement = conn.createStatement()) {
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");


        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:E:\\Data Base\\music.db");
            Statement statement = conn.createStatement();
//            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO CONTACTS (name, phone , email) VALUES ('AFZAL', 729294512,'test123@gmail.com')");
//            statement.execute("INSERT INTO CONTACTS (name, phone , email) VALUES ('AKRAM', 729294589,'test222@gmail.com')");
//            statement.execute("INSERT INTO CONTACTS (name, phone , email) VALUES ('AZHAR', 729298451,'test333@gmail.com')");
//             statement.executeUpdate("UPDATE contacts set name = 'AKRAM' where CONTACTS.NAME = 'AFZAL'");
//             statement.execute("DELETE  FROM contacts where name='AKRAM'");


            ResultSet resultSet = statement.executeQuery("SELECT  * FROM  contacts");
            statement.execute("SELECT  * FROM  contacts");
            ResultSet resultSet1 = statement.getResultSet();
            while (resultSet.next()){
                System.out.println(resultSet.getString("name") + " : " +
                                    resultSet.getInt("phone") + " : " +
                                    resultSet.getString("email"));
            }


            statement.close();
            conn.close();

//            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
//            Class.forName("org.sql.JDBC");

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}

