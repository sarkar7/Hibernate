/**
 * 
 * Database Server - Postgres
 * DB Name -educational
 * Schema Name - hibernate
 * 
 */

CREATE TABLE hibernate.project (
	project_id serial NOT NULL,
	project_name varchar(200) NOT NULL,
	owner_id numeric NOT NULL,
	owner_level_id numeric NOT NULL,
	status varchar(8) NOT NULL,
	CONSTRAINT project_pk PRIMARY KEY (project_id)
)
TABLESPACE pg_default
;

CREATE TABLE hibernate.employee (
	employee_id serial NOT NULL,
	employee_name varchar(200) NOT NULL,
	employee_age int NOT NULL,
	employee_role_id int NOT NULL,
	employee_address_id int NOT NULL,
	CONSTRAINT employee_pk PRIMARY KEY (employee_id)
)
TABLESPACE pg_default
;

CREATE TABLE hibernate.user_role (
	user_id serial NOT NULL,
	role_id int NOT NULL,
	status varchar(8) NOT NULL
)
TABLESPACE pg_default
;