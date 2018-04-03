package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;
import models.Ad;

public class MySQLAdsDao implements Ads {
    private static Connection connection = null;

    public MySQLAdsDao(dao.Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
        while (rs.next()) {
            System.out.println("Title: " + rs.getString("title"));
            System.out.println("Description: " + rs.getString("description"));
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
