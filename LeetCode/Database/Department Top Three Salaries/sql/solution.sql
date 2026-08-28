# Write your MySQL query statement below
SELECT d.name as Department ,e.name  as Employee,e.salary from Employee e INNER JOIN Department d
ON e.departmentID=d.id where 3>(SELECT COUNT(DISTINCT e1.salary)from Employee e1 where e1.departmentId=e.departmentId AND e1.salary>e.salary);