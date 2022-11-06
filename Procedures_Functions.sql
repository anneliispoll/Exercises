DELIMITER //

CREATE PROCEDURE GetAllCountriesAndState()
BEGIN
	SELECT * FROM country LEFT JOIN states ON country.id = states.countryID
	UNION
	SELECT * FROM country RIGHT JOIN states ON country.id = states.countryID;
END
//DELIMITER ;

CALL GetAllCountriesAndState();

-- Function

DELIMITER //

CREATE FUNCTION GradeExplained(grade INT)
RETURNS VARCHAR(20)
DETERMINISTIC
BEGIN
	DECLARE studentGrade VARCHAR(20);
    IF grade > 9 THEN
		SET studentGrade = 'Super';
    ELSEIF (grade >= 8 AND grade <= 9) THEN
		SET studentGrade = 'Very Good';
	ELSEIF grade >= 5 THEN
		SET studentGrade = 'Good';
	ELSEIF grade < 5 THEN
		SET studentGrade = 'Not that good';
	END IF;
    
    -- Returing value
    RETURN (studentGrade);
END
// DELIMITER ;

SELECT grade, GradeExplained(grade) FROM grades WHERE subjectID = 1 AND studentID = 1;
