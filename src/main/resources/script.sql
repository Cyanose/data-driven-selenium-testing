drop database if exists testData; 
create database testData;


use testData;

create table Users(
	username varchar(255),
	password varchar(255)
);

insert into Users (username,password) values ("mngr417670","bududus");
insert into Users (username,password) values ("mngr417491","gygAgun");
insert into Users (username,password) values ("mngr417671|","zArysUn");

select * from Users;
