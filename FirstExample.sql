/*Multiline 
comment*/

-- Single line comment

-- Creating table
CREATE TABLE Presidents(
	PersonID int,
    Country varchar(50),
    LastName varchar(100),
    FirstName varchar(100),
    Address varchar(255),
    City varchar(50),
    PRIMARY KEY(PersonID)
    );
    
-- Inserting records into table

INSERT INTO Presidents (PersonID, Country, LastName, FirstName, Address, City)
VALUES (1000, 'USA', 'Trump', 'Donald', 'House is 515 North County Road, Palm Beach, Florida 33480', 'Florida');

INSERT INTO Presidents VALUES (1001, 'USA', 'Obama', 'Barack', '2500 W. Golf Road Hoffman Estates, IL 60169-1114', 'Florida');

INSERT INTO Presidents (PersonID, Country, LastName, FirstName) VALUES (1002, 'USA', 'Biden', 'Joe');

INSERT INTO Presidents (PersonID, Country, LastName, FirstName) VALUES (1003, 'USA', 'Bush', 'Georg W.');

-- View tabel records

SELECT * FROM presidents;

SELECT LastName, City FROM presidents;

-- WHERE keyword

SELECT LastName, City FROM presidents WHERE City = 'Florida';

-- AND keyword

SELECT FirstName, Country, City FROM Presidents WHERE City = 'Florida' AND LastName = 'Trump';

-- OR keyword

SELECT * FROM presidents WHERE LastName = 'Obama' OR FirstName = 'Joe';

-- NOT keyword

SELECT * FROM Presidents WHERE NOT LastName = 'Obama';

-- ORDER keyword

SELECT * FROM Presidents ORDER BY LastName;

-- ORDER desc

SELECT * FROM Presidents ORDER BY LastName DESC;

-- ORDER by more than one column

SELECT * FROM Presidents ORDER BY City, LastName;

-- DISTINCT return only unique values

SELECT DISTINCT Country FROM Presidents;

-- Count how many records are in the table

SELECT count(*) FROM Presidents;

-- Count how many unique countries are in the table

SELECT count(DISTINCT Country) FROM Presidents;


-- Update data
UPDATE Presidents SET City = 'New York' WHERE PersonID = 1002;

-- Delete records
DELETE FROM presidents WHERE PersonID = 1003;

-- Delete table
DROP TABLE Presidents;
