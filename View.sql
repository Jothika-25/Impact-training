use employee;

alter table employee add doj date;

select * from employee;

update employee set doj='2001-12-05' where emp_id=1;
update employee set doj='2002-08-02' where emp_id=2;
update employee set doj='2010-12-19' where emp_id=3;
update employee set doj='2020-10-30' where emp_id=4;
update employee set doj='2023-11-02' where emp_id=5;
update employee set doj='2015-12-05' where emp_id=6;
update employee set doj='2012-09-10' where emp_id=7;
update employee set doj='2002-10-10' where emp_id=8;

alter table products add expiry_date date;
update products set expiry_date='2024-12-05' where product_id=11;
update products set  expiry_date='2024-12-25' where product_id=12;
update products set  expiry_date='2024-12-19' where product_id=13;
update products set  expiry_date='2024-12-30' where product_id=14;

select * from products;

create view emp_details as 
select * from employee order by extract(year from doj) asc limit 1;

select* from emp_details;

delimiter $$

create procedure emp_details(in doj date)
BEGIN
declare emp_year int;
set emp_year := YEAR(doj);
select * from employee where year(doj) = emp_year;
end $$

delimiter ;
drop procedure emp_details;
call emp_details('2001-12-05');
