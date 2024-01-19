USE mydatabase;

-- Inserisci in product
INSERT INTO product (price, name, width, height, depth, link) VALUES (399.99, 'Smartphone X', 2.8, 5.9, 0.3, "https://google.it");
INSERT INTO product (price, name, width, height, depth, link) VALUES (799.99, 'Tablet Pro', 9.7, 12.4, 0.4, "https://google.it");
INSERT INTO product (price, name, width, height, depth, link) VALUES (89.99, 'Wireless Earbuds', 1.2, 2.0, 1.5, "https://google.it");
INSERT INTO product (price, name, width, height, depth, link) VALUES (1299.99, 'High-Performance Laptop', 13.3, 15.6, 0.8, "https://google.it");


-- Insert into customer
INSERT INTO customer (name) VALUES ('John Doe');
INSERT INTO customer (name) VALUES ('Jane Smith');
INSERT INTO customer (name) VALUES ('Bob Johnson');

-- Insert into phone
INSERT INTO phone (customer_id, number) VALUES (1, '5551234567');
INSERT INTO phone (customer_id, number) VALUES (1, '5559876543');
INSERT INTO phone (customer_id, number) VALUES (2, '5555555555');
INSERT INTO phone (customer_id, number) VALUES (2, '5552223333');
INSERT INTO phone (customer_id, number) VALUES (3, '5557776666');

-- Insert into email
INSERT INTO email (customer_id, email) VALUES (1, 'john.doe@email.com');
INSERT INTO email (customer_id, email) VALUES (1, 'johndoe@gmail.com');
INSERT INTO email (customer_id, email) VALUES (2, 'jane.smith@email.com');
INSERT INTO email (customer_id, email) VALUES (3, 'bob.johnson@email.com');

-- Insert into order
INSERT INTO order_info (customer_id, date) VALUES (1, '2023-09-16 12:00:00');
INSERT INTO order_info (customer_id, date) VALUES (1, '2023-09-17 16:00:00');
INSERT INTO order_info (customer_id, date) VALUES (2, '2023-09-18 10:00:00');

-- Insert into order_product
INSERT INTO order_product (order_id, product_id, quantity) VALUES (1, 1, 2);
INSERT INTO order_product (order_id, product_id, quantity) VALUES (1, 3, 1);
INSERT INTO order_product (order_id, product_id, quantity) VALUES (2, 2, 1);
INSERT INTO order_product (order_id, product_id, quantity) VALUES (3, 4, 1);
