drop database IF EXISTS qtztest;
create database qtztest;
GRANT ALL ON qtztest.* TO 'qtztest'@'localhost' IDENTIFIED BY 'qtztest123';
use qtztest;
create table t_qtz(
	id int(11) primary key auto_increment,
	random varchar(255),
	addtime varchar(255)
);

