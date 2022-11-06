
-- Creating a database
CREATE DATABASE sda_course;

-- Switch database
USE sda_course;

CREATE TABLE students(
	studentID int auto_increment,
    name varchar(55) NOT NULL,
    lastname varchar(55) NOT NULL,
    PRIMARY KEY(studentID)
);

USE javaee18;

-- DELETE DATABASE
DROP DATABASE sda_course;

-- DATABASE JOINS

SELECT * FROM country ORDER BY id asc;

CREATE TABLE states (
	stateID int NOT NULL AUTO_INCREMENT,
    countryID int,
    state varchar(55),
    PRIMARY KEY(stateID)
);

INSERT INTO states(countryID, state) VALUES(1, 'California');
INSERT INTO states(countryID, state) VALUES(1, 'New York');

INSERT INTO states(countryID, state) VALUES(2, 'Ontario');

INSERT INTO states(countryID, state) VALUES(3, 'Tasmania');

INSERT INTO states(countryID, state) VALUES(5, 'Bavaria');
INSERT INTO states(countryID, state) VALUES(5, 'Bremen');

SELECT * FROM states;
SELECT * FROM country;

-- INNER JOIN
SELECT * FROM country INNER JOIN states ON country.id = states.countryID;

-- LEFT JOIN
SELECT * FROM country LEFT JOIN states ON country.id = states.countryID ORDER BY country.id;

-- RIGHT JOIN
SELECT * FROM country RIGHT JOIN states ON country.id = states.countryID ORDER BY country.id;


SELECT country.name, states.state FROM country RIGHT JOIN states ON country.id = states.countryID;

-- UNION
SELECT * FROM country LEFT JOIN states ON country.id = states.countryID
UNION
SELECT * FROM country RIGHT JOIN states ON country.id = states.countryID;




