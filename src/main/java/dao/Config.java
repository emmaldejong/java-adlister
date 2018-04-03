package dao;

public class Config {
    private String url = "jdbc:mysql://localhost/adlister_db";
    private String username = "admin";
    private String password = "codeup";

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
