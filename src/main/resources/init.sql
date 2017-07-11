CREATE TABLE PUBLIC.account
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    number INTEGER NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    amount DOUBLE DEFAULT 0
);

CREATE TABLE PUBLIC.transactions
(
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    number_from INT NOT NULL,
    FOREIGN KEY (number_from) REFERENCES account (number),
    number_to INT NOT NULL,
    transaction_timestamp TIMESTAMP,
    amount DOUBLE
);
