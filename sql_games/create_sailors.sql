CREATE TABLE sailors (
	sailor_id int PRIMARY KEY,
	name varchar(80),
	rating int,
	age int,
	trainee int REFERENCES sailors ON DELETE SET NULL
);