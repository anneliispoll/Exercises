CREATE TABLE students(
	sid int NOT NULL,
	name text NOT NULL,
	PRIMARY KEY(sid)
);

CREATE TABLE teachers(
	tid int NOT NULL,
	name text NOT NULL,
	PRIMARY KEY(tid)
);

CREATE TABLE subjects(
	subid int NOT NULL,
    name text NOT NULL,
    PRIMARY KEY(subid)
);

CREATE TABLE grades(
	studentID int NOT NULL,
    teacherID int NOT NULL,
    subjectID int NOT NULL,
    grade int NOT NULL,
    PRIMARY KEY(studentID, teacherID, subjectID),
    FOREIGN KEY(studentID) REFERENCES students(sid), 
    FOREIGN KEY(teacherID) REFERENCES teachers(tid),
    FOREIGN KEY(subjectID) REFERENCES subjects(subid)
);

-- Insert data in students table

INSERT INTO students (sid, name) VALUES(1, 'Simon');
INSERT INTO students (sid, name) VALUES(2, 'Alvin');
INSERT INTO students (sid, name) VALUES(3, 'Theo');
INSERT INTO students (sid, name) VALUES(4, 'Brittany');
INSERT INTO students (sid, name) VALUES(5, 'Jenette');
INSERT INTO students (sid, name) VALUES(6, 'Elenor');
INSERT INTO students (sid, name) VALUES(7, 'Stu');

SELECT * FROM students;

-- Insert data in teachers table

INSERT INTO teachers (tid, name) VALUES (1, 'Washington');
INSERT INTO teachers (tid, name) VALUES (2, 'Adams');
INSERT INTO teachers (tid, name) VALUES (3, 'Jefferson');
INSERT INTO teachers (tid, name) VALUES (4, 'Lincoln');

SELECT * FROM teachers;

-- Insert data in subjects table

INSERT INTO subjects (subid, name) VALUES (1, 'History');
INSERT INTO subjects (subid, name) VALUES (2, 'Biology');
INSERT INTO subjects (subid, name) VALUES (3, 'Math');

SELECT * FROM subjects;

-- Insert data in grades table

INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 1, 9);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 2, 10);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 4, 3, 6);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 3, 2, 4);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (6, 2, 1, 5);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (2, 4, 3, 5);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (3, 4, 3, 8);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 3, 10);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 4, 1, 8);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 3, 3, 3);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (6, 2, 2, 5);

SELECT * FROM grades;

-- cannot add non existing foreign key 
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (12, 2, 2, 5);

-- SUM column values 
SELECT SUM(grade) FROM grades;

-- SUM Simon grades
SELECT SUM(grade) AS 'Simons grades sum' FROM grades WHERE studentID IN (SELECT sid FROM students WHERE name = 'Simon');

-- Print students all info in order by name
SELECT * FROM students
ORDER BY name;

-- what is biology id?
SELECT * FROM subjects WHERE name = 'biology';

-- print out grade in history for Simon
SELECT grade AS 'Simon grade for history' FROM grades WHERE studentID IN (SELECT sid FROM students WHERE name = 'Simon') AND subjectID IN (SELECT subid FROM subjects WHERE name = 'History');

-- name of students who have not yet taken any classes (who don't have any grades)/not hardcoding sid 4 and 5
SELECT name FROM students WHERE sid NOT IN (SELECT studentID from grades);

-- names of teachers that have not yet taught any class
SELECT name FROM teachers WHERE tid NOT IN (SELECT teacherID from grades);

-- name of teachers who have taught biology (sub sub query)
SELECT name FROM teachers WHERE tid IN (SELECT teacherID FROM grades WHERE subjectID IN(SELECT subid FROM subjects WHERE name = 'Biology'));
SELECT subid FROM subjects WHERE name = 'Biology';

-- Names of students who have  taken at least one class
SELECT name FROM students WHERE sid IN (SELECT studentID from grades);





