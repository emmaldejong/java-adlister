package com.codeup.adlister.dao;

import com.codeup.adlister.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static Config config = new Config();
    private static Users usersdao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

    public static Users getUsersdao() {
        if (usersdao == null) {
            usersdao = new MySQLUsersDao(config);
        }
        return usersdao;
    }
}
