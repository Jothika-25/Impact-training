create database Employee;
use Employee;

create table employee(emp_id INT PRIMARY KEY,emp_name varchar(25),emp_dept varchar(20),emp_salary decimal(15,2));

show tables;

select * from employee;

insert into employee VALUES
(1,'Jothika','Testing','50000'),
(2,'Lakshmi kanth','Front-end-Developer','55000'),
(3,'kavitha','Testing','52000'),
(4,'Jayashree','UI/UX designer','60000'),
(5,'Mouni','Developer','53000'),
(6,'Priya','Developer','50000');

use employee;
create table products(product_id INT PRIMARY KEY,product_name varchar(25),product_quantity int,product_price int);
insert into products VALUES
(11,'lap',6,40000),
(12,'mobile',100,25000),
(13,'tab',20,52000),
(14,'charger',25,60000);
select * from products;


-- Procedure
DELIMITER $$

CREATE PROCEDURE getDetails(IN id INT)
BEGIN
		SELECT * FROM products WHERE product_id=id;
END $$

DELIMITER ;
-- DROP PROCEDURE getDetails
CALL getDetails(12);


-- Functions

-- drop function if exists getProductCountByPrice;
DELIMITER $$
CREATE FUNCTION getProductCountByPrice(price INT) RETURNS INT
deterministic
BEGIN
DECLARE product_count int;
    select count(*) into product_count from products where product_price>price;
    return product_count;
END $$
DELIMITER ;

select getProductCountByPrice(1000) as productCount;


DELIMITER $$
 
CREATE TRIGGER after_employee_insert
AFTER INSERT ON employee
FOR EACH ROW 
BEGIN 
Declare row_count int;
    select count(*) into row_count from employee;
--    SIGNAL SQLSTATE '01000' SET MESSAGE_TEXT = CONCAT('Row count in employee table ', row_count);

     select concat('Total employee :',row_count) as message;
 
 end $$
DELIMITER ;

insert into employee (emp_id,emp_name,emp_dept,emp_salary) values (7,'lk','designer',70000);

insert into employee (emp_id,emp_name,emp_dept,emp_salary,doj) values (9,'lk','designer',70000,'2023-08-02');
CREATE VIEW employee_view AS 
SELECT * FROM employee;
SELECT * FROM employee_view;


