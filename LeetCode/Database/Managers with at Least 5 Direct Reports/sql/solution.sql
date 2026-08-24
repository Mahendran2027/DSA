# Write your MySQL query statement below
SELECT name from Employee
where id IN(Select managerId from Employee Group By managerId Having count(*)>=5);
