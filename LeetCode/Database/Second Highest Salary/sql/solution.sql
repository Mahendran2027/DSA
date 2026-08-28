# Write your MySQL query statement belowSELE
SELECT MAX(salary) as SecondHighestSalary from Employee where salary<(SELECT MAX(salary)from Employee) ;