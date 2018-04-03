package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLAdsDao extends Ads {
    DriverManager.registerDriver(new Driver());
    Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost/adlister_db",
            "admin",
            "codeup"
    );
}
