CREATE TABLE sample.user_roles
(
    user_name varchar(15) NOT NULL,
    role_name varchar(15) NOT NULL,
    CONSTRAINT `PRIMARY` PRIMARY KEY (user_name, role_name)
);
INSERT INTO sample.user_roles (user_name, role_name) VALUES ('admin', 'administrator');
INSERT INTO sample.user_roles (user_name, role_name) VALUES ('ruser', 'registeredUser');
CREATE TABLE sample.users
(
    id int(11) NOT NULL AUTO_INCREMENT,
    first_name varchar(25),
    last_name varchar(30),
    date_of_birth date,
    user_name varchar(15) NOT NULL,
    user_pass varchar(15) NOT NULL,
    CONSTRAINT `PRIMARY` PRIMARY KEY (id, user_name)
);
INSERT INTO sample.users (first_name, last_name, date_of_birth, user_name, user_pass) VALUES ('Joe', 'Coyne', '1964-04-01', '', '');
INSERT INTO sample.users (first_name, last_name, date_of_birth, user_name, user_pass) VALUES ('Fred', 'Hensen', '1988-05-08', '', '');
INSERT INTO sample.users (first_name, last_name, date_of_birth, user_name, user_pass) VALUES ('Barney', 'Curry', '1947-11-11', '', '');
INSERT INTO sample.users (first_name, last_name, date_of_birth, user_name, user_pass) VALUES ('Karen', 'Mack', '1986-07-08', '', '');
INSERT INTO sample.users (first_name, last_name, date_of_birth, user_name, user_pass) VALUES ('Dianne', 'Klein', '1991-09-22', '', '');
INSERT INTO sample.users (first_name, last_name, date_of_birth, user_name, user_pass) VALUES ('Dawn', 'Tillman', '1979-08-30', '', '');
INSERT INTO sample.users (first_name, last_name, date_of_birth, user_name, user_pass) VALUES ('Kyle', 'Vang', '1985-03-23', '', '');
INSERT INTO sample.users (first_name, last_name, date_of_birth, user_name, user_pass) VALUES ('adminF', 'adminL', '1111-01-01', 'admin', 'admin');
INSERT INTO sample.users (first_name, last_name, date_of_birth, user_name, user_pass) VALUES ('ruserF', 'ruserL', '1990-03-12', 'ruser', 'ruser');