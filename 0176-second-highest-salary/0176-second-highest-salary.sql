# Write your MySQL query statement below

select MAX(salary) as SecondHighestSalary from Employee where salary NOT IN (select MAX(salary) from Employee);
