-- Active: 1748282182410@@127.0.0.1@3306@bank_system
CREATE TABLE Login (
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    firstName VARCHAR(100) NOT NULL,
    lastName VARCHAR(100) NOT NULL,
    dateCreated DATETIME NOT NULL,
    bankid   INT(10) AUTO_INCREMENT PRIMARY KEY NOT NULL
);


INSERT INTO Login 
    (username, password, firstName, lastName, dateCreated) 
    VALUES
    ('JohnJ', SHA2('idkthispassword', 256), 'John', 'Jrad', NOW());

DROP TABLE Login

SELECT * FROM Login

SELECT username from Login WHERE bankid = 1;