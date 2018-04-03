USE adlister_db;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS ads;

CREATE TABLE users (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  username VARCHAR(50),
  password VARCHAR(50),
  email VARCHAR(100),
  PRIMARY KEY (id)
);

CREATE TABLE ads (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id INT UNSIGNED NOT NULL,
  title VARCHAR(200),
  description VARCHAR(400),
  FOREIGN KEY (user_id) REFERENCES users(id),
  PRIMARY KEY (id)
);

INSERT INTO users (username, password, email) VALUE ('dwight', 'dwight1', 'dwight@dmpaper.com');