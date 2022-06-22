package utilities;

import java.sql.*;

public class DatabaseUtils {

    private Connection conn;

    public void openConenction(String server, int portNum, String database, String userName, String password) {
        try {

            String url = String.format("jdbc:mysql://%s:%d/%s", server, portNum, database);

            conn = DriverManager.getConnection(url, userName, password);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void closeConnection() {
        try {

            conn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Object[][] executeSelectQuery(String sqlQuery) {

        Object[][] data = null;

        try {
            Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ResultSet result = statement.executeQuery(sqlQuery);

            result.last();

            int rowCount = result.getRow();

            int cellCount = result.getMetaData().getColumnCount();

            data = new Object[rowCount][cellCount];

            result.first();

            int row = 0;
            do{
                String[] parsedData = new String[2];
                parsedData[0] = result.getString("username");
                parsedData[1] = result.getString("password");

                for (int cell = 0; cell < 2; cell++) {
                    data[row][cell] = parsedData[cell];
                }
                row++;
            } while (result.next());

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;

    }
}