CREATE SCHEMA `companyDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_turkish_ci ;

CREATE TABLE `companyDB`.`Personnel` (
  `idPersonnel` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `surname` VARCHAR(45) NULL,
  `experience` VARCHAR(2) NULL,
  PRIMARY KEY (`idPersonnel`));

select * from companyDB.Personnel;

insert into companyDB.Personnel (idPersonnel, name, surname, experience) values (1, 'DenemeAd', 'DenemeSoyad', '4');