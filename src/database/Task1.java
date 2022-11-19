package database;

//TODO
// Using the JDBC API and MySQl make the following queries as individual functions:
// 1.Drop table MOVIES if there is one.
// 2. Create a table MOVIES with columns: id(primary key) of type INTEGER AUTO INCREMENT,title of type VARCHAR (255), genre of type VARCHAR (255),yearOfRelease of type INTEGER.
// 3. Add any three records to the MOVIES table
// 4. Update one selected record's title field (use the PreparedStatement)
// 5. Delete selected record with specified id
// 6. Display all other records in the database

import java.sql.*;

public class Task1 {

    public static void main(String[] args) {

        String dbURL = "jdbc:mysql://localhost:3306/javaee18";
        String username = "root";
        String password = "m2xkki59";

        try (Connection con = DriverManager.getConnection(dbURL, username, password)) {

            /* drop(con);
            create(con);
            insert(con);
            read(con);
            update(con);
            read(con);
            delete(con);
            read(con);

             */

            // I'm adding test comment for git
            drop(con);
            create(con);
            insert(con, "Harry Potter", "Fantasy", 2001);
            insert(con, "Star Wars", "Action", 2015);
            insert(con, "Rocky", "Sports", 1797);
            read(con);
            update(con);
            delete(con);
            read(con);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void drop(Connection con) throws SQLException {
        Statement dropStatement = con.createStatement();
        dropStatement.execute("DROP TABLE IF EXISTS movies");
    }

    public static void create(Connection con) throws SQLException {
        Statement createTableStatement = con.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS movies (" +
                "id INTEGER AUTO_INCREMENT, "+
                "title VARCHAR(255), "+
                "genre VARCHAR(255), "+
                "yearOfRelease INTEGER, "+
                "PRIMARY KEY (id))";

        createTableStatement.execute(sql);
    }

    public static void insert(Connection con, String title, String genre, int yearOfRelease) throws SQLException {

        String sql = "INSERT INTO movies (title, genre, yearOfRelease) VALUES (?, ?, ?)";

        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, title);
        preparedStatement.setString(2, genre);
        preparedStatement.setInt(3, yearOfRelease);

        if (preparedStatement.executeUpdate() > 0) {


        }
    }

    public static void read(Connection con) throws SQLException {

        String sql = "SELECT * FROM movies";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        int row = 1;

        while (resultSet.next()) {

            String title = resultSet.getString("title");
            String genre = resultSet.getString("genre");
            int yearOfRelease = resultSet.getInt("yearOfRelease");


            String output = "Id: %d \nTitle: %s \nGenre: %s \nYear Of Release: %d";
            System.out.println("######################");
            System.out.println(String.format(output, row++, title, genre, yearOfRelease));


        }
    }

    public static void update (Connection con) throws SQLException{

        PreparedStatement updateStatement = con.prepareStatement("UPDATE movies SET title = ? WHERE id = ?");
        updateStatement.setString(1, "Star Wars Force Awakens");
        updateStatement.setInt(2,2);
        updateStatement.executeUpdate();
    }

    public static void delete (Connection con) throws SQLException{
        Statement deleteStatement = con.createStatement();
        deleteStatement.executeUpdate("DELETE FROM MOVIES WHERE id = 2");

    }
}


