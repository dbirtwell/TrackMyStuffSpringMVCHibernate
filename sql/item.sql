-- create a test database testItems
CREATE DATABASE testtrackmystuff;
USE testtrackmystuff;

DROP TABLE IF EXISTS item;
CREATE TABLE item
(
  id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  itemName varchar(100) NOT NULL,
  itemType varchar(100) NOT NULL,
  itemLocation varchar(100), 
  itemDescription varchar(100)       
 );
 