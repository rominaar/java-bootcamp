CREATE database highschool;
use highschool;

CREATE TABLE `Student` (
`idStudent` INT NOT NULL AUTO_INCREMENT,
`firstName` VARCHAR(45) NOT NULL,
`lastName` VARCHAR(45) NOT NULL,
`birthDay` DATE NOT NULL,
PRIMARY KEY (`idStudent`));

CREATE TABLE `Teacher` (
`idTeacher` INT NOT NULL AUTO_INCREMENT,
`firstName` VARCHAR(45) NOT NULL,
`lastName` VARCHAR(45) NOT NULL,
`birthDay` VARCHAR(45) NOT NULL,
PRIMARY KEY (`idTeacher`));

CREATE TABLE `Course` (
`idCourse` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(45) NOT NULL,
`hoursPerWeek` INT NULL,
`idTeacher` INT NOT NULL,
PRIMARY KEY (`idCourse`));


CREATE TABLE `Scheduler` (
`idScheduler` INT NOT NULL,
`day` DATE NOT NULL,
`startTime` TIME NOT NULL,
`endTime` TIME NOT NULL,
`idCourse` INT NOT NULL,
PRIMARY KEY (`idScheduler`, `idCourse`),
INDEX `fk_Scheduler_Course1_idx` (`idCourse` ASC),
CONSTRAINT `fk_Scheduler_Course1`
FOREIGN KEY (`idCourse`)
REFERENCES `highschool`.`Course` (`idCourse`)
ON DELETE NO ACTION
ON UPDATE NO ACTION);

CREATE TABLE `Assists` (
`idCourse` INT NOT NULL,
`idStudent` INT NOT NULL,
`partialNote1` FLOAT NULL,
`partialNote2` FLOAT NULL,
`partialNote3` FLOAT NULL,
`finalNote` FLOAT NULL,
PRIMARY KEY (`idCourse`, `idStudent`),
INDEX `fk_Course_has_Student_Student1_idx` (`idStudent` ASC),
INDEX `fk_Course_has_Student_Course1_idx` (`idCourse` ASC),
CONSTRAINT `fk_Course_has_Student_Course1`
FOREIGN KEY (`idCourse`)
REFERENCES `highschool`.`Course` (`idCourse`)
ON DELETE NO ACTION
ON UPDATE NO ACTION,
CONSTRAINT `fk_Course_has_Student_Student1`
FOREIGN KEY (`idStudent`)
REFERENCES `highschool`.`Student` (`idStudent`)
ON DELETE NO ACTION
ON UPDATE NO ACTION);


-- Insert information for 3 teachers, 5 courses and 20 students per course

START TRANSACTION;
USE `highschool`;
-- insert teachers
INSERT INTO `highschool`.`Teacher` (`idTeacher`, `firstName`, `lastName`, `birthDay`) VALUES (1, 'Lucas', 'Mussi', '1987-10-10');
INSERT INTO `highschool`.`Teacher` (`idTeacher`, `firstName`, `lastName`, `birthDay`) VALUES (2, 'Romina', 'Acuña', '1989-11-24');
INSERT INTO `highschool`.`Teacher` (`idTeacher`, `firstName`, `lastName`, `birthDay`) VALUES (3, 'Juan', 'Diaz', '1980-11-12');

select * from teacher;


-- insert students
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (4, 'Juan', 'Perez', '1992-03-05');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (5, 'Pedro', 'Garcia', '1992-05-12');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (6, 'Pablo', 'Gatica', '1993-12-20');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (7, 'Gabriel', 'Parodi', '1988-10-30');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (8, 'Jorge', 'Bravo', '1988-10-30');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (9, 'Sofia', 'Alderete', '1992-03-05');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (10, 'Agustin', 'Conejo', '1988-10-30');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (11, 'Esteban', 'Volentini', '1990-04-05');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (12, 'Daniel', 'Cohen', '1993-12-20');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (13, 'Nicolas', 'Ragone', '1990-04-05');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (14, 'Juan Pablo', 'Abuin', '1990-04-05');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (15, 'Alfredo', 'Hidalgo', '1992-05-12');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (16, 'Victor', 'Hardoy', '1990-04-05');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (17, 'Ruben', 'Rosino', '1994-09-15');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (18, 'Carla', 'Cinquemani', '1992-03-05');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (19, 'Alejandro', 'Ponce', '1994-09-15');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (20, 'Micaela', 'Acuña', '1994-10-11');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (21, 'Patricia', 'Sosa', '1992-05-12');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (22, 'Mercedes ', 'Sosa', '1994-09-15');
INSERT INTO `highschool`.`Student` (`idStudent`, `firstName`, `lastName`, `birthDay`) VALUES (23, 'Romina', 'Nahas', '1993-12-20');

select * from student;



-- Insert `Course`

START TRANSACTION;
USE `highschool`;
INSERT INTO `highschool`.`Course` (`idCourse`, `name`, `hoursPerWeek`, `idTeacher`) VALUES (1, 'Cloud Computing', NULL, 3);
INSERT INTO `highschool`.`Course` (`idCourse`, `name`, `hoursPerWeek`, `idTeacher`) VALUES (2, 'DB Laboratory', NULL, 3);
INSERT INTO `highschool`.`Course` (`idCourse`, `name`, `hoursPerWeek`, `idTeacher`) VALUES (3, 'Computer Arquitecture', NULL, 2);
INSERT INTO `highschool`.`Course` (`idCourse`, `name`, `hoursPerWeek`, `idTeacher`) VALUES (4, 'Embebed Systems', NULL, 2);
INSERT INTO `highschool`.`Course` (`idCourse`, `name`, `hoursPerWeek`, `idTeacher`) VALUES (5, 'Java Bootcamp', NULL, 1);

select * from course;


-- Insert `Assists`

INSERT INTO `highschool`.`Assists` (`idCourse`,`idStudent`,`partialNote1`,`partialNote2`,`partialNote3`,`finalNote`) VALUES (1,4,80.0,70.0,90.0,80.0);
INSERT INTO `highschool`.`Assists` (`idCourse`,`idStudent`,`partialNote1`,`partialNote2`,`partialNote3`,`finalNote`) VALUES (1,5,90.0,80.0,100.0,90.0);
INSERT INTO `highschool`.`Assists` (`idCourse`,`idStudent`,`partialNote1`,`partialNote2`,`partialNote3`,`finalNote`) VALUES (1,6,40.0,10.0,70.0,70.0);
INSERT INTO `highschool`.`Assists` (`idCourse`,`idStudent`,`partialNote1`,`partialNote2`,`partialNote3`,`finalNote`) VALUES (1,7,70.0,50.0,80.0,60.0);
INSERT INTO `highschool`.`Assists` (`idCourse`,`idStudent`,`partialNote1`,`partialNote2`,`partialNote3`,`finalNote`) VALUES (1,8,40.0,40.0,40.0,40.0);
select * from assists;





-- Insert `Scheduler`

insert into `highschool`.`scheduler`(`idScheduler`,`day`,`startTime`,`endTime`,`idCourse`) values(1,"2015-01-20","10:00","12:00",1);
insert into `highschool`.`scheduler`(`idScheduler`,`day`,`startTime`,`endTime`,`idCourse`) values(2,"2015-01-21","12:00","13:00",2);
insert into `highschool`.`scheduler`(`idScheduler`,`day`,`startTime`,`endTime`,`idCourse`) values(3,"2015-01-22","8:00","10:00",3);
insert into `highschool`.`scheduler`(`idScheduler`,`day`,`startTime`,`endTime`,`idCourse`) values(4,"2015-01-23","14:00","16:00",4);

select * from scheduler;

