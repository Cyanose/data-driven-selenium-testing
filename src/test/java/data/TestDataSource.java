package data;

import org.testng.annotations.DataProvider;
import utilities.DatabaseUtils;

public class TestDataSource {

    @DataProvider
    public Object[][] getDataFromDatabase(){

        Object[][] data ;

        DatabaseUtils db = new DatabaseUtils();

        db.openConenction("localhost",13306,"testData","root","dupsko");

        String sqlQuery = "SELECT * from Users";

        data = db.executeSelectQuery(sqlQuery);

        db.closeConnection();

        return data;
    }

}
