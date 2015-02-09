-- Stores procedures
USE `highschool` ;

DELIMITER $$

DROP PROCEDURE IF EXISTS listCourse $$
CREATE PROCEDURE listCourse(`Course_Name` VARCHAR(45))
SALIR:BEGIN
	DECLARE messege VARCHAR(100);
	START TRANSACTION;
	SELECT c.`name` ,t.lastName, t.firstName, s.lastName, s.firstName
	FROM Student s JOIN Assists a ON s.idStudent = a.idStudent
	JOIN	Course c ON a.idCourse = c.idCourse
	JOIN Teacher t ON t.idTeacher = c.idTeacher
	WHERE c.`name` = `Course_Name`
	ORDER BY 4 ASC;
	COMMIT;
END$$

call listCourse ('Cloud Computing');

DELIMITER $$

CREATE PROCEDURE listFinalNotes_StudentLastName(`Student Last Name` VARCHAR(45))
SALIR:BEGIN
DECLARE messege VARCHAR(100);
SELECT c.`name`, a.finalNote, s.firstName , s.lastName
FROM Student s JOIN Assists a ON s.idStudent = a.idStudent
JOIN Course c ON c.idCourse = a.idCourse
WHERE s.lastName = `Student Last Name`
ORDER BY 2,1 DESC;
COMMIT;
END$$
DELIMITER $$


call listFinalNotes_StudentLastName('Acuña');
