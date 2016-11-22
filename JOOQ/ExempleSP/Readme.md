start a MySQL docker :
	
	docker run -p 3307:3306 --name mysqlJOOQ -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest

create db and table (with ay MYSQL tools like MySQL workbench) :

	CREATE DATABASE `library`;

	USE `library`;

	DROP TABLE IF EXISTS author;

	CREATE TABLE `author` (
	  `id` int NOT NULL,
	  `first_name` varchar(255) DEFAULT NULL,
	  `last_name` varchar(255) DEFAULT NULL,
	  PRIMARY KEY (`id`)
	);

	INSERT INTO `author` VALUES (1, 'JEAN', 'DUPOND');
	INSERT INTO `author` VALUES (2, 'JOHN', 'SMITH');
	INSERT INTO `author` VALUES (3, 'Stephen', 'PITON');

	DROP TABLE IF EXISTS emp;

	CREATE TABLE emp (
	  empno decimal(4,0) NOT NULL,
	  ename varchar(10) default NULL,
	  job varchar(9) default NULL,
	  mgr decimal(4,0) default NULL,
	  hiredate date default NULL,
	  sal decimal(7,2) default NULL,
	  comm decimal(7,2) default NULL,
	  deptno decimal(2,0) default NULL
	);

	DROP TABLE IF EXISTS dept;

	CREATE TABLE dept (
	  deptno decimal(2,0) default NULL,
	  dname varchar(14) default NULL,
	  loc varchar(13) default NULL
	);

	INSERT INTO emp VALUES ('7369','SMITH','CLERK','7902','1980-12-17','800.00',NULL,'20');
	INSERT INTO emp VALUES ('7499','ALLEN','SALESMAN','7698','1981-02-20','1600.00','300.00','30');
	INSERT INTO emp VALUES ('7521','WARD','SALESMAN','7698','1981-02-22','1250.00','500.00','30');
	INSERT INTO emp VALUES ('7566','JONES','MANAGER','7839','1981-04-02','2975.00',NULL,'20');
	INSERT INTO emp VALUES ('7654','MARTIN','SALESMAN','7698','1981-09-28','1250.00','1400.00','30');
	INSERT INTO emp VALUES ('7698','BLAKE','MANAGER','7839','1981-05-01','2850.00',NULL,'30');
	INSERT INTO emp VALUES ('7782','CLARK','MANAGER','7839','1981-06-09','2450.00',NULL,'10');
	INSERT INTO emp VALUES ('7788','SCOTT','ANALYST','7566','1982-12-09','3000.00',NULL,'20');
	INSERT INTO emp VALUES ('7839','KING','PRESIDENT',NULL,'1981-11-17','5000.00',NULL,'10');
	INSERT INTO emp VALUES ('7844','TURNER','SALESMAN','7698','1981-09-08','1500.00','0.00','30');
	INSERT INTO emp VALUES ('7876','ADAMS','CLERK','7788','1983-01-12','1100.00',NULL,'20');
	INSERT INTO emp VALUES ('7900','JAMES','CLERK','7698','1981-12-03','950.00',NULL,'30');
	INSERT INTO emp VALUES ('7902','FORD','ANALYST','7566','1981-12-03','3000.00',NULL,'20');
	INSERT INTO emp VALUES ('7934','MILLER','CLERK','7782','1982-01-23','1300.00',NULL,'10');

	INSERT INTO dept VALUES ('10','ACCOUNTING','NEW YORK');
	INSERT INTO dept VALUES ('20','RESEARCH','DALLAS');
	INSERT INTO dept VALUES ('30','SALES','CHICAGO');
	INSERT INTO dept VALUES ('40','OPERATIONS','BOSTON');

To regenerate JOOQ files :

	run "org.jooq.util.GenerationTool" with parameters : "./src/main/resources/library.xml"

To run the exemple :

	IDM.JOOQ.App

