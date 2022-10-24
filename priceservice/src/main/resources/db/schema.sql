CREATE TABLE prices
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    code_product VARCHAR(250) NOT NULL,
    description  VARCHAR(250) NOT NULL,
    price        DECIMAL(5, 2) DEFAULT NULL
);
