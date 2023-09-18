USE mydatabase;

-- Inserto into product
INSERT INTO product (price, name) VALUES (19.99, 'Prodotto A');
INSERT INTO product (price, name) VALUES (29.99, 'Prodotto B');
INSERT INTO product (price, name) VALUES (14.99, 'Prodotto C');
INSERT INTO product (price, name) VALUES (39.99, 'Prodotto D');

-- Inserto into customer
INSERT INTO customer (name) VALUES ('Customer 1');
INSERT INTO customer (name) VALUES ('Customer 2');

-- Inserto into phone
INSERT INTO phone (customer_id, number) VALUES (1, '348735492');
INSERT INTO phone (customer_id, number) VALUES (1, '34335492');
INSERT INTO phone (customer_id, number) VALUES (2, '348535492');
INSERT INTO phone (customer_id, number) VALUES (2, '228735492');

-- Inserto into email
INSERT INTO email (customer_id, email) VALUES (1, 'test1@gmail.com');
INSERT INTO email (customer_id, email) VALUES (1, 'test2@gmail.com');
INSERT INTO email (customer_id, email) VALUES (2, 'test3@gmail.com');
INSERT INTO email (customer_id, email) VALUES (2, 'test4@gmail.com');

-- Inserto into order
INSERT INTO order_info (customer_id, date) VALUES (1, '2023-09-16 12:00:00');
INSERT INTO order_info (customer_id, date) VALUES (1, '2023-09-17 16:00:00');
INSERT INTO order_info (customer_id, date) VALUES (2, '2023-09-20 10:00:00');

-- Inserto into order_product
INSERT INTO order_product (order_id, product_id, quantity) VALUES (1, 1, 3);
INSERT INTO order_product (order_id, product_id, quantity) VALUES (1, 2, 1);
INSERT INTO order_product (order_id, product_id, quantity) VALUES (2, 2, 1);
