-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema shoppingcart
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema shoppingcart
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `shoppingcart` DEFAULT CHARACTER SET utf8 ;
USE `shoppingcart` ;

-- -----------------------------------------------------
-- Table `shoppingcart`.`customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `shoppingcart`.`customer` (
  `idCustomer` INT(11) NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  `LastName` VARCHAR(45) NOT NULL,
  `DateOfBirth` VARCHAR(45) NOT NULL,
  `Username` VARCHAR(45) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  `idCart` INT(11) NOT NULL,
  PRIMARY KEY (`idCustomer`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `shoppingcart`.`cart`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `shoppingcart`.`cart` (
  `idCart` INT(11) NOT NULL AUTO_INCREMENT,
  `Total` INT(11) NOT NULL,
  `idProductPack` INT(11) NOT NULL,
  `idUser` INT(11) NOT NULL,
  PRIMARY KEY (`idCart`, `idUser`),
  INDEX `fk_cart_user1_idx` (`idUser` ASC),
  CONSTRAINT `fk_cart_user1`
    FOREIGN KEY (`idUser`)
    REFERENCES `shoppingcart`.`customer` (`idCustomer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `shoppingcart`.`payment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `shoppingcart`.`payment` (
  `idPayment` INT(11) NOT NULL AUTO_INCREMENT,
  `Type` VARCHAR(45) NOT NULL,
  `Total` INT(11) NOT NULL,
  `idCart` INT(11) NOT NULL,
  `idUser` INT NULL,
  PRIMARY KEY (`idPayment`),
  INDEX `fk_payment_cart1_idx` (`idCart` ASC),
  INDEX `fk_payment_user1_idx` (`idUser` ASC),
  CONSTRAINT `fk_payment_cart1`
    FOREIGN KEY (`idCart`)
    REFERENCES `shoppingcart`.`cart` (`idCart`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_payment_user1`
    FOREIGN KEY (`idUser`)
    REFERENCES `shoppingcart`.`customer` (`idCustomer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `shoppingcart`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `shoppingcart`.`product` (
  `idProduct` INT(11) NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  `Price` INT(11) NOT NULL,
  `Category` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idProduct`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `shoppingcart`.`productpack`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `shoppingcart`.`productpack` (
  `idProductPack` INT(11) NOT NULL AUTO_INCREMENT,
  `Quantity` INT(11) NOT NULL,
  `idProduct` INT(11) NOT NULL,
  `idCart` INT(11) NOT NULL,
  `Subtotal` INT NOT NULL,
  PRIMARY KEY (`idProductPack`, `idProduct`, `idCart`),
  INDEX `fk_productpack_product_idx` (`idProduct` ASC),
  INDEX `fk_productpack_cart1_idx` (`idCart` ASC),
  CONSTRAINT `fk_productpack_product`
    FOREIGN KEY (`idProduct`)
    REFERENCES `shoppingcart`.`product` (`idProduct`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_productpack_cart1`
    FOREIGN KEY (`idCart`)
    REFERENCES `shoppingcart`.`cart` (`idCart`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
