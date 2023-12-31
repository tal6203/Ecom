
CREATE TABLE BOOKS(
id INTEGER PRIMARY KEY AUTOINCREMENT,
 title TEXT UNIQUE,
 publish_year INTEGER NOT NULL,
 price INTEGER NOT NULL,
left_in_stock INTEGER NOT NULL DEFAULT 0,
book_image_src TEXT UNIQUE,
FOREIGN KEY(book_id) REFERENCES BOOKS(id)
);


CREATE TABLE ORDERS(
id INTEGER PRIMARY KEY AUTOINCREMENT,
book_id INTEGER NOT NULL,
how_many INTEGER NOT NULL default 0 ,
time_of_order TEXT CURRENT_TIMESTAMP,
customer_fname TEXT NOT NULL,
customer_lname TEXT NOT NULL,
credit_card TEXT NOT NULL,
FOREIGN KEY(book_id) REFERENCES BOOKS(id)
);

