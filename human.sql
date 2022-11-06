CREATE TABLE human (
	id int NOT NULL AUTO_INCREMENT, 
    name varchar(50),
    age int,
    PRIMARY KEY (id)
);

INSERT INTO human (name, age) VALUES ('Joseph', 15);
INSERT INTO human (name, age) VALUES ('Dwight Schrute', 43);
INSERT INTO human (name, age) VALUES ('Kanye West', 45);

SELECT * FROM human;
DROP TABLE IF EXISTS human;

DROP TABLE IF EXISTS users; 

CREATE TABLE users (
	username varchar(50),
    password varchar(50),
    fullname varchar(50),
    email varchar(50),
    PRIMARY KEY (username)
);

INSERT INTO users (username, password, fullname, email) VALUES ('cool123', 'ilovejava', 'Ben Rock', 'ben@rock.com');
INSERT INTO users (username, password, fullname, email) VALUES ('car59', 'Lamborgini', 'Andrea Car', 'andrea@car.com');
INSERT INTO users (username, password, fullname, email) VALUES ('qwerty123', 'QWERTY123', 'Paul Benn', 'paul@benn.com');

SELECT * FROM users;

DELETE FROM users WHERE id = 1;

SELECT * FROM movies;