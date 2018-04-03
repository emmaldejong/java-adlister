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
        String selectQuery = "SELECT * FROM ads";
        List<Ad> ads = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                Ad ad = new Ad();
                ad.setId(rs.getLong("id"));
                ad.setTitle(rs.getString("title"));
                ad.setDescription(rs.getString("description"));
                ad.setUserId(rs.getLong("user_id"));
                ads.add(ad);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error occured while displaying ads", e);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
