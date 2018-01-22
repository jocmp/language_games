CREATE table reservations (
	boat_id int NOT NULL,
	sailor_id int NOT NULL,
	for_date date NOT NULL,
	on_date date NOT NULL,
	PRIMARY KEY (boat_id, sailor_id),
	FOREIGN KEY (boat_id) REFERENCES boats,
	FOREIGN KEY (sailor_id) REFERENCES sailors
);