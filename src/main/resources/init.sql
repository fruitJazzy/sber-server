CREATE TABLE PUBLIC.account
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    number INTEGER NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    amount DOUBLE DEFAULT 0
);
CREATE UNIQUE INDEX account_id_uindex ON PUBLIC.account (id);

CREATE TABLE PUBLIC.transactions
(
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    number_from INT NOT NULL,
    FOREIGN KEY (number_from) REFERENCES account (number),
    number_to INT NOT NULL,
    transaction_timestamp TIMESTAMP,
    amount DOUBLE
);
CREATE UNIQUE INDEX table_name_id_uindex ON PUBLIC.transactions (id);