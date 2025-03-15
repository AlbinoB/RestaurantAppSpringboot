
-- Create users table
CREATE TABLE users (
    username VARCHAR2(50) NOT NULL PRIMARY KEY,
    password VARCHAR2(100) NOT NULL,
    enabled NUMBER(1) NOT NULL
);

-- Create authorities table
CREATE TABLE authorities (
    username VARCHAR2(50) NOT NULL,
    authority VARCHAR2(50) NOT NULL,
    CONSTRAINT fk_authorities_users FOREIGN KEY (username) REFERENCES users(username)
);

-- Insert example user
INSERT INTO users (username, password, enabled) VALUES ('admin', '{bcrypt}$2a$10$5s6dPYXwMjTr.o7R/NDk2eiGZbTTYn06EAuTAK0OzTP8KzC3UqXH6', 1);

-- Assign roles to the example user
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');


INSERT INTO users (username, password, enabled) VALUES ('user', '{bcrypt}$2a$10$ojCmg9fEUNktPGdsJn5EBOASSw.subIl0jELy/rRdjcMNwi7bAvhC', 1);

-- Assign roles to the example user
INSERT INTO authorities (username, authority) VALUES ('user', 'ROLE_USER');