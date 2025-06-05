

CREATE TABLE Customers (
   /* firstName VARCHAR(100) NOT NULL,
    lastName VARCHAR(100) NOT NULL,
    */ 
    username VARCHAR(255) NOT NULL,
    /*emailAddress VARCHAR(255) NOT NULL,
    Address VARCHAR(255) NOT NULL,
    City VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    /*Gender VARCHAR(6) NOT NULL,
    State VARCHAR(6) NOT NULL,
    ZipCode INT(10) NOT NULL, 
    Religion VARCHAR(255) NOT NULL,
    Education VARCHAR(255) NOT NULL,
    Existing_Account VARCHAR(5) NOT NULL,
    Account_Type VARCHAR(100) NOT NULL,
    Card_Number  VARCHAR(255) NOT NULL,
    Pin INT(4) NOT NULL,
    dob DATE NOT NULL,
   */ 
   dateCreated DATETIME DEFAULT CURRENT_TIMESTAMP,
    bankid   INT(10) AUTO_INCREMENT PRIMARY KEY NOT NULL

)

SELECT * FROM customers;

DELETE FROM customers WHERE bankid = 1;

DROP TABLE customers