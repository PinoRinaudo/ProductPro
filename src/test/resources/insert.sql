USE mydatabase;

-- Inserto into product
INSERT INTO product (price, name) VALUES (19.99, 'Prodotto A');
INSERT INTO product (price, name) VALUES (29.99, 'Prodotto B');
INSERT INTO product (price, name) VALUES (14.99, 'Prodotto C');
INSERT INTO product (price, name) VALUES (39.99, 'Prodotto D');


-- Inserto into customer
INSERT INTO customer (name) VALUES ('Customer 1');
INSERT INTO customer (name) VALUES ('Customer 2');

-- Inserto into order
INSERT INTO order_info (customer_id, date) VALUES (1, '2023-09-16 12:00:00');
INSERT INTO order_info (customer_id, date) VALUES (1, '2023-09-17 16:00:00');
INSERT INTO order_info (customer_id, date) VALUES (2, '2023-09-20 10:00:00');



-- Inserto into order_product
INSERT INTO order_product (order_id, product_id, quantity) VALUES (1, 1, 1);
INSERT INTO order_product (order_id, product_id, quantity) VALUES (1, 2, 1);
INSERT INTO order_product (order_id, product_id, quantity) VALUES (1, 2, 1);
