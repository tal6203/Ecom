DROP TABLE contacts


CREATE TABLE contacts(
 ID INT PRIMARY KEY NOT NULL,
 first_name TEXT NOT NULL,
 last_name TEXT NOT NULL,
 email TEXT UNIQUE,
 phone TEXT UNIQUE,
 time_of_creation TEXT CURRENT_TIMESTAMP
);
