CREATE TABLE users (username VARCHAR(100) NOT NULL PRIMARY KEY, encoded_password VARCHAR(255));
INSERT INTO users (username, encoded_password) VALUES ('user1', 'b9ad172c7a39674d94f4a007ce6181de742324e231228940668d17bb82bcbd0798bdaa273bf7fabb');
INSERT INTO users (username, encoded_password) VALUES ('user2', 'b9ad172c7a39674d94f4a007ce6181de742324e231228940668d17bb82bcbd0798bdaa273bf7fabb');
ALTER TABLE customers ADD username VARCHAR(100) NOT NULL DEFAULT 'user1';
ALTER TABLE customers ADD CONSTRAINT FK_CUSTOMERS_USERNAME FOREIGN KEY (username) REFERENCES users;