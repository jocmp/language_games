CREATE TABLE boats (
	boat_id int PRIMARY KEY,
	name varchar(80),
	color varchar(80),
	rate int,
	length int,
	log_keeper int REFERENCES sailors (sailor_id) ON DELETE SET NULL
);