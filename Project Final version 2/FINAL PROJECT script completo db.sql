-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema netgloo_blog
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema netgloo_blog
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `netgloo_blog` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema dbshopcart
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dbshopcart
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbshopcart` DEFAULT CHARACTER SET utf8 ;
USE `netgloo_blog` ;

-- -----------------------------------------------------
-- Table `netgloo_blog`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `netgloo_blog`.`users` (
  `id` INT NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `netgloo_blog`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `netgloo_blog`.`product` (
  `idProduct` INT(11) NOT NULL,
  `Name` VARCHAR(45) NOT NULL,
  `Price` INT(11) NOT NULL,
  `Category` VARCHAR(45) NOT NULL,
  `id_product` INT(11) NOT NULL,
  PRIMARY KEY (`idProduct`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

USE `dbshopcart` ;

-- -----------------------------------------------------
-- Table `dbshopcart`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbshopcart`.`products` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `price` VARCHAR(45) NOT NULL,
  `category` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `dbshopcart`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbshopcart`.`users` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
