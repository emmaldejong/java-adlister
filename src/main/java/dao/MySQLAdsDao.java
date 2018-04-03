package dao;

import java.sql.*;
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
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
