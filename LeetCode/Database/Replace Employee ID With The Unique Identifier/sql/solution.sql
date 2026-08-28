# Write your MySQL query statement below
SELECT e.unique_id as unique_id,d.name as name from EmployeeUNI e right join Employees d 
ON e.id=d.id;