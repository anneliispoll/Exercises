-- NOT NULL
	-- makes sure that the column value will not be empty
    
-- AUTO_INCREMENT
	-- increments column value automatically
    
DROP TABLE IF EXISTS users;  
    
SELECT * FROM users;
    
CREATE TABLE users(
	userID int NOT NULL AUTO_INCREMENT,
    username varchar(45) NOT NULL,
    password varchar(45) NOT NULL,
    fullname varchar(45) NOT NULL,
    email varchar(55),
    PRIMARY KEY(userID),
    UNIQUE(username)
    ); 

INSERT INTO users (username, password, fullname, email) VALUES ('trump','mexico','Donald Trump','maga@gmail.com');

-- No default value = mandatory column
INSERT INTO users (username, password) VALUES ('karlis','1234');

INSERT INTO users (username, password, fullname) VALUES ('bush','qwerty','Georg W. Bush');

INSERT INTO users (email, fullname, password, username) VALUES ('obama@gmail.com', 'Barack Obama', '123', 'obama');

-- Modift existsing column
-- DEFAULT values

ALTER TABLE users
MODIFY COLUMN email varchar (55) DEFAULT 'default@default.com';

INSERT INTO users(username, password, fullname) VALUES ('biden', 'azsdf','Joe Biden');

-- ADD COLUMN
ALTER TABLE users
ADD netWorth DECIMAL;

-- Delete COLUMN
ALTER TABLE users DROP COLUMN nethWorth

-- ADD COLUMN
ALTER TABLE users
ADD netWorth DECIMAL (7,2);

SELECT * FROM users;

-- Challange 
-- add different salary for every users in table
-- trumpwall = 20344.45
-- bush = 10043.34 AND set email to bush@gmail.com
-- obama = 23424.5
-- biden = 45678.93 AND set email to joe@gmail.com

UPDATE users SET netWorth = 20344.45 WHERE username = 'trump';
UPDATE users SET netWorth = 23424.5 WHERE username = 'obama';
UPDATE users SET netWorth = 10043.34, email = 'bush@gmail.com' WHERE username = 'bush';
UPDATE users SET netWorth = 45678.93, email = 'joe@gmail.com' WHERE username = 'biden';

-- ADD Column
ALTER TABLE users
ADD country varchar(55);

UPDATE users SET country= 'USA' WHERE username = 'trump';
UPDATE users SET country= 'Estonia' WHERE username = 'bush';
UPDATE users SET country= 'Latvia' WHERE username = 'obama';
UPDATE users SET country= 'Canada' WHERE username = 'biden';

-- MIN & MAX
SELECT MIN(netWorth) FROM users;

SELECT MAX(netWorth) AS LargestNetWorth FROM users;

-- COUNT
SELECT COUNT(*) FROM users;

-- AVERAGE
SELECT AVG(netWorth) AS AverageNetWorth FROM users;

-- SUM
SELECT SUM(netWorth) AS SumNetWorth FROM users;

-- LIKE
SELECT * FROM users WHERE username LIKE 'b%';

-- IN
SELECT * FROM users WHERE country IN('USA','Latvia');

SELECT * FROM users WHERE country = 'USA' OR country = 'Latvia';

-- List all country names
SELECT country FROM users;

SELECT * FROM users WHERE country IN(SELECT country FROM users);


-- CREATE country table
CREATE TABLE country(
	id int NOT NULL AUTO_INCREMENT,
    name varchar(45),
    PRIMARY KEY (id),
    UNIQUE(name)
);

INSERT INTO country (name) VALUES('USA');
INSERT INTO country (name) VALUES('Canada');
INSERT INTO country (name) VALUES('Australia');
INSERT INTO country (name) VALUES('France');

SELECT * FROM country;

-- Filter all users whos country column value you can see in country table list
SELECT * FROM users WHERE country IN (SELECT name FROM country);

SELECT * FROM users WHERE netWorth > 20000;

SELECT * FROM users WHERE country NOT IN (SELECT name FROM country);





