CREATE TABLE book (
    id int auto_increment,
    title varchar(255) NOT NULL,
    pages int NOT NULL,
    author varchar(255) NOT NULL,
    price int NOT NULL,
    PRIMARY KEY (id)
    );

CREATE TABLE PRODUCT_ORDERS(
    id int auto_increment,
    product_name varchar(255) NOT NULL,
    customer_name varchar(255) NOT NULL,
    order_cost int NOT NULL,
    items int NOT NULL,
    PRIMARY KEY (id)
);
--insert into product(id,product_name,customer_name,order_cost,items) VALUES(null,'chair','tal',50,1);
--    insert into book(id,title,pages,author) VALUES (null,'Spring boot in Action',471,'Craig Walls',150);